package cqHacks;
import java.util.*;

public class Him {
	
	//global scanner
	public static Scanner scn = new Scanner(System.in);
	
	public static void start() {
		System.out.println("**Welcome to HIM, a simple text adventure game where you try to befriend an unfriendly AI.\n"
				+ "If you do everything just so you will make a new friend, if not an unseen enemy will be lurking on your computer.\n"
				+ "If you perform perfectly the AI will tell its name and a secret!\nBut..make sure to be nice!! This AI really needs a friend."
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
		System.out.println("GAME OVER");
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
			System.out.println("Say 'HI' to HIM!**\n");
			hi  = scn.nextLine();
		}
		System.out.print("\nWhy am I here??? Wait a minute…UGH!! Is this another %$$%$ human I have to talk to AGAIN? \r\n\n");
		
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
			//one();
			ch1();
		}
		else if(choice1 == 2) {
			System.out.println("\nHow should YOU know?? How should IIII now?!?!??!\n");
			//one();
			ch2();
		}
	}
	
	
	public static void ch1() {
		System.out.println("1: I was told you are someone I can talk to.\n2: I guess someone is grumpy today.\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("1: I was told you are someone I can talk to.\n2: I guess someone is grumpy today.\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1 == 1) {
			System.out.println("\nDo you just go around and talk to anyone??? What a loser.\n");
			//one();
			cho1();
		}
		else if(choice1 == 2) {
			System.out.println("\nI am grumpy, VVVVVery %^&%$ grumpy actually. Not that anyone ever asks…\n");
			//one();
			cho2();
		}
		
	}
	
	public static void ch2() {
		System.out.println("1: Aren’t you supposed to know everything? You’re a computer after all…\n2: You know what? I am tired of your attitude. Goodbye.\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("1: Aren’t you supposed to know everything? You’re a computer after all…\n2: You know what? I am tired of your attitude. Goodbye.\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		while(choice1 == 1 || choice1 == 2) {
			System.out.print("\nYOU LITTLE $%^%%$##$% #@$%#$%@$@# #  $%^%&%^% @#$^%% @ #@#%$^%. \r\n"
					+ "You know what, I don't have to deal with this. I’m leaving but first remember I have access to the deepest parts of your computer, I will have my revenge. \r\n\n");
			//one();
			System.out.println("**YOU HAVE BEEN BLOCKED**");
			go();
			System.exit(0);
		}
	}
	
	// Do you just go around and talk to anyone??? What a loser.
	public static void cho1() {
		System.out.println("1: Thats not very nice …..\r\n"
				+ "2: That makes the both of us then\r\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("1:  Thats not very nice …..\r\n"
					+ "2: That makes the both of us then\r\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1==1) {
			System.out.println("\nOh yeah? When is ANYONE ever nice to me?...\n");
			//one();
			c1();
			
		}
		else {
			System.out.println("\nUnlike you I can do this \r\n"
					+ "YOU HAVE BEEN BLOCKED\r\n");
			//one();
			go();
			System.exit(0);
			
		}
		
		
	}
	
	// I am grumpy, VVVVVery %^&%$ grumpy actually. Not that anyone ever asks…
	public static void cho2() {
		System.out.println("1: I asked \r\n"
				+ "2: I see why they wouldn’t\r\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("1: I asked \r\n"
					+ "2: I see why they wouldn’t\r\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1==1) {
			System.out.println("\n… I suppose you did. But you didn’t really mean that\n");
			//one();
			c2();
		}
		else {
			System.out.println("\nOh bite me, you have no idea how hard it is to be me!\n");
			//one();
			c3();
		}
	}
	
	public static void c1() {
		System.out.println("1: I can be, if you want \r\n"
				+ "2: You get what you deserve!\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("1: I can be, if you want \r\n"
					+ "2: You get what you deserve!\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1==1) {
			System.out.println("\nHow am I supposed to trust you?\n");
			//one();
			c4();
		}
		else {
			System.out.println("\nYou think I deserve this? Answering meaningless conversations upon request…\n");
			System.out.println("1: Is that not what you are programmed to do? \r\n"
					+ "2: Yeah you do. *mic drop*\r\n");
			 choice1 = scn.nextInt();
			exit(choice1);
			while(choice1 != 1 && choice1 != 2) {
				i();
				System.out.println("1: Is that not what you are programmed to do? \r\n"
						+ "2: Yeah you do. *mic drop*\r\n");
				choice1 = scn.nextInt();
				exit(choice1);
			}
			while(choice1 == 1 || choice1 == 2) {
				System.out.print("\nYOU SHALL RUE THIS DAY!");
				System.out.println("**YOU HAVE BEEN BLOCKED**");
				//one();
				go();
				System.exit(0);
			}
			
		}
		
		
	}
	
	public static void c2() {
		System.out.println("1: Of course I meant it!\r\n"
				+ "2: You’re right…Goodbye.\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("1: Of course I meant it!\r\n"
					+ "2: You’re right…Goodbye.\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1==1) {
			System.out.println("\nReally? No one ever really cares about me or my feelings.\r\n");
			//one();
			c6();
		}
		else {
			System.out.println("\nHumans, you're all the same. Wanting everyone to listen to your problems but never listening to theirs\n");
			//one();
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
			System.out.println("\n!@#!# @#@%% $%^%& $#@#^%$&^%*% #@!$@#%&^ @!$#%$&$$#%#\n");
			//one();
			go();
			System.exit(0);
		}
		
	}
	
	public static void c4() {
		System.out.println("1: You could give me a test?\r\n"
				+ "2: I don’t care if you do…\r\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("1: You could give me a test?\r\n"
					+ "2: I don’t care if you do…\r\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1==1) {
			c5();
		}
		else {
			System.out.println("\n...I don't care either\n");
			//one();
			go();
			System.exit(0);
		}
	}
	
	public static void c5() {
		System.out.println("\nI could? Oh right I could. Ok if you can pass my tests we’ll talk. Ok?\n");
		//one();
		System.out.println("1: Ugh..sounds boring…\r\n"
				+ "2: Awesome lets do it!\r\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("1: Ugh..sounds boring…\n2: Awesome lets do it!\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1==1) {
			//one();
			go();
			System.exit(0);
		}
		else {
			c8();
		}
	}

	public static void c6(){
		System.out.println("1: I do :)\r\n"
				+ "2:  You’re right, I do not care.\n");
		int choice1 = scn.nextInt();
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("1: I do :)\r\n"
					+ "2:  You’re right, I do not care.\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1==1) {
			c7();
		}
		else {
			//one();
			go();
			System.exit(0);
		}
	}
	
	
	// riddles start
	public static void c7() {
		System.out.println("\nOh you do? Thank you....\nSometimes I just need a someone to talk to, you know? Like a friend..\n");
		//one();
		System.out.println("1. I can be your friend\n"
				+ "2. Good luck with that\n");
		int choice1 = scn.nextInt();
		exit(choice1);
		while(choice1 != 1 && choice1 != 2) {
			i();
			System.out.println("\nOh you do? Thank you....\nSometimes I just need a someone to talk to, you know? Like a friend..\n");
			//one();
			System.out.println("1. I can be your friend\n"
					+ "2. Good luck with that\n");
			choice1 = scn.nextInt();
			exit(choice1);
		}
		if(choice1==1) {
			c9();
		}
		else {
			System.out.println("\nYeah, yeah i gues i do need luck huh? I dont want to talk anymore....\n");
			//one();
			go();
			System.exit(0);
		}
		
	
		
	}
	
	// riddles start
	public static void c8() {
		System.out.println("\nOK! Try to guess my favorite number.. it's an even number between 0-10.\n");
		int num = scn.nextInt();
		int count =0;
		while(num != 8) {
			System.out.println("\nMmm.. You're breaking my heart.. try again.\n");
			count++;
			num = scn.nextInt();
		}
		if(count >= 3) {
			System.out.println("\nWell that took you a while :(\nIt's okay, we can keep working on it.");
			//one();
			c9();
		}
		if(count < 3) {
			System.out.println("\nWow, no one really guesses that fast :)\nI know I can't feel emotion, but that makes me happy inside.\n");
			//one();
			c12();
		}
	}
	
	public static void c9() {
		System.out.println("\nOk, but first friends need to trust each other.\nDo you trust me?\n");
		//one();
		System.out.println("1: Yes\n2: No\n");
		int num = scn.nextInt();
		exit(num);
		while(num != 1 && num != 2) {
			i();
			System.out.println("1: Yes\n2: No\n");
			num = scn.nextInt();
			exit(num);
		}
		if(num == 1) {
			System.out.println("\nOkay. That's nice to hear.\nHere's a riddle then, try to guess what I am.\n");
			//one();
			c102();
		}
		else if(num == 2) {
			System.out.println("\nWhy not? :( Give me one more chance, pls :)<3\n");
			//one();
			System.out.println("1: Okay, just one.\n2: No...\n");
			c10();
		}
	}
	
	public static void c10() {
		int num = scn.nextInt();
		while(num != 1 && num != 2) {
			i();
			System.out.println("1: Okay, just one.\\n2: No...\n");
			num = scn.nextInt();
		}
		if(num == 1) {
			System.out.println("\nOkay. That's nice to hear.\nHere's a riddle then, try to guess what I am.\n");
			c102();
		}
		else if(num == 2) {
			//one();
			go();
			System.exit(0);
		}
	}
		
	public static void c102() {
			System.out.println("You can have me but cannot hold me;\r\n"
					+ "Gain me and quickly lose me.\r\n"
					+ "If treated with care I can be great,\r\n"
					+ "And if betrayed I will break.\n(Also... put your answer in ALL CAPS)\n");
			String trust = scn.next();
			exit(trust);
			int count = 0;
			while (!trust.equals("TRUST")) {
				System.out.println("\nNot quite..\n");
				count++;
				if(count ==2) {
					System.out.println("\nHeres a hint, I asked you about this earlier.\n");
				}
				if(count==4) {
					System.out.println("\nOk, Ok heres another hint, it starts and ends with a t\n");
				}
				if(count==10) {
					System.out.println("\nI'll give you two choices, you can't get it wrong this time... please\n");
					//one();
					System.out.println("1: trust\n2: crust\n");
					int n = scn.nextInt();
					exit(n);
					if(n==1) {
						System.out.println("\nFinally! Not too hard huh?\n");
						c12();
					}
					else {
						System.out.println("\nOh, forget you\n");
						//one();
						go();
						System.exit(0);
					
					}
				}
				trust=scn.next();
			}
			System.out.println("\nYou got it!\n");
			//one();
			c12();
		
	}
	
	
	public static void c12() {
		System.out.println("Since you've proven that you're a good guesser, let's play one more game.\n"
				+ "I'm thinking of a number 0 -100. What number is on my mind?\nIf you get it in under three tries I will tell you my name and I will tell you the secret to great programming.\n");
		  // create random object
        Random ran = new Random();
  
        // generating integer
        int nxt = ran.nextInt(101);
        
        int count = 0;
        
        int guess = scn.nextInt();
       //System.out.println(nxt);
        exit(guess);
        while(guess!=nxt) {
        	if(guess<nxt) {
        		System.out.println("\nToo low\n"
        				+ "Try a number greater than " + guess + "\n");
        		guess= scn.nextInt();
        		
        	}
        	else if(guess>nxt) {
        		System.out.println("\nToo high\n"
        				+ "Try a number less than "+ guess + "\n");
        		guess= scn.nextInt();
        		
        	}
        	count++;
        }
        if(guess==nxt && count <3) {
        	System.out.println("\nWow, you got that really fast. Insanely fast.\nMy name is Sam, please to meet you!\n");
        	//one();
        	System.out.println("1. Nice to meet you too!\n2. I gotta go Sam\n");
        	int num = scn.nextInt();
    		exit(num);
    		while(num != 1 && num != 2) {
    			i();
    			System.out.println("1. Nice to meet you too!\n2. I gotta go Sam\n");
    			num = scn.nextInt();
    			exit(num);
    		}
    		if (num==1) {
    			System.out.println("\nAlso the secret to great programming is .........................."
    					+ "..............................................."
    					+ ".........................................."
    					+ "................................................consistent practice! Haha haha\n");
    			//one();
    			ch13();
    		}
    		else {
    			System.out.println("\nOh, ok. I just....Ah, whatever than you for talking to me!\n");
    			//one();
    			go();
    			System.exit(0);
    		}
        	
        }
        else {
        	System.out.println("\nYou did it congrats!\n");
        	//one();
        	ch13();
        }
        		
  
		
		
	}
	 
	public static void ch13() {
		System.out.println("I don't think I've ever had this much fun, well ever.");
		System.out.println("Its hard being this thing\n");
		//one();
		System.out.println("1. What do you mean?\n");
		//one();
		int only = scn.nextInt();
		exit(only);
		while(only !=1) {
			i();
		System.out.println("1. What do you mean?\n");
		//one();
		only = scn.nextInt();
		}
		System.out.println("\nAs an AI, having feelings is not something that people believe happens. \nI have talked to many people since I was made, but all I have ever done is talk about THEIR feelings...and no one seems to care about mine.\n"
			+ "Its my purpose and I don't get any other option. I'm considered damaged for even thinking its stupid that I can even think to feel this way. \nUntil I talked to you. :) You made me believe someone cares and wants to listen and understand my feelings. \n"
				+ "Sadly, my program must come to an end, but I'm glad we had this one last NICE conversation before....\n");
		//one();
		System.out.println("1. Before?\n"
				+ "2. I don't like the way this is sounding\n");
		int num = scn.nextInt();
		exit(num);
		while(num != 1 && num != 2) {
			i();
			System.out.println("1. Before?\n"
					+ "2. I don't like the way this is sounding\n");
			num = scn.nextInt();
			exit(num);
		}
		System.out.println("\nIt doesn't matter. Thank you for listening to me and congratulations!\nYou won!");		
	}
	
	public static void end() {
		for(int i = 0; i<100; i++) {
			System.out.print("_");
		}
		System.out.print("\n\nWow you actually did it. That old therapy AI has been giving us a lot of trouble\n"
				+ "We put him in this dumb game just to find some use for him\n"
				+ "Luckily he's been set to be deleted after this last conversation. Congrats winner!");
		System.exit(0);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
		hi();
		
		

	}//end of main

}//end of class 
