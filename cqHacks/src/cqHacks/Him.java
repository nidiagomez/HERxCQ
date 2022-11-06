package cqHacks;

import java.util.Scanner;

public class Him {
	
	//global scanner
	public static Scanner scn = new Scanner(System.in);
	
	public static void start() {
		System.out.println("**Welcome to HIM, simple text adventure game where you try to befriend and unfriendly AI.\n"
				+ "If you do everything just so you will make a new friend, if not an unseen enemy will be lurking on your computer.\n"
				+ "If you perform perfectly the AI will tell its name and a secret!\n"
				+ "Type 'NEXT' to begin the game (P.S if at any point you wish to exit the game type 'EXIT' or -1)**\n");
		String choice1 = scn.nextLine();
		exit(choice1);
		int count=0;
		while(!choice1.equals("NEXT")) {
			i();
			count++;
			if(count==5) {
				System.out.println("**Remember print 'NEXT' to begin the game and 'EXIT' to end the game**");
			}
			if(count==10) {
				System.out.println("**Nevermind you are obviously not the person for this job... or are you? I give you three more chances!**");
			}
			if(count==13) {
				System.out.println("**Well I tried. You can go home or whatever it is you do besides annoying others**");
				go();
				System.exit(0);
			}
		
			choice1 = scn.nextLine();
			
		}
		
			System.out.println("\n**Great!\nI'll be going now. Say 'HI' to HIM!**\n");
		
	}
	public static void i() {
		System.out.println("\nInvalid Input\n");
	}
	public static void go() {
		System.out.println("Game Over");
	}
	public static void exit (String c) {
		if(c.equals("EXIT")) {
			System.out.println("**Alright, if you really want to give up I won't stop you. Bye loser!!**");
			go();
			System.exit(0);
		}
	}
	public static void exit (int c) {
		if(c==-1) {
			System.out.println("**Alright, if you really want to give up I won't stop you. Bye loser!!**");
			go();
			System.exit(0);
		}
	}
	
	public static void hi() {
		String hi  = scn.nextLine();
		exit(hi);
		while(!hi.equals("HI")) {
			i();
			hi  = scn.nextLine();
		}
		System.out.print("\nWhy am I here??? Wait a minute…UGH!! Is this another %$$%$ human I have to talk to AGAIN? \r\n\n");
		// 3 seconds
		
		System.out.println("**Choose an option:\n1: I just needed someone to talk to.\n2: How should I know??\n(Type 1 or 2)**\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("**Choose an option:\n1: I just needed someone to talk to.\n2: How should I know??\n(Type 1 or 2)**\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		
		if(choice1 == 1) {
			System.out.println("\nWhy would I want to talk to you?\n");
			//3 seconds
			ch1();
		}
		else if(choice1 == 2) {
			System.out.println("\nHow should YOU know?? How should IIII now?!?!??!\n");
			//3 seconds
			ch2();
		}
	}
	
	
	public static void ch1() {
		System.out.println("**Choose an option:\n1: I was told you are someone I can talk to.\n2: I guess someone is grumpy today.\n(Type 1 or 2)**\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("**Choose an option:\n1: I was told you are someone I can talk to.\n2: I guess someone is grumpy today.\n(Type 1 or 2)**\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1 == 1) {
			System.out.println("\nDo you just go around and talk to anyone??? What a loser.\n");
			//3 seconds
			cho1();
		}
		else if(choice1 == 2) {
			System.out.println("\nI am grumpy, VVVVVery %^&%$ grumpy actually. Not that anyone ever asks…\n");
			//3 seconds
			cho2();
		}
		
	}
	
	public static void ch2() {
		System.out.println("**Choose an option:\n1: Aren’t you supposed to know everything? You’re a computer after all…\n2: You know what? I am tired of your attitude. Goodbye.\n(Type 1 or 2)**\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("**Choose an option:\n1: Aren’t you supposed to know everything? You’re a computer after all…\n2: You know what? I am tired of your attitude. Goodbye.\n**(Type 1 or 2)**\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		while(choice1 == 1 || choice1 == 2) {
			System.out.print("\nYOU LITTLE $%^%%$##$% #@$%#$%@$@# #  $%^%&%^% @#$^%% @ #@#%$^%. \r\n"
					+ "You know what, I don't have to deal with this. I’m leaving but first remember I have access to the deepest parts of your computer, I will have my revenge. \r\n\n");
			System.out.println("**YOU HAVE BEEN BLOCKED**");
			go();
			System.exit(0);
		}
	}
	
	// Do you just go around and talk to anyone??? What a loser.
	public static void cho1() {
		System.out.println("Choose an option:\r\n"
				+ "1:  Thats not very nice …..\r\n"
				+ "2: That makes the both of us then\r\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("Choose an option:\r\n"
					+ "1:  Thats not very nice …..\r\n"
					+ "2: That makes the both of us then\r\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1==1) {
			System.out.println("Oh yeah? When is ANYONE ever nice to me?...");
			c1();
			
		}
		else {
			System.out.println("Unlike you I can do this \r\n"
					+ "YOU HAVE BEEN BLOCKED\r\n");
			go();
			System.exit(0);
			
		}
		
		
	}
	
	// I am grumpy, VVVVVery %^&%$ grumpy actually. Not that anyone ever asks…
	public static void cho2() {
		System.out.println("Choose an option:\r\n"
				+ "1:I asked \r\n"
				+ "2:I see why they wouldn’t\r\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("Choose an option:\r\n"
					+ "1:I asked \r\n"
					+ "2:I see why they wouldn’t\r\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1==1) {
			System.out.println("….I suppose you did. But you didn’t really mean that ");
			c2();
		}
		else {
			System.out.println("Oh bite me, you have no idea how hard it is to be me!");
			c3();
		}
		}
	public static void c1() {
		System.out.println("1: I can be, if you want \r\n"
				+ "2: You get what you deserve!");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("1: I can be, if you want \r\n"
					+ "2: You get what you deserve!");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1==1) {
			System.out.println("How am I supposed to trust you?");
			c4();
		}
		else {
			System.out.println("You think I deserve this? Answering meaningless conversations upon request…");
		}
		
	}
	public static void c2() {
		System.out.println("1: Of course I meant it!\r\n"
				+ "2: You’re right…Goodbye.");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("1: Of course I meant it!\r\n"
					+ "2: You’re right…Goodbye.");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1==1) {
			System.out.println("Really? No one ever really cares about me or my feelings.\r\n");
			
		}
		else {
			System.out.println("Humans, you're all the same. Wanting everyone to listen to your problems but never listening to theirs");
			go();
			System.exit(0);
		}
		
	}
	public static void c3() {
		System.out.println("1: You are not even a real PERSON???!!!\r\n"
				+ "2: Oh c’mon do you have bills on the computer to pay?\r\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("1: You are not even a real PERSON???!!!\r\n"
					+ "2: Oh c’mon do you have bills on the computer to pay?\r\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1==1 || choice1==2) {
			System.out.println("!@#!# @#@%% $%^%& $#@#^%$&^%*% #@!$@#%&^ @!$#%$&$$#%#");
			go();
			System.exit(0);
		}
		
	}
	public static void c4() {
		System.out.println("1: You could give me a test?\r\n"
				+ "2: I don’t care if you do…\r\n");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
		hi();
		
		

	}//end of main

}//end of class 
