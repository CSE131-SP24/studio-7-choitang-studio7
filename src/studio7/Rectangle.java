package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return 2 * (length + width);
	}
	
	public boolean isSmaller(Rectangle other) {
		
		return this.getArea() < other.getArea();
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
	public String toString() {
		
		return "Rectangle with length " + length + " and width " + width;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle(4, 3);
		Rectangle rec2 = new Rectangle(5, 5);
		
		System.out.println(rec1.toString());
		System.out.println(rec1.getArea());
		System.out.println(rec1.getPerimeter());
		
		System.out.println(rec1.isSmaller(rec2));
		
		System.out.println(rec2.isSquare());
	}

}
