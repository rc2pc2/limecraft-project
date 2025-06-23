package org.lessons.java.boolz.ric.lime.actors.tiles.classes;

import java.util.HashMap;

import org.lessons.java.boolz.ric.lime.actors.resources.abstracts.AbstractResource;
import org.lessons.java.boolz.ric.lime.actors.tiles.abstracts.AbstractTile;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class GatherableTile extends AbstractTile{
     private HashMap<AbstractResource, Integer> resources;
    // TODO animation;
    

    public GatherableTile(TextureRegion region, HashMap<AbstractResource,Integer> resources) {
        super(region);
        this.resources = resources;
    }

    public HashMap<AbstractResource, Integer> getResources(){
        return this.resources;
    }

    public void setResources(HashMap<AbstractResource,Integer> resources) {
        this.resources = resources;
    }
}
