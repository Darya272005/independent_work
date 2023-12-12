package verification_work1_ide_app;

public class Main5 {
	public static void main(String[] args) {
		double A = 1.0;
		double X1 = -2 * A;
		double dX = A / 5.0;
		int N = 10;

		System.out.println("X\t\t\tY");

		for (int i = 0; i < N; i++) {
			double X = X1 + i * dX;
			double Y;

			if (X <= 0) {
				Y = (A / 2.0) * (Math.exp(X / A) - Math.exp(-X / A));
			} else {
				Y = (4 * Math.pow(A, 3)) / (Math.pow(X, 2) + 4 * Math.pow(A, 2));
			}

			System.out.printf("%.6f\t%.6f\n", X, Y);
		}
	}
}
