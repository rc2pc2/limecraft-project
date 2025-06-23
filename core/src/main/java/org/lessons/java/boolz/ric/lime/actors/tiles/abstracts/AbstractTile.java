package org.lessons.java.boolz.ric.lime.actors.tiles.abstracts;

import org.lessons.java.boolz.ric.lime.actors.abstracts.AbstractActor;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public abstract class AbstractTile extends AbstractActor{

    public AbstractTile(TextureRegion region){
        super(region);
    }
}
