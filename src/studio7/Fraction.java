package studio7;

public class Fraction {
	
	private int num;
	private int denom;
	
	public Fraction(int num, int denom) {
		
		this.num = num;
		this.denom = denom;
	}
	
	public Fraction add(Fraction other) {
		int newNum = this.denom * other.num + this.num * other.denom;
		int newDenom = this.denom * other.denom;
		
		return new Fraction(newNum, newDenom).simplify();
	}
	
	public Fraction multiply(Fraction other) {
		int newNum = this.num * other.num;
		int newDenom = this.denom * other.denom;
		
		return new Fraction(newNum, newDenom).simplify();
	}
	
	public int gcd(int a, int b) {
		
		return b == 0 ? a : gcd(b, a % b);
		
	}
	
	public Fraction simplify() {
		int gcd = gcd(this.num, this.denom);
		return new Fraction(this.num / gcd, this.denom / gcd);
		
	}
	
	public String toString() {
		
		return num + " / " + denom;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction a = new Fraction(1, 2);
		Fraction b = new Fraction(2, 3);
		
		System.out.println(a.add(b).toString());
		System.out.println(a.multiply(b).toString());
		
	}

}
