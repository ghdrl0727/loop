package Average_Calculator_;

public class ¸¶¸§¸ð {

	public static void main(String[] args) {

		int i, j = 0;
		int star = 0;

		for (i = 0; i < 5; i += 2) {
			for (j = 5; j >= i; j -= 2) {
				System.out.print(" ");
			}
			for (star = 0; star <= i; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 0; i <= 5 - 2; i += 2) {
			System.out.print(" ");
			for (j = 0; j <= i; j += 2) {
				System.out.print(" ");
			}
			for (star = 5 - 2; star > i; star--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
