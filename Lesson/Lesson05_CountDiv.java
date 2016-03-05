/*
 * https://codility.com/programmers/task/count_div/
 */
public class Lesson05_CountDiv {

	public int solution(int A, int B, int K) {

		int bValue = B / K;
		int aValue = A / K;
		int aFlag = A % K == 0 ? 1 : 0;

		return bValue - aValue + aFlag;
	}
}