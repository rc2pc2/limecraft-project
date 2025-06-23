package org.lessons.java.boolz.ric.lime.actors.resources.abstracts;

import org.lessons.java.boolz.ric.lime.actors.abstracts.AbstractActor;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public abstract class AbstractResource extends AbstractActor {
    private String name;
    private String description;
    private String category;
    private float weight;

    public AbstractResource(TextureRegion region, String name, String description, String category, float weight) {
        super(region);
        this.name = name;
        this.description = description;
        this.category = category;
        this.weight = weight;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
