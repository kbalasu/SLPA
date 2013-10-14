package com.slpa;

import java.util.Random;


public class RandomNumGenerator {
	static Random random = new Random();
	
	static int getRandomInt(int max) {
		return random.nextInt(max);
	}
	
}
