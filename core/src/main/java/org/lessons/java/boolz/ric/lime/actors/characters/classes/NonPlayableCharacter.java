package org.lessons.java.boolz.ric.lime.actors.characters.classes;

import org.lessons.java.boolz.ric.lime.actors.characters.abstracts.AbstractCharacter;
import org.lessons.java.boolz.ric.lime.actors.resources.abstracts.AbstractResource;
import org.lessons.java.boolz.ric.lime.actors.resources.classes.NaturalResouce;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class NonPlayableCharacter extends AbstractCharacter{

    public NonPlayableCharacter(TextureRegion region, int lifePoints, String name, float strength, float stamina, float speed, float jumpHeight) {
        super(region, lifePoints, name, strength, stamina, speed, jumpHeight);
    }

    public AbstractResource drop(){
        return new NaturalResouce("Sestertius", "Roman coin" , "Money" , 0);
    }
}
