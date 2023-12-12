package verification_work1_ide_app;

public class Main4 {
	public static void main(String[] args) {
		int n = 3;
		int counter = 0;

		double[] x = { -2, 0, 2 };
		double[] y = { -1, 0, 1 };

		for (int i = 0; i < n; i++) {
			if ((x[i] > 0) && (y[i] > 0)) {
				counter++;
			}
		}

		System.out.println("Количество точек, попавших в заданную область: " + counter);
	}
}
