package verification_work1_ide_app;

public class Main6 {

	public static void main(String[] args) {
		int A = 3 * 1000;
		int B = 6 * 10000;
		int M = 4;
		int K;
		int count = 0;

		double T1 = Math.sqrt(A + B + M);
		double T2 = M * Math.sqrt(A + B);
		double T3 = Math.sqrt(A * B * M);
		double T4 = M * Math.sqrt(A * B);

		System.out.println("Значения f(K) удовлетворяющие условию:");

		for (K = -30; K <= 60; K++) {
			int fK = K * K * K - 25 * K * K + 50 * K + 1000;

			if ((fK > T1 && fK < T2) || (fK > T3 && fK < T4)) {
				System.out.println(fK);
			} else {
				count++;
			}
		}

		System.out.println("Количество значений f(K), не удовлетворяющих условию: " + count);
	}
}