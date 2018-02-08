package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class Bullet {
	float speed;
	float x, y;
	float width, heigth;

	boolean is_shot, is_destroyed;

	float x_velocity, y_velocity;

	ShapeRenderer shape;
	
	public Bullet() {

	}

	public void create() {

		shape = new ShapeRenderer();
		speed = 10;
		width = 10;
		heigth = 10;
		x_velocity = 1;
		y_velocity = 1;
		y = 125;

	}

	public void update() {
		
		if(Gdx.input.isKeyJustPressed(Keys.SPACE)) {
			
			if(!is_shot) {
				shoot();
			}
		}
		
		if(y > Gdx.graphics.getHeight()) {
			reset();
		}
		
		
	}

	public void render() {
		update();

		if(is_shot & !is_destroyed) {
			shape.begin(ShapeType.Filled);
			shape.rect(x, y, width, heigth);
			shape.end();
			y += 20;
		}
		
	}

	public void dispose() {
		shape.dispose();
	}
	
	public void destroy() {
		is_destroyed = true;
	}
	
	public void reset() {
		is_destroyed = false;
		is_shot = false;
		y = 125;
	}
	
	public void shoot() {
		is_shot = true;
		x = Defender.x + (Defender.defender.getWidth() / 3);
	}
	
}
