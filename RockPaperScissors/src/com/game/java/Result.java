package com.game.java;

public class Result {
	
	public static void display(int a){
		if(a<0) {
			System.out.println("You Lose");
		}
		else if (a>0) {
			System.out.println("You Win");
		}
		else {
			System.out.println("Tie");
		}
	}
}
