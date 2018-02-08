package com.mygdx.game;
 
import java.util.*;
 
import org.omg.PortableServer.ForwardRequestHelper;
 
public class InvadersManager {
 
    ArrayList<Invaders> invaders_list = new ArrayList<Invaders>();
    public static final int INVADERS_COUNT = 55;
   
    public InvadersManager() {
 
        for( int i = 0 ; i < INVADERS_COUNT ; i ++) {
            invaders_list.add(new Invaders(i));
        }
       
       
        for (Invaders invader : invaders_list) {
            invader.create();
        }
       
        for (Invaders invader : invaders_list) {
            if(invader.getIndex() <= 10) {
 
            }
        }
 
    }
   
    public void create() {
 
    }
   
    public void update() {
       
    }
   
    public void render() {
       
    }
   
    public void dispose() {
       
    }
}