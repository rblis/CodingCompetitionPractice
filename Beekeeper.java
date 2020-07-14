import java.util.Scanner;

public class Beekeeper {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (true) {

			int N = in.nextInt();
			if (N == 0) {
				break;
			}

			int mostVals = -1;
			String bestWord = null;
			int mostCount = 0;

			for (int i = 0; i < N; i++) {

				String word = in.next();
				char[] wordChars = word.toCharArray();
				int count = 0;
				for (int j = 0; j < (wordChars.length - 1); j++) {
					if (wordChars[j] == wordChars[j + 1]
							&& (wordChars[j] == 'a' || wordChars[j] == 'e' || wordChars[j] == 'i'
									|| wordChars[j] == 'o' || wordChars[j] == 'u' || wordChars[j] == 'y')) {

						count++;

						if (j + 2 < wordChars.length) {
							if (wordChars[j + 2] == wordChars[j]) {
								System.err.println("ERROR, triple letter");
								return;
							}
						}
					}
				}

				if (count > mostVals) {
					mostVals = count;
					mostCount = 1;
					bestWord = word;
				} else if (count == mostVals) {
					mostCount++;
				}
			}

			System.out.println(bestWord);

			if (mostCount > 1) {
				System.err.println("ERROR, no unique solution");
			}
		}

	}

}
