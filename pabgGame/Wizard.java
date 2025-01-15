package pabgGame;
import java.util.Scanner;
import java.util.Random;

public class Wizard {

	String name, type = "Wizard";
	int points, health;
	
	Wizard(String name){
		this.name = name;
		this.points = 0;
		this.health = 5;
	}

	void greet() {
		System.out.println("");
		System.out.println("\nHello welcome, " + name + " here is your stats.");
		System.out.println("Class        : " + type);
		System.out.println("Points       : " + points);
		System.out.println("Lives        : " + health);
				
	}

}
