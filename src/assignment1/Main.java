package assignment1;

public class Main {

	public static void main(String[] args) {
		double p = 3;
		double q = 7;

		double n = p * q;

		double e = 2;
		double phi = (p - 1) * (q - 1);

		while (e < phi) {
			if (gcd(e, phi) == 1)
				break;
			e++;
		}

		int k = 2;
		double d = (1 + (k * phi)) / e;

		double msg = 12;

		System.out.println("Message data = " + msg);

		double c = Math.pow(msg, e);
		c = c % n;
		System.out.println("Encrypted data = " + c);

		double m = Math.pow(c, d);
		m = m % n;
		System.out.println("Original Message Sent = " + m);
	}

	private static double gcd(double a, double b) {
		return (a % b == 0 ? b : gcd(b, a % b));
	}
}
