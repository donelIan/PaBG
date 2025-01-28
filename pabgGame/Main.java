package pabgGame;

import java.util.Scanner;
import java.util.Random;

public class Main {
	
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        // Class selection
        int choice = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("+-----------------------+");
                System.out.print("|   Select a class      |");
                System.out.print("\n|  1. Wizard            |");
                System.out.print("\n|  2. Warrior           |");
                System.out.print("\n|  3. Archer            |");
                System.out.print("\n|  4. Exit              |");
                System.out.print("\n+-----------------------+");
                System.out.print("\nType the class that you want: ");

                choice = Integer.parseInt(s.nextLine()); // Ensures input is read as a String and parsed as an integer

                if (choice >= 1 && choice <= 4) {
                    validInput = true; // Exit the loop if input is valid
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        
     // Get user name
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        
        // Output the selected class or handle the "Exit" option
        switch (choice) {
            case 1:
                System.out.println("You selected Wizard."); 
                if(choice == 1) {
                	System.out.println("\nHello mighty Wizard the land of Programmia is in danger. A Dragon has causing this chaos, help us fight and restore the peace to Programmia!" );
                }
                Wizard g1 = new Wizard();
                
                break;
            case 2:
                System.out.println("You selected Warrior.");
                if(choice == 2) {
                	System.out.println("\nHello mighty Warrior the land of Programmia is in danger. A Dragon has causing this chaos, help us fight and restore the peace to Programmia!" );
                }
                Warrior g2 = new Warrior();
                break;
            case 3:
                System.out.println("You selected Archer.");
                if(choice == 3) {
                	System.out.println("\nHello mighty Archer the land of Programmia is in danger. A Dragon has causing this chaos, help us fight and restore the peace to Programmia!" );
                }
                Archer g3 = new Archer();
                break;
            case 4:
                System.out.println("Exiting...");
                s.close(); // Close the scanner before exiting
                return;
        }

        // Rock-Paper-Scissors game
    }
}
