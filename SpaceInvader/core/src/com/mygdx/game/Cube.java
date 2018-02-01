package com.mygdx.game;
 
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
 
public class Cube {
 
    Texture Cube_1;
    Texture Cube_2;
    Texture Cube_3;
    Texture Cube_4;
    Texture Cube_5;
 
    SpriteBatch batch;
    int x, y;
    int a, b;
    int c, d;
    int width, height;
    int points = 10;
 
    public void create() {
        Cube_1 = new Texture(Gdx.files.internal("Cube_1_frame_1.png"));
        batch = new SpriteBatch();
 
        Cube_2 = new Texture(Gdx.files.internal("Cube_2_frame_1.png"));
        batch = new SpriteBatch();
 
        Cube_3 = new Texture(Gdx.files.internal("Cube_3_frame_1.png"));
        batch = new SpriteBatch();
       
        Cube_4 = new Texture(Gdx.files.internal("Cube_2_frame_1_1.png"));
        batch = new SpriteBatch();
       
        Cube_5 = new Texture(Gdx.files.internal("Cube_3_1_frame_1.png"));
        batch = new SpriteBatch();
 
        x = 100;
        y = 200;
 
        a = 98;
        b = 220;
 
        c = 115;
        d = 225;
 
        width = 60;
        height = 60;
    }
 
    public void update() {
 
    }
 
    public void render() {
        batch.begin();
        batch.draw(Cube_1, x, y, width, height);
        batch.draw(Cube_1, 100, 181, width, height);
        batch.draw(Cube_1, 118, 216, width, height);
        batch.draw(Cube_1, 136, 216, width, height);
        batch.draw(Cube_1, 153, 197, width, height);
        batch.draw(Cube_1, 153, 181, width, height);
        batch.draw(Cube_2, a, b, width, height);
        batch.draw(Cube_3, 115, 206, width, height);
        batch.draw(Cube_4, 136, 220, width, height);
        batch.draw(Cube_4, 136, 220, width, height);
        batch.draw(Cube_5, 118.502f, 206.87f, width, height);
        batch.end();
    }
 
    public void dispose() {
        batch.dispose();
    }
}