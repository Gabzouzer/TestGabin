package poo;

import java.util.logging.Logger;

public class Main {

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {
		Rational r1 = new Rational(1,3);
		Rational r2 = new Rational(1,2);
		
		Rational result1 = r1.add(r2);
		boolean result2 = r1.lessThan(r2);
		
		LOGGER.info("Le resultat des deux fractions vaut " +  result1);
		LOGGER.info("Est ce que r1 est plus petit que r2 ? " + result2);
	}
}
