
public class Game {
 private String gameName;
 private String description;
 private double price;
public Game(String gameName, String description, double price) {
	super();
	this.gameName = gameName;
	this.description = description;
	this.price = price;
}
public String getGameName() {
	return gameName;
}
public void setGameName(String gameName) {
	this.gameName = gameName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
 
 
}
