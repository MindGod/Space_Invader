package com.mygdx.game;
 
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
 
public class SpaceInvador extends ApplicationAdapter {
    SpriteBatch batch;
    Invaders invaders;
    Invader_special invader_special;
    Defender defender;
    Cube cube_1;
    Text text;
    Bullet bullet;
 
    @Override
    public void create() {
 
       
    	invaders = new Invaders();
    	invaders.create();
 
        invader_special = new Invader_special();
        invader_special.create();
 
        defender = new Defender();
        defender.create();
 
        
 
        cube_1 = new Cube();
        cube_1.create();
 
        text = new Text();
        text.create();
        
        bullet = new Bullet();
        bullet.create();
 
    }
 
    public void update() {
    	
    }
 
    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
 
        invaders.render();
        invader_special.render();
        defender.render();
        cube_1.render();
        text.render();
        bullet.render();
 
    }
 
    @Override
    public void dispose() {
 
    	invaders.dispose();
        invader_special.dispose();
        defender.dispose();
        cube_1.dispose();
        text.dispose();
        bullet.dispose();
 
    }
}