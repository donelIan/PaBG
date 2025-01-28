//Blueprint of the game

package pabgGame;
import java.util.Scanner;
import java.util.Random;
public class Game {
	  
	  Random random = new Random();
	  Scanner s = new Scanner(System.in);
	  
	  Game() throws InterruptedException{
		  
		  int score = 0, lives = 5, seconds = 3;
		  
		  while(lives > 0) {
			  
			  		System.out.println("\nLet's play Rock-Paper-Scissors!");
				    System.out.println("1 = Bato (Rock)");
				    System.out.println("2 = Papel (Paper)");
				    System.out.println("3 = Gunting (Scissors)");
				    System.out.print("Enter your choice: ");
				   
				    		int userInput = 0;
						    while (true) { // Input validation for Rock-Paper-Scissors
						        try {
						            userInput = Integer.parseInt(s.nextLine());
						            if (userInput >= 1 && userInput <= 3) {
						                break;
						            } else {
						            	System.out.println("---------------------------------------");
						                System.out.print("  Invalid choice. Please enter 1, 2, or 3: ");
						            }
						        } catch (NumberFormatException e) {
						        	System.out.println("---------------------------------------");
						            System.out.print("Invalid input. Please enter a valid integer (1, 2, or 3): ");
						        }
						    }

						    int computerInput = random.nextInt(3) + 1; // Computer choice (1, 2, or 3)

						    // Determine and display the result
						    if (userInput == computerInput) {
						    	System.out.println("-----------------------------------------");
						        System.out.println("It's a draw!");
						    } else if ((userInput == 1 && computerInput == 3) || 
						               (userInput == 2 && computerInput == 1) || 
						               (userInput == 3 && computerInput == 2)) {
						    	System.out.println("-----------------------------------------");
						        System.out.println("You win!");
						        score += 10;
						        System.out.println("-----------------------------------------");
						        System.out.println("Score: " + score);
						    } else {
						    	System.out.println("-----------------------------------------");
						        System.out.println("Computer wins!");
						        lives--;
						        System.out.println("Life "+ lives + " -1");
						    }

						    // Display the computer's choice
						    switch (computerInput) {
						        case 1:
						        	System.out.println("-----------------------------------------");
						            System.out.println("Computer choice: Bato (Rock)");
						            break;
						        case 2:
						        	System.out.println("-----------------------------------------");
						            System.out.println("Computer choice: Papel (Paper)");
						            break;
						        case 3:
						        	System.out.println("-----------------------------------------");
						            System.out.println("Computer choice: Gunting (Scissors)");
						            break;
						    }
						    if(lives != 0) {
					  }else {
						  Main m1 = new Main();
						  
						  System.out.println("+-------------------+");
						  System.out.println("|     Game Over     |");
						  System.out.println("|Score: " + score + "          |");
						  System.out.println("+-------------------+");
						  System.out.println("Do you wish to try again?");
						  System.out.println("Press 1 if yes, 2 if you wish to exit.");
						  System.out.println("Choice: ");
						  int retry = 0;
						    while (true) { // Input validation for Rock-Paper-Scissors
						        try {
						            retry = Integer.parseInt(s.nextLine());
						            if (retry >= 1 && retry <= 2) {
						            	if(retry == 1) {
						            		m1.main(null);
						            		break;
						            	}else{
						            		 System.out.println("You have succesfully exitted the program!");
						            		break;
						            	}
						                
						            } else {
						            	System.out.println("---------------------------------------");
						                System.out.print("  Invalid choice. Please enter 1, or 2: ");
						            }
						        } catch (NumberFormatException e) {
						        	System.out.println("---------------------------------------");
						            System.out.print("Invalid input. Please enter a valid choice (1, or 2): ");
						        }
						    }
						 
					  }	
		  }
		  	
		    s.close(); // Close the scanner at the end 
		    
	  }
	  public static void clearScreen() {
		  System.out.println("\033[H\033[2J");
		  System.out.println();
	  }
	
		
	}
