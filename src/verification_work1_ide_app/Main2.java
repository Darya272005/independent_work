package verification_work1_ide_app;

public class Main2 {

	public static void main(String[] args) {
		int n = 10;
		double a = 0.50;
		double b = 1.00;

		double step = (b - a) / (n - 1);

		System.out.println("Номер\tАргумент\tЗначение функции");

		for (int i = 0; i < n; i++) {
			double x = a + i * step;
			double result = Math.exp(2.2 * x / 2) - Math.abs(Math.sin(Math.PI * x) / (x + 2.0 / 3.0)) + 1.7;

			System.out.printf("%d\t%.6f\t%.6f\n", i + 1, x, result);
		}
	}
}
