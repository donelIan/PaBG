package pabgGame;
//Polymorphism
public class Warrior extends Wizard{

	Warrior(String name){
		super(name);
		this.type = "Warrior";
		this.health = 4;
	}
}
