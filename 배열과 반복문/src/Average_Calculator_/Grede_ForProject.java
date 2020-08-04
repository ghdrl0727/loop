package Average_Calculator_;

public class Grede_ForProject {

	public static void main(String[] args) {

		int[] scores = new int[4];
		scores[0] = 97;
		scores[1] = 90;
		scores[2] = 91;
		scores[3] = 58;

		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
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
	}
}
