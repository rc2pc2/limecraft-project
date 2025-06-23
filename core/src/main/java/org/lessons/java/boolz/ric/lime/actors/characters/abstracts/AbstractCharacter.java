package org.lessons.java.boolz.ric.lime.actors.characters.abstracts;

import org.lessons.java.boolz.ric.lime.actors.abstracts.AbstractActor;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public abstract class AbstractCharacter extends AbstractActor {
    private String name;
    private int lifePoints;
    private float strength;
    private float stamina;
    private float speed;
    private float jumpHeight;

    public AbstractCharacter(TextureRegion region, int lifePoints, String name, float strength, float stamina, float speed, float jumpHeight) {
        super(region);
        this.lifePoints = lifePoints;
        this.name = name;
        this.strength = strength;
        this.stamina = stamina;
        this.speed = speed;
        this.jumpHeight = jumpHeight;
    }

        public int getLifePoints() {
        return this.lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStrength() {
        return this.strength;
    }

    public void setStrength(float strength) {
        this.strength = strength;
    }

    public float getStamina() {
        return this.stamina;
    }

    public void setStamina(float stamina) {
        this.stamina = stamina;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getJumpHeight() {
        return this.jumpHeight;
    }

    public void setJumpHeight(float jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public boolean isAlive(){
        return this.lifePoints > 0;
    }

    public void move(){
        // todo
    }

    public void jump(){
        // todo
    }

}
