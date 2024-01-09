
public class Rectangle extends Shape{
	
	//creating private var for only this class
	private double len;
	private double width;
	

	public Rectangle (String name, String color, int numSides, double len, double width) { //constructor
		super(name, color, numSides); //invoke the superclass constructor
		this.len = len; 
		this.width = width;
		
	}
	
	@Override
	public double getArea() {
		return (len*width); //returning the area of a rectangle
		
	}
	
	@Override
	public double getPerimeter() {
		return ((2*len)+(2*width)); //returning the perimeter of a rectangle
	}
	
	
	
	
}
