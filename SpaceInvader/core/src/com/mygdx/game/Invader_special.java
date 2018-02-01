package com.mygdx.game;
 
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
 
public class Invader_special {
 
    Texture invader_special;
    SpriteBatch batch;
    int x, y;
    int width, height;
    int score = 50;
 
    public void create() {
        invader_special = new Texture(Gdx.files.internal("invader_special.png"));
        batch = new SpriteBatch();
 
        x = 400;
        y = 780;
 
        width = 280;
        height = 280;
    }
 
    public void update() {
 
    }
 
    public void render() {
        batch.begin();
        batch.draw(invader_special, x, y, width, height);
        batch.end();
    }
 
    public void dispose() {
        batch.dispose();
    }
}