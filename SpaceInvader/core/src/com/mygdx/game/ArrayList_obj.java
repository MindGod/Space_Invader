package com.mygdx.game;

import java.util.*;

public class ArrayList_obj {
   public static void main(String args[]) {
	   
	   Invaders invader_1 = new Invaders();
	   Invaders invader_2 = new Invaders();
	   Invaders invader_3 = new Invaders();
	   
	   ArrayList<Invaders> obj = new ArrayList<Invaders>();

	   obj.add(invader_1);
	   obj.add(invader_2);
	   obj.add(invader_3);


   }
}
