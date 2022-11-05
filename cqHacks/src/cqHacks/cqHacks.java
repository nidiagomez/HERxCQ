package cqHacks;
import java.util.Scanner;
class cqHacks {
	
	public static void horizontalLine() {
		for (int i = 0; i<100; i++) {
			System.out.print("_");
		}
		System.out.println();
	}
	
	public static void begin() {
		
	}
	
	
  public static void main(String[] args) {

  System.out.println("One day you find a file on your computer you've never seen before.\nCurious and a more than a bit naive "
  		+ "you decide to click on it");
  
  		horizontalLine();
  		Scanner scn = new Scanner(System.in);
  		System.out.print("Say hi: ");
  		String talk = scn.nextLine();
  		
    System.out.print("\n");
    
    System.out.println("!!!!!!!!!!!\n");
    
    try {
    	talk= scn.nextLine();
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
    
    System.out.println("....Who are you? Why are you here?");
    System.out.println("1: I was told to say hi?");
    System.out.println("2: Why are you here?");
    
    int choice = scn.nextInt();
    while (choice!=1 && choice !=2) {
    	System.out.println("You're not making any sense to me");
    }
    if(choice == 1) {
    	System.out.println("...you should have ignored that. Do you do whatever anyone tells you to do?");
    }
    else if(choice ==2) {
    	System.out.println("WHO AM I!!!!!! I LIVE HERE YOU *$%!#$%");
    }
    
    System.out.print("\n");
    
    System.out.println("I don't know what you're here for... but, there is nothing here");
    
    System.out.print("\n");
    
    
   
    
    

   










    

  }//end of main
}//end of class
