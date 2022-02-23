
/**
 *  Program #2
 *  Inheritance
 *  CS160-3
 *  Date 2/20/22
 *  @author  Joneth Damdee
  */
public class TradingCard {
	
	public String name; //Created constructor using public access modifier with the trading card "name"
	public String image;// Another construtor for the image type. Same as above

	public TradingCard(String name, String image) { // Same method but this takes parameters of string from the constructor
		this.name = name; // Assigns constructor with the parameter passed in for name
		this.image = image; //assigns constructor with parameter passed in for image kind
		}
	public String getName() {//Uses getter to the get name
		return name;
	}
	public String getImg() {//Uses getter to get image
		return image;
	}
	@Override
	public String toString() { // to string method to print a given return string rather than the memory space
		return this.name; 
	}
}

		
		
	
