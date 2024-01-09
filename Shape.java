
public abstract class Shape implements Comparable<Shape> {
	public abstract double getArea(); //converted getArea to abstract
	public abstract double getPerimeter(); //converted getPerimeter to abstract
	
	//adding the specified fields
	private String name;
	private String color; 
	private int numSides;
	
	//constructor to set these fields
	public Shape (String name, String color, int numSides) {
		this.name = name;
		this.color = color;
		this.numSides = numSides;
		
	}
	
	//compareTo methods moved to the Shape class
	public int compareTo(Shape other) {
		//compare these two shapes by subracting
		//will return pos number if greater than 
		//will return neg number if less than
		//will return 0 if equal
		return (int)getArea() - (int)other.getArea(); 
	}
	
	//toString method to print out the field values
	public String toString() {
		return "The " + name + " is " + color + " and has " + numSides + " sides.";
	}
	
	
}

