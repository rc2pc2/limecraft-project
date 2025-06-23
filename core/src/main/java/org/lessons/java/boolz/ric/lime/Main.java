package org.lessons.java.boolz.ric.lime;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
   
    private Stage stage;

    @Override
    public void create() {
	    stage = new Stage(new ExtendViewport(1920, 1080));
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render() {
        float delta = Gdx.graphics.getDeltaTime();
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(delta);
        stage.draw();

    }

    @Override
    public void resize(int width, int height) {
        stage.getViewport().update(width, height, true);
    }

    @Override
    public void dispose() {
        stage.dispose();
    }


    // private void input(){
    //     // float timeDelta = Gdx.graphics.getDeltaTime();

    //     // if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D) ) {
    //     //     playerSprite.translateX(playerMovementSpeed * timeDelta);
    //     // } else if (Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A) ) {
    //     //     playerSprite.translateX( -playerMovementSpeed * timeDelta);
    //     // }

    //     // // if (Gdx.input.isTouched()) { // If the user has clicked or tapped the screen
    //     // //     // todo:React to the player touching the screen
    //     // // }
    // }

    // private void logic(){
    //     // float timeDelta = Gdx.graphics.getDeltaTime();
    //     // Random rand = new Random(); 
    //     // dropTimer += timeDelta; // aggiorno il mio timer 

    //     // playerSprite.setX(MathUtils.clamp(playerSprite.getX(), 0, 
    //     //     viewport.getWorldWidth() - playerSprite.getWidth()));
        


    //     // float shakingValue = rand.nextFloat(-.5f, .5f);
        
    //     // for (int i = 15; i < terrainElements.size(); i++) {
    //     //     terrainElements.get(i).translateX( shakingValue * 2 * timeDelta);
    //     // }

    // }

    // private void draw(){

    // }

    // private void createTerrainSquare(float x, float y, Texture texture) {
    //     // create local variables for convenience
    //     float dropWidth = 1;
    //     float dropHeight = 1;
    //     float worldWidth = viewport.getWorldWidth();
    //     float worldHeight = viewport.getWorldHeight();
        
    //     // create the drop sprite
    //     Sprite dropSprite = new Sprite(texture);
    //     dropSprite.setSize(dropWidth, dropHeight);
    //     dropSprite.setX(x);
    //     dropSprite.setY(y);

    //     terrainElements.add(dropSprite); // Add it to the list
    // }
}
