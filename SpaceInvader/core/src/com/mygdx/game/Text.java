package com.mygdx.game;
 
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
 
public class Text {
    SpriteBatch batch;
    CharSequence str = "SCORE";
    CharSequence str2 = "LIVES";
    BitmapFont font;
 
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();
 
        font.getData().setScale(1.5f, 1.5f);
    }
 
    public void update() {
 
    }
 
    public void render() {
        batch.begin();
        font.draw(batch, str, 100, Gdx.graphics.getHeight() - 30);
        font.draw(batch, str2, 500, Gdx.graphics.getHeight() - 30);
        batch.end();
    }
 
    public void dispose() {
        batch.dispose();
    }
 
}