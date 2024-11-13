// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double approximated = 0.0;
		double odd = 1.0;
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				approximated = approximated + ( 1 / odd);
			} else {
				approximated = approximated - ( 1 / odd);
			}
			odd = odd + 2.0;
		}
		approximated = (approximated) * 4.0; //sa
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:   " + (double) approximated);
	}
}