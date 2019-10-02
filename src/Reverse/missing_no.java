package Reverse;

public class missing_no {
	public static void main(String[] agrs) {
		int a[] = { 1, 2, 4 };
		int sum = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

		int sum1 = 0;
		for (int j = 0; j <= 4; j++) {
			sum1 = sum1 + j;

		}
		System.out.println(sum1);
		System.out.println("missing no.is" + (sum1 - sum));

	}
}
