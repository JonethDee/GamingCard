
/**
 *  Program #2
 *  Inheritance
 *  CS160-3
 *  Date 2/20/22
 *  @author  Joneth Damdee
  */
public class GamingCard extends TradingCard{//Everything in GamingCard class now has access to methods in tradingcard class with inheritance 
	
	public String category; // constructor parameter for game type
	public String game;//constructor parameter for game type
	
	
	GamingCard(String name, String image, String category, String game) { //A new method that takes in the constructor now passing in the parameters
		super(name, image); //Using the super keyword for parameters name and image it runs towards the parent class TradingCard and plugs it into the method invoked
		this.category = category; // assigns parameter passed in and assigns it to the new constructor
		this.game = game;
		
	}
	
	public String getCategory(){ //Gets category type 
		return category;
	}
	public String getGame() { //Gets game type
		return game;
	}

	
	public String toString() { //Overrides string to print the return statement
		return name + ": " + this.game + " character"; //Super keyword refers to the method in parent class then adds the new return statement to the parent class
		
	
	}

}
	
