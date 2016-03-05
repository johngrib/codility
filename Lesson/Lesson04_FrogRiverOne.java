/*
 * https://codility.com/programmers/task/frog_river_one/
 */
public class Lesson04_FrogRiverOne {

	public static int solution(int X, int[] A) {

		if (A.length < X)
			return -1;

		int checkCount = X;
		boolean[] checkList = new boolean[X + 1];
		checkList[0] = true;

		for (int time = 0; time < A.length; time++) {

			int location = A[time];
			boolean leaf_fallen = location < checkList.length
					&& !checkList[location];

			if (leaf_fallen) {
				checkCount--;
				checkList[location] = true;
			}

			if (checkCount < 1) {
				return time;
			}
		}

		return -1;
	}
}