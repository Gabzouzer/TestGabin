package poo;

public class Rational {
	private int numerator;
	private int denominator;
	
	
	
	public Rational(int numerator, int denominator) {
		super();
		this.setNumerator(numerator);
		this.setDenominator(denominator);
	}

	public Rational() {
		this(0,1);
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		if (denominator == 0) {
			throw new RuntimeException ("denominator cannot be null");
		}
		this.denominator = denominator;
	}
	
	
	public Rational add (Rational r2) {
		 int nume = this.numerator * r2.denominator + this.denominator * r2.numerator;
	     int denom = this.denominator * r2.denominator;
	     return new Rational( nume, denom );
	}
	
	public boolean lessThan(Rational r2) {
		return this.numerator * r2.getDenominator() < this.denominator * r2.getNumerator();
	}
	
	public void simplify() {
        int a;
        int b;
        
        if ( this.numerator > this.denominator ) {
            a = this.numerator;
            b = this.denominator;
        } else {
            a = this.denominator;
            b = this.numerator;
        }
        
        int rest;
        while( (rest = a % b) != 0 ) {
            a = b;
            b = rest;
        }
        
        this.numerator /= b;
        this.denominator /= b;
    }    
	
	@Override
	public String toString() {
		return String.format("[%d/%d]", numerator, denominator);
	}
}
