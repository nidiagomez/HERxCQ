package cqHacks;
import java.util.Scanner;
class cqHacks {
	
	public static void horizontalLine() {
		for (int i = 0; i<100; i++) {
			System.out.print("_");
		}
		System.out.println();
	}
	
	
  public static void main(String[] args) {

  System.out.println("One day you find a file on your computer you've never seen before.\nCurious and a more than a bit naive "
  		+ "you decide to click on it");
  
  		horizontalLine();
  		Scanner scn = new Scanner(System.in);
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
    
    System.out.println("....Who are you? Why are you here.... hello?\n");
    
    System.out.print("\n");
    
    System.out.println("I don't know what you're here for... but, there is nothing here");
    
    System.out.print("\n");
    
    
   
    
    

   










    

  }//end of main
}//end of class
