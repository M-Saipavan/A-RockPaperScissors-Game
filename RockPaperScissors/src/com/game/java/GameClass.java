package com.game.java;

import java.util.*;

public class GameClass {
	

	public static int gameFlow(Player p1,List<String> rps) {

		Scanner sc = new Scanner(System.in);
		System.out.println("-_| Rock * | Paper / | Scissors X |_-------------------------");
		System.out.println(" New Game -----------> '1'");
		System.out.println(" Continue -----------> '2'");
		System.out.println(" Display no. of wins --> '3'");
		System.out.println(" Quit -----------------> 'any other number'");
		int i = sc.nextInt();
		
		switch(i) {
			case 1:  {
				System.out.println("--------------------------New Game------------------\nEnter Your Name (No Spaces are Allowed) : ");
				String n=sc.next();
				p1.name=n;
				System.out.println("Pick your choice:");
				System.out.println("For Rock - enter 1\nFor Paper - enter 2\nFor Scissors - enter 3");
				int max=3;
				int min=1;
				int b = (int)(Math.random()*(max-min+1)+min);  
				String cpuElement = rps.get(b);
				System.out.println("Cpu Chooses : "+cpuElement);
				Cpu.wins=0;
				int choice = sc.nextInt();
				String playerElement= rps.get(choice);
				Rules rules = new Rules();
				if(choice>=1&&choice<=3) {
					int res = rules.condition(playerElement, cpuElement);
					Result.display(res);
					if (res>0){
						p1.wins+=1;
					}
					else if(res<0) {
						Cpu.wins+=1;
					}
				}
				else {
					System.out.println("Enter valid key choice");
				}
				break;
				}
			case 2: {
				
				System.out.println("Pick your choice:");
				System.out.println("For Rock - enter 1\nFor Paper - enter 2\nFor Scissors - enter 3");
				
				
				int max=3;
				int min=1;
				int b = (int)(Math.random()*(max-min+1)+min); 
				String cpuElement = rps.get(b);
				System.out.println("Cpu Chooses : "+cpuElement);
				int choice = sc.nextInt();
				String playerElement= rps.get(choice);
				Rules rules = new Rules();
				if(choice>=1&&choice<=3) {
					int res = rules.condition(playerElement, cpuElement);
					Result.display(res);
					if (res>0){
						p1.wins+=1;
					}
					else if(res<0){
						Cpu.wins+=1;
					}
				}
				else {
					System.out.println("Enter valid key choice");
				}
				break;
			}
			case 3:{
				System.out.println(p1.name+" : "+p1.wins);
				System.out.println("CPU : "+Cpu.wins);
				break;
			}
			default:
				return -1;
		}
		return 1;

	}
	
	
	
	
	public static void main(String[] args) {
		List<String> rps = new ArrayList<>();
		String name = "Player";
		int w=0;
		rps.add("Dummy");
		rps.add("Rock");
		rps.add("Paper");
		rps.add("Scissors");
		int plays=0;
		Player p1 = new Player(name,w);
		while(plays>=0) {
			int res = GameClass.gameFlow(p1,rps);
			if(res==-1) {
				System.out.println("Games Played : "+plays);
				break;
			}
			else {
				plays++;
			}
		}
	
	}
}
