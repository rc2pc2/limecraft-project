package org.lessons.java.boolz.ric.lime.actors.resources.classes;

import java.util.Set;

import org.lessons.java.boolz.ric.lime.actors.resources.abstracts.AbstractResource;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class CraftableResource extends AbstractResource{
    private Set<AbstractResource> components;
    private int craftLevel;
    
    public CraftableResource(TextureRegion region, String name, String description,String category, float weight, Set<AbstractResource> components, int craftLevel) {
        super(region, name, description, category, weight);
        this.components = components;
        this.craftLevel = craftLevel;
    }


    public Set<AbstractResource> getComponents() {
        return this.components;
    }

    public void setComponents(Set<AbstractResource> components) {
        this.components = components;
    }

    public int getCraftLevel() {
        return this.craftLevel;
    }

    public void setCraftLevel(int craftLevel) {
        this.craftLevel = craftLevel;
    }
    
}
