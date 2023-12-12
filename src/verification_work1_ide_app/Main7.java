package verification_work1_ide_app;

public class Main7 {
	public static void main(String[] args) {
		double Xнач = 1.0;
		double HX = 0.5;
		int N = 10;

		double Zнач = 2.0;
		double HZ = 0.3;
		int M = 5;

		System.out.println("X\tZ\t\tResult");

		for (int i = 0; i < N; i++) {
			double X = Xнач + i * HX;

			for (int j = 0; j < M; j++) {
				double Z = Zнач + j * HZ;

				double result = Math.sqrt(Math.pow(Z, 2) + Math.pow(X, 2)) * Math.log(Z)
						+ (Math.abs(Math.log(Z)) / Math.sqrt(Math.pow(X, 2) - Math.pow(Z, 2) + 3.2));

				System.out.printf("%.6f\t%.6f\t%.6f\n", X, Z, result);
			}
		}
	}
}
