package com.mygdx.game;
 
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
 
public class Defender {
 
    static Texture defender;
    SpriteBatch batch;
    Bullet bullet;
    static float x;
	int y;
    int width, height;
    float speed;
 
    public void create() {
        defender = new Texture(Gdx.files.internal("Defender.png"));
        batch = new SpriteBatch();
        
        bullet = new Bullet();
        bullet.create();
 
        x = 75;
        y = 10;
 
        width = 210;
        height = 195;
 
        speed = 6;
    }
 
    public void update() {
    	
    	
        if (Gdx.input.isKeyPressed(Keys.A)) {
            x -= speed;
        }
        if (Gdx.input.isKeyPressed(Keys.D)) {
            x += speed;
        }
       
        if (x < 0) {
            x = 0;
        }
        if (x > (Gdx.graphics.getWidth() - defender.getWidth())) {
            x = Gdx.graphics.getWidth() - defender.getWidth();
        }
       
 
       
    }
 
    public void render() {
        update();
 
        batch.begin();
        batch.draw(defender, x, y, width, height);
        batch.end();
    }
 
    public void dispose() {
        batch.dispose();
    }
    
    public float getX() {
    	return x;
    }
}