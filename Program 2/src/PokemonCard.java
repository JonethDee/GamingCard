
/**
 *  Program #2
 *  Inheritance
 *  CS160-3
 *  Date 2/20/22
 *  @author  Joneth Damdee
  */
public class PokemonCard extends GamingCard{ //PokemonCard inherits all methods in GamingCard class
	
	public String type;
	public int damage;
	public String attack;
	

	public PokemonCard(String name, String image, String category, String game, String type, int damage, String attack){//Same as above but now has the new parameters of the constructors in this class
		super(name, image, category, game);//runs the parent class methods nd parameters 
		this.type = type; //All assigns the parameter passed in to the constructor
		this.damage = damage;
		this.attack = attack;
		
	}
	
	public void setType(String type) { //Using setter and retrns the type
		this.type = type;
	}
	
	public String getType(){ //Using getter to get type of parameter
		return type;
	}
	
	public void setPokedex(int damage) { // returns the damage
		this.damage = damage;
	}
	public int getPokedex() { //Get pokedex input
		return damage;
	}
	
	public void setAbility(String attack) { //returns the attack
		this.attack = attack;
	}
	public String getAbility() { //gets ability input
		return attack;
	}
	
	
	public String toString() { //returns string runs through all to string method and prints this class last
		return super.toString() + ", " + this.damage + ", a " + this.type + "-type with " + this.attack + " ability."; //super keyword runs the parent class to string method then downs to this final sub class
	}
	
	}
