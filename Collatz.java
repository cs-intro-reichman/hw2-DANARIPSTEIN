// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];
		if (mode.equals("v")) {
			int number = 0;
			int count = 1;
			int seed = 1;
			int seedcount = 1;
			while (seedcount <= N) {
				System.out.print(seed + " ");
				while (number != 1) {
					if (seed % 2 == 0) {
						seed = seed / 2;
					} else {
						seed = seed * 3 + 1;
					}
					number = seed;
					System.out.print(number + " ");
					count ++;
				}
				System.out.print("(" + count + ")");
				System.out.println();
				seedcount ++;
				seed = seedcount;
				count = 1;
				number = 0;
			}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}
		if (mode.equals("c")){
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}
	}
}
