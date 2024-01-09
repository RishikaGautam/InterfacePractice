
public class TestClass{
	
	public static void main(String[] args) {
		//creating a Rectangle object
		Shape r = new Rectangle("Rectangle", "blue", 4, 5.0, 7.0);
		
		//creating a Circle object
		Shape c = new Circle("Circle", "white", 0, 4.5);
		
		//creating a Triangle object
		Shape t = new Triangle("Triangle", "red", 3, 7.2, 9.3, 11.4);
		
		//creating an array with all the shape objects
		Shape[] shapes = new Shape[3];
		shapes[0] = r; //rectangle
		shapes[1] = c; //circle
		shapes[2] = t; //triangle
		
		shapes[0].toString();
		
		
		//creating for each loop to call area and perimeter on all shapes
		for(Shape i : shapes) {
			System.out.println("Perimeter: " + i.getPerimeter());
			System.out.println("Area: " +  i.getArea());
			
		}
		
		//comparing shapes directly from the Shape Class
		System.out.println("Comparing rectangle and triangle: " + shapes[2].compareTo(shapes[0])); //expected should be -2
		System.out.println("Comparing circle and triangle: "+shapes[2].compareTo(shapes[1])); //expected should be -30
		System.out.println("Comparing circle and rectangle: " + shapes[0].compareTo(shapes[1])); //expected should b -28
		
		//the toString method works properly as well
		System.out.println(shapes[0].toString());
		System.out.println(shapes[1].toString());
		System.out.println(shapes[2].toString());
		
		
		
		//comparing each object with each other
		//System.out.println("Comparing triangle and circle: " + c.compareTo(t)); //should be 30
		//System.out.println("Comparing triangle and rectangle: " + r.compareTo(t)); //should be 2
		//System.out.println("Comparing triangle and triangle: " + t.compareTo(t)); // should be 0
		
		//System.out.println("Comparing circle and triangle: " + t.compareTo(c)); //should be -30
		//System.out.println("Comparing rectangle and triangle: " + t.compareTo(r)); //should be -2
	
		
	
		
	}

	

}

