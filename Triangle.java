
public class Triangle extends Shape {

	//creating private var for only this class
	private double s1;
	private double s2;
	private double s3;
	
	public Triangle(String name, String color, int numSides,  double s1, double s2, double s3) { //constructor
		super(name, color, numSides); //invoke the superclass constructor
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	@Override
	public double getArea() {
		double s = ((s1+s2+s3)/2);
		return(Math.pow((s*(s-s1)*(s-s2)*(s-s3)), 0.5)); //returning the area of a triangle
	}
	
	@Override
	public double getPerimeter() {
		return (s1+s2+s3); //returning the perimeter of a triangle
	}
	

	
}
