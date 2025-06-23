package org.lessons.java.boolz.ric.lime.actors.characters.classes;

import java.util.List;

import org.lessons.java.boolz.ric.lime.actors.characters.abstracts.AbstractCharacter;
import org.lessons.java.boolz.ric.lime.actors.resources.abstracts.AbstractResource;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class PlayableCharacter extends AbstractCharacter {
    private int capacity;
    private List<AbstractResource> inventory;
    
    public PlayableCharacter(TextureRegion region, int lifePoints, String name, float strength, float stamina, float speed, float jumpHeight, int capacity, List<AbstractResource> inventory) {
        super(region, lifePoints, name, strength, stamina, speed, jumpHeight);
        this.capacity = capacity;
        this.inventory = inventory;

        // this.addListener(new InputListener() {
        //     public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
        //         System.out.println("down");
        //         return true;
        //     }
            
        //     public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
        //         System.out.println("up");
        //     }
        // });
    }   

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<AbstractResource> getInventory() {
        return this.inventory;
    }

    public void setInventory(List<AbstractResource> inventory) {
        this.inventory = inventory;
    }
    
    public void destroyTile(){}
}
