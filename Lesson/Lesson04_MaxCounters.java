import java.util.Arrays;

/*
 * https://codility.com/programmers/task/max_counters/
 * 
 * TODO: improve performance
 */
public class Lesson04_MaxCounters {

	public static void main(String[] args) {

		Lesson04_MaxCounters.solution(3, new int[] { 3 });

	}

	public static int[] solution(int N, int[] A) {
		int max = 0;
		int[] counters = new int[N];

		for (int i = 0; i < A.length; i++) {
			int x = A[i];

			if (1 <= x && x <= N) {
				counters[x - 1] += 1;

				if (counters[x - 1] > max)
					max = counters[x - 1];

			} else if (x == N + 1) {
				Arrays.fill(counters, max);
			}
		}
		return counters;
	}

}