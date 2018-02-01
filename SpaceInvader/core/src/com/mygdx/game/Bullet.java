package com.mygdx.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class Bullet {
	float speed;
	float x, y;
	float width, heigth;

	boolean is_shot, is_destroyed;

	float x_velocity, y_velocity;

	ShapeRenderer shape;
	Cube cube;

	public Bullet() {

	}

	public void create() {

		shape = new ShapeRenderer();
		speed = 10;
		x = 10;
		y = 10;
		width = 10;
		heigth = 10;
		x_velocity = 1;
		y_velocity = 1;

		is_shot = true;
		is_destroyed = false;
	}

	public void update() {
		x = cube.x + (cube.width / 2f) + (width / 2f);
		y = cube.y + (cube.height / 2f) - (heigth / 2f);
	}

	public void render() {
		update();

		if (is_shot && !is_destroyed) {
			shape.begin(ShapeType.Filled);
			shape.rect(x, y, width, heigth);
			shape.end();
		}
	}

	public void set_player(Cube cube) {
		this.cube = cube;
	}

	public void dispose() {

	}
}
