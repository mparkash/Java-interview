package gov.cms.esrd.qip.util;

import java.util.Random;
import java.util.Scanner;

public class TEST {

	private static Scanner scannerInput;

	public static void main(String[] args) {
		int highNum = 0;
    	int lowNum = 0;
    	int guess;
    	String userGuess;
    	boolean gameStarted = false;
    	Random rand = new Random();
    	scannerInput = new Scanner(System.in);
    	System.out.println("Welcome to Number Guessing game!Please type " +" READY "+" to Start");
    	
    	if((!gameStarted) && scannerInput.next().trim().equalsIgnoreCase("READY")){
    		gameStarted = true;
    	}
    	
    	if (gameStarted) {
    		guess = rand.nextInt(100);
    		while (gameStarted) {
    			System.out.println("Is the number "+ guess+" ?");
    			userGuess = scannerInput.next();
    			if(null != userGuess) {
    				if(userGuess.trim().equalsIgnoreCase("Yes")){
    					System.out.println("Gussed Numder is :"+ guess+" .Bye........... ");
    					gameStarted = false;
    					break;
    				}else if(null != userGuess && userGuess.trim().equalsIgnoreCase("lower")){
        				highNum = guess;
            			guess= guess/2;
//            			System.out.println("Is the number "+ guess+" ?");
            		}else if (null != userGuess && userGuess.trim().equalsIgnoreCase("higher")){
            			lowNum = guess;
            			guess= guess*2;
//            			System.out.println("Is the number "+ guess+" ?");
            		}
    				
    				if (0 != lowNum && 0 != highNum){
    					guess = (highNum+lowNum)/2;
    				}
    				
    			}
    			
    		}
    		
    	}
    	

	}

}
