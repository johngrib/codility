/*
 * https://codility.com/demo/take-sample-test/min_avg_two_slice/ 
 */
public class Lesson05_MinAvgTwoSlice {

	public int solution(int[] A) {

		int result = A.length - 1;

		int[] map = new int[A.length + 1];

		for (int i = 0; i < A.length; ++i) {
			map[i + 1] = map[i] + A[i];
		}

		double min = Double.MAX_VALUE;

		for (int P = 0, Q = 2; Q < map.length; P++, Q++) {

			int sum = map[Q] - map[P];

			double average = (sum) / (double) 2;

			if (average < min) {
				min = average;
				result = P;
			}

			if (Q + 1 < map.length) {
				sum = map[Q + 1] - map[P];
				average = (sum) / (double) 3;

				if (average < min) {
					min = average;
					result = P;
				}
			}

		}

		return result;
	}
}
