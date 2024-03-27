package studio7;

public class Complex {
	
	private double re;
	private double im;
	
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	public Complex add(Complex other) {
		double newRe = this.re + other.re;
		double newIm = this.im + other.im;
		
		return new Complex(newRe, newIm);
	}
	
	public Complex multiply(Complex other) {
		
		double newRe = this.re * other.re - this.im * other.im;
		
		double newIm = this.re * other.im + this.im * other.re;
		
		return new Complex(newRe, newIm);
	}
	
	public String toString() {
		
		return this.re + " + " + this.im + "i";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(2, 1);
		Complex c2 = new Complex(3, 2);
		
		System.out.println(c1.add(c2).toString());
		System.out.println(c1.multiply(c2).toString());

	}

}
