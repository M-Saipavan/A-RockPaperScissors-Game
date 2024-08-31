package com.game.java;

public class Rules {
	/*
	
	Paper         WINS          rock
	Scissors      WINS          Paper
	Rock          WINS          Scissors
	
	
	
	*/
	public int condition(String s1,String s2) {
		
		if(s1.equalsIgnoreCase(s2)) return 0;
		else {
			if(s1.equalsIgnoreCase("Rock")&&s2.equalsIgnoreCase("Paper")) {
				return -1;
			}
			else if(s1.equalsIgnoreCase("Rock")&&s2.equalsIgnoreCase("Scissors")) {
				return 1;
			}
			else if(s1.equalsIgnoreCase("Paper")&&s2.equalsIgnoreCase("Rock")) {
				return 1;
			}
			else if(s1.equalsIgnoreCase("Paper")&&s2.equalsIgnoreCase("Scissors")) {
				return -1;
			}
			else if(s1.equalsIgnoreCase("Scissors")&&s2.equalsIgnoreCase("Paper")) {
				return 1;
			}
			else if(s1.equalsIgnoreCase("Scissors")&&s2.equalsIgnoreCase("Rock")) {
				return -1;
			}
			else return -1000;
		}
	}
}
