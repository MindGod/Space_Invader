package com.mygdx.game;
 
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
 
public class SpaceInvador extends ApplicationAdapter {
    SpriteBatch batch;
    Invader_special invader_special;
    Defender defender;
    Text text;
    Invaders invader;
    Bullet bullet;
 
    @Override
    public void create() {
 
        invader_special = new Invader_special();
        invader_special.create();
 
        defender = new Defender();
        defender.create();
 
        text = new Text();
        text.create();
       
        invader = new Invaders();
        invader.create();
       
        bullet = new Bullet();
        bullet.create();
 
    }
 
    public void update() {
 
    }
 
    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
 
 
        defender.render();
        text.render();
        invader.render();
        bullet.render();
 
    }
 
    @Override
    public void dispose() {
 
 
        invader_special.dispose();
        defender.dispose();
        text.dispose();
        invader.dispose();
        bullet.dispose();
 
    }
}