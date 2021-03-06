package com.mygdx.game;
 
import com.badlogic.gdx.Gdx;
 
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
 
public class Invaders {
 
    private int index;
   
    Texture invader;
    SpriteBatch batch;
    int x, y;
    int width, height;
    // int score = 20;
 
    Texture invader2;
    int a, b;
    int width2, height1;
    // int score = 10;
 
    Texture invader3;
    int c, d;
    int width3, height3;
    // int score = 30;
 
    public Invaders() {
       
    }
   
    public Invaders(int index) {
        this.index = index;
    }
   
    public void create() {
        System.out.println(Gdx.files.getLocalStoragePath());
        invader = new Texture(Gdx.files.internal("Space_invader_1_frame_1.png"));
        batch = new SpriteBatch();
       
        invader2 = new Texture(Gdx.files.internal("Space_invader_2_frame_1.png"));
        batch = new SpriteBatch();
 
        invader3 = new Texture(Gdx.files.internal("Space_invader_3_frame_1.png"));
        batch = new SpriteBatch();
 
        x = 150;
        y = 350;
 
        width = 210;
        height = 203;
 
        a = 278;
        b = 573;
 
        width2 = 170;
        height1 = 175;
 
        c = 290;
        d = 780;
 
        width3 = 130;
        height3 = 130;
    }
 
    public void update() {
 
    }
 
    public void render() {
        batch.begin();
        batch.draw(invader, x, y, width, height);
        batch.draw(invader, a, b, width2, height1);
        batch.draw(invader3, c, d, width3, height3);
        batch.end();
    }
 
    public void dispose() {
        batch.dispose();
        invader.dispose();
        invader2.dispose();
        invader3.dispose();
 
    }
   
    public void setIndex(int index ) {
        this.index = index;
    }
   
    public int getIndex() {
        return index;
    }
 
}