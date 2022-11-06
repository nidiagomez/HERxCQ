package cqHacks;

import java.util.Scanner;

public class Him {
	
	//global scanner
	public static Scanner scn = new Scanner(System.in);
	public static void start() {
		System.out.println("Welcome to HIM, simple text adventure game where you try to befriend and unfriendly AI.\n"
				+ "If you do everything just so you will make a new friend, if not an unseen enemy will be lurking on your computer.\n"
				+ "If you perform perfectly the AI will tell its name and a secret!\n"
				+ "Type 'NEXT' to begin the game (P.S if at any point you wish to exit the game type 'EXIT')");
		String choice1 = scn.nextLine();
		exit(choice1);
		int count=0;
		while(!choice1.equals("NEXT")) {
			System.out.println("Invalid Input");
			count++;
			if(count==5) {
				System.out.println("Remember print 'NEXT' to begin the game and 'EXIT' to end the game");
			}
			if(count==10) {
				System.out.println("Nevermind you are obviously not the person for this job... or are you? I give you three more chances!");
			}
			if(count==13) {
				System.out.println("Well I tried. You can go home or whatever it is you do besides annoying others");
				System.exit(0);
			}
		
			choice1 = scn.nextLine();
			
		}
		
			System.out.println("Great!\nI'll be going now. Say hi to HIM!");
		
	}
	
	public static void exit (String c) {
		if(c.equals("EXIT")) {
			System.out.println("Alright, if you really want to give up I won't stop you. Bye loser");
			System.exit(0);
		}
	}
	
	public static void hi() {
		String hi  = scn.nextLine();
		exit(hi);
		hi.toLowerCase();
		while(!hi.equals("hi")) {
			System.out.println("Invalid Input");
			hi  = scn.nextLine();
		}
		System.out.print("Why am I here??? Wait a minute…UGH!! Is this another %$$%$ human I have to talk to AGAIN? \r\n");
		// 3 seconds
		
		System.out.println("Choose an option:\n1: I just needed someone to talk to.\n2: How should I know??\n(Type 1 or 2)");
		int choice1 = scn.nextInt();
		while(choice1 != 1 && choice1 != 2) {
			System.out.println("Invalid Input");
			System.out.println("Choose an option:\n1: I just needed someone to talk to.\n2: How should I know??\n(Type 1 or 2)");
			choice1 = scn.nextInt();
		}
		
		if(choice1 == 1) {
			System.out.println("Why would I want to talk to you?");
			//3 seconds
			ch1();
		}
		else if(choice1 == 2) {
			System.out.println("How should YOU know?? How should IIII now?!?!??!");
			//3 seconds
			ch2();
		}
	}
	
	
	public static void ch1() {
		System.out.println("Choose an option:\n1: I was told you are someone I can talk to.\n2: I guess someone is grumpy today.\n(Type 1 or 2)");
		int choice1 = scn.nextInt();
		while(choice1 != 1 && choice1 != 2) {
			System.out.println("Invalid Input");
			System.out.println("Choose an option:\n1: I was told you are someone I can talk to.\n2: I guess someone is grumpy today.\n(Type 1 or 2)");
			choice1 = scn.nextInt();
		}
		if(choice1 == 1) {
			System.out.println("Do you just go around and talk to anyone??? What a loser.");
			//3 seconds
			//cho1();
		}
		else if(choice1 == 2) {
			System.out.println("I am grumpy, VVery %^&%$ grumpy actually. Not that anyone ever asks…");
			//3 seconds
			//cho2();
		}
		
	}
	
	public static void ch2() {
		System.out.println("Choose an option:\n1: Aren’t you supposed to know everything? You’re a computer after all…\n2: You know what? I am tired of your attitude. Goodbye.\n(Type 1 or 2)");
		int choice1 = scn.nextInt();
		while(choice1 != 1 && choice1 != 2) {
			System.out.println("Invalid Input");
			System.out.println("Choose an option:\\n1: Aren’t you supposed to know everything? You’re a computer after all…\n2: You know what? I am tired of your attitude. Goodbye.\n(Type 1 or 2)");
			choice1 = scn.nextInt();
		}
		while(choice1 == 1 || choice1 == 2) {
			System.out.print("YOU LITTLE $%^%%$##$% #@$%#$%@$@# #  $%^%&%^% @#$^%% @ #@#%$^%. \r\n"
					+ "You know what, I don't have to deal with this. I’m leaving but first remember I have access to the deepest parts of your computer, I will have my revenge. \r\n"
					+ "");
			System.out.println("YOU HAVE BEEN BLOCKED GAME OVER");
			System.exit(0);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
		hi();
		
		

	}//end of main

}//end of class 
