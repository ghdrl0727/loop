package Average_Calculator_;

public class ¸¶¸§¸ð2 {

	public static void main(String[] args) {

		int line = 5;
		int space = line / 2 - 1;
		int star = 1;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < star; j++) {
				System.out.print('*');
			}
			for (int j = 0; j < space; j++) {
				System.out.print(' ');
			}
			System.out.println();
			if (i <= 1) {
				star = star + 2;
				space = space - 1;
			} else {
				star = star - 2;
				space = space + 1;
			}
		}
	}

}
