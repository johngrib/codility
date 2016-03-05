import java.util.Arrays;

/*
 * https://codility.com/programmers/task/perm_check/
 */
public class Lesson04_PermCheck {

	public static int solution(int[] A) {

		Arrays.sort(A);

		if (A[0] != 1)
			return 0;

		if (A[A.length - 1] != A.length)
			return 0;

		for (int i = 1; i < A.length; i++) {
			System.out.println(A[i-1] + " ; " + A[i]);
			if (A[i - 1] + 1 != A[i])
				return 0;
		}

		return 1;
	}
}