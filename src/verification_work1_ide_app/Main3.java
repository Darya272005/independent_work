package verification_work1_ide_app;

public class Main3 {
	public static void main(String[] args) {
		double x = 0.5;
		int n = 20;

		double result = Math.sqrt(n * Math.PI) * summa1(x, n);

		System.out.println("Результат: " + result);
	}

	public static double summa1(double x, int n) {
		double sum = 0;

		for (int k = 1; k <= n; k++) {
			double term = (Math.sin(k * x / 2) + Math.sin((k * x - 1) / 2)) / Math.exp((x - 1) / k);
			sum += term;
		}

		return sum;
	}
}
