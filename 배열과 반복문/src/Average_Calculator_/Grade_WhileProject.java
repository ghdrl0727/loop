package Average_Calculator_;

public class Grade_WhileProject {

	public static void main(String[] args) {

		int[] scores = new int[4];
		scores[0] = 97;
		scores[1] = 90;
		scores[2] = 91;
		scores[3] = 58;

		int loopCount = 1;
		while (loopCount <= scores.length) {
			int sum = scores[0] + scores[1] + scores[2] + scores[3];

			double average = sum / scores.length;
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
			System.out.println("¼ºÀû: " + rank);
			loopCount++;
		}
	}
}
