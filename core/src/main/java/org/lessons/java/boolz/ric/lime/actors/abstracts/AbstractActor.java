package org.lessons.java.boolz.ric.lime.actors.abstracts;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;

public class AbstractActor extends Actor {
    TextureRegion region;
    
    public AbstractActor (TextureRegion region) {
        this.region = region; 
		this.setBounds(0, 0, this.getWidth(), this.getHeight());
    }

    @Override
	public void draw (Batch batch, float parentAlpha) {
		Color color = getColor();
		batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
		batch.draw(region, getX(), getY(), getOriginX(), getOriginY(),
			getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
	}

	public Actor hit (float x, float y, boolean touchable) {
		if (touchable && getTouchable() != Touchable.enabled) return null;
		return x >= 0 && x < this.getWidth() && y >= 0 && y < this.getHeight() ? this : null;
	}	
}
