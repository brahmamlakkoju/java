public class SecondMax {

	public static void main(String[] args) {
		int[] a = { 32, 45, 65, 89, 85, 100 };
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secondMax = max;
				max = a[i];
			} else if (a[i] > secondMax) {
				secondMax = a[i];
			}
		}
		System.out.println(secondMax);

	}
}