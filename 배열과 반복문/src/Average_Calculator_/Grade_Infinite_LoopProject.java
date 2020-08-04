package Average_Calculator_;

import java.util.Scanner;

public class Grade_Infinite_LoopProject {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] scores = new int[4];
		scores[0] = 97;
		scores[1] = 90;
		scores[2] = 91;
		scores[3] = 58;

		int sum = 0;

		for (;;) {
			sum = scores[0] + scores[1] + scores[2] + scores[3];
			String text = input.next();
			if (text.equalsIgnoreCase("keep")) {
				double average = sum / 4;
				String rank;
				if (average >= 95) {
					rank = "A+";
				} else if (average >= 90) {
					rank = "A";
				} else if (average >= 85) {
					rank = "B+";
				} else if (average >= 80) {
					rank = "B";
				} else if (average >= 70) {
					rank = "C";
				} else if (average >= 60) {
					rank = "D";
				} else {
					rank = "F";
				}
				System.out.println("����: " + rank);
			}
			if (text.equalsIgnoreCase("quit")) {
				break;
			}
		}
	}
}
