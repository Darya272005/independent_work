package verification_work1_ide_app;

public class Main8 {
	public static void main(String[] args) {
		double x = 0.1;
		double difference = 0.1;
		double limit = 10.0;

		System.out.println("x\t\tf(x)");

		while (x <= limit) {
			double result = summ(x);

			System.out.printf("%.6f\t%.6f\n", x, result);

			if (result == 0.0) {
				break;
			}

			x += difference;
		}
	}

	public static double summ(double x) {
		return Math.pow(x, 2) - Math.exp(2 * x) + 4;
	}
}
