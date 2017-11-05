package IntroToJUnitTest;

public class JUnitTestMethods {

	String multiply(int x, int y) {
		int num = x * y;
		String expression = x + " x " + y+ " = " + num;
		return expression;
	}

	boolean isPrime(int x) {
		boolean prime;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				prime = false;
				return prime;
			}
		}
		return prime = true;
	}

	boolean isSquare(int x) {
		boolean square;
		if(Math.sqrt(x)%1 == 0) {
			square = true;
			return square;
		}
		return square = false;
	}
	
	boolean isCube(int x) {
		boolean cube;
		if(Math.cbrt(x)%1 == 0) {
			cube = true;
			return cube;
		}
		return cube = false;
	}
	
}
