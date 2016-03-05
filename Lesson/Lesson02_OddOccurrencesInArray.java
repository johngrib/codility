/**
 * https://codility.com/programmers/task/odd_occurrences_in_array/
 */
import java.util.Arrays;

public class Lesson02_OddOccurrencesInArray {

	public static int solution(int[] A) {

		Arrays.sort(A);
		int sum = 0;
		int sub = -1;
		for (int i = 0; i < A.length; i++) {
			int number = A[i] * sub;
			sum += number;
			sub *= -1;
		}
		return Math.abs(sum);
	}
}
