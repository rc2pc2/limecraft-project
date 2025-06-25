package org.lessons.java.boolz.ric.lime;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
   
    private Stage stage;
    private Texture backgroundTexture;
    private Texture terrainStartTexture;
    private Texture terrainTexture;
    private Texture terrainEndTexture;
    private Texture playerTexture;
    private Sprite playerSprite;
    private Rectangle playerRectangle;
    private List<Sprite> terrainElements;
    private List<Rectangle> terrainRectangles;
    
    SpriteBatch spriteBatch;
    FitViewport viewport;
    
    float playerMovementSpeed = 5f;
    float gameTimer;

    @Override
    public void create() {
	    // stage = new Stage(new ExtendViewport(1920, 1080));
        this.spriteBatch = new SpriteBatch();
        this.viewport = new FitViewport(20, 10);
        this.backgroundTexture = new Texture("bg/sky-clouds.jpg");
        this.terrainStartTexture = new Texture("terrain/grass-left.png");
        this.terrainTexture = new Texture("terrain/grass-central.png");
        this.terrainEndTexture = new Texture("terrain/grass-right.png");
        this.playerTexture = new Texture("pg/new/knight.png");
        this.playerSprite = new Sprite(playerTexture); 
        this.playerSprite.setSize(1, 1);
        this.terrainElements = new ArrayList<>();
        this.terrainRectangles = new ArrayList<>();
        this.playerRectangle = new Rectangle();

        // Gdx.input.setInputProcessor(stage);

         for (int i = 0; i < 10; i++) {
            Sprite terrainComponent = createTerrainSquare(i, 0, terrainTexture);
            
            if ( i == 0 ){
                terrainComponent = createTerrainSquare(i, 0, terrainStartTexture);
            } else if (i == 9) {
                terrainComponent = createTerrainSquare(i, 0, terrainEndTexture);
            } else {
                terrainComponent = createTerrainSquare(i, 0, terrainTexture);
            }
            terrainElements.add(terrainComponent);
            terrainRectangles.add(new Rectangle(terrainComponent.getX(), terrainComponent.getY(), terrainComponent.getWidth(), terrainComponent.getHeight()));
        }
        for (int i = 14; i < 18; i++) {
            Sprite terrainComponent = createTerrainSquare(i, 0, terrainTexture);
            
            if ( i == 14 ){
                terrainComponent = createTerrainSquare(i, 0, terrainStartTexture);
            } else if (i == 17) {
                terrainComponent = createTerrainSquare(i, 0, terrainEndTexture);
            } else {
                terrainComponent = createTerrainSquare(i, 0, terrainTexture);
            }

            terrainElements.add(terrainComponent);
            terrainRectangles.add(new Rectangle(terrainComponent.getX(), terrainComponent.getY(), terrainComponent.getWidth(), terrainComponent.getHeight()));
        }
    }

    @Override
    public void render() {
        input();
        logic();
        draw();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true); // true centers the camera
    }

    @Override
    public void dispose() {
        // stage.dispose();
    }


    private void input(){
        float timeDelta = Gdx.graphics.getDeltaTime();
        float speed = 2f;

        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D) ) {
            playerSprite.translateX(speed * timeDelta);
        } else if (Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A) ) {
            playerSprite.translateX( -speed * timeDelta);
        }

        // if (Gdx.input.isTouched()) { // If the user has clicked or tapped the screen
        //     // todo:React to the player touching the screen
        // }
    }

    private void logic(){
        float timeDelta = Gdx.graphics.getDeltaTime();
        Random rand = new Random(); 
        this.gameTimer += timeDelta; // aggiorno il mio timer 
        float worldWidth = viewport.getWorldWidth();
        float worldHeight = viewport.getWorldHeight();

        playerRectangle.set(playerSprite.getX(), playerSprite.getY(), playerSprite.getWidth(), playerSprite.getHeight());
        playerSprite.setX(MathUtils.clamp(playerSprite.getX(), 0, viewport.getWorldWidth() - playerSprite.getWidth()));

        float shakingValue = rand.nextFloat(-.5f, .5f);
        
        for (int i = 10; i < terrainElements.size(); i++) {
            terrainElements.get(i).translateX( shakingValue * 2 * timeDelta);
            terrainRectangles.get(i).setX(terrainElements.get(i).getX());
        }

        if (!playerRectangle.overlaps(terrainRectangles.get(0))) {
            System.out.println("OVERLAP");
            playerSprite.translateY(-5);
        } else {
            System.out.println("NOT OVERLAP");
        }
    }

    private void draw(){
        ScreenUtils.clear(Color.BLACK);
        viewport.apply();
        
        float worldWidth = viewport.getWorldWidth();
        float worldHeight = viewport.getWorldHeight();

        spriteBatch.setProjectionMatrix(viewport.getCamera().combined);
        spriteBatch.begin();


        
        spriteBatch.draw(backgroundTexture, 0, 0, worldWidth, worldHeight); // draw the background
        for (Sprite sprite : terrainElements) {
            spriteBatch.draw(sprite, sprite.getX(), sprite.getY(), 1,1);
        }

        spriteBatch.draw(playerSprite, playerSprite.getX(), 1,1 , 1); // draw the bucket with width/height of 1 meter

        spriteBatch.end();
    }

    private Sprite createTerrainSquare(float x, float y, Texture texture) {
        // create local variables for convenience
        float dropWidth = 1;
        float dropHeight = 1;

        // create the drop sprite
        Sprite dropSprite = new Sprite(texture);
        dropSprite.setSize(dropWidth, dropHeight);
        dropSprite.setX(x);
        dropSprite.setY(y);

        return dropSprite; // Add it to the list
    }
}
