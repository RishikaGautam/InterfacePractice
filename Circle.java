
public class Circle extends Shape {
	
	//creating private var for only this class
	private double r;
	
	public Circle (String name, String color, int numSides,  double r) { //constructor
		super(name, color, numSides); //invoke the superclass constructor
		this.r = r;
	}
	
	@Override
	public double getArea() {
		return (Math.PI * r * r); //returning the area of a circle
	}
	
	@Override
	public double getPerimeter() {
		return (2 * Math.PI * r); //returning the perimeter of a circle
	}
	
	
}
