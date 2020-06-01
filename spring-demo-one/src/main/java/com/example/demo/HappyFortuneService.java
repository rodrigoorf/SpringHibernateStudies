package com.example.demo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = {"Today is your lucky day!", "Way to go!", "You're going places!"};
		Random r = new Random();
		int randInt = r.nextInt((3 - 0) + 1) + 0;
		return fortunes[randInt];
	}

}
