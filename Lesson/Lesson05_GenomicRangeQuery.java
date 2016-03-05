/*
 * https://codility.com/programmers/task/genomic_range_query/
 */

public class Lesson05_GenomicRangeQuery {

	public static int[] solution(String S, int[] P, int[] Q) {
		
		char[] dna = S.toCharArray();
		int[][] map = new int[3][dna.length + 1];
		int[] result = new int[P.length];

		int aa, cc, gg;
		for (int i = 0; i < dna.length; i++) {
			aa = cc = gg = 0;
			if(dna[i] == 'A')
				aa = 1;
			else if(dna[i] == 'C')
				cc = 1;
			else if(dna[i] == 'G')
				gg = 1;
			
			map[0][i + 1] = map[0][i] + aa;
			map[1][i + 1] = map[1][i] + cc;
			map[2][i + 1] = map[2][i] + gg;
		}
		
		for (int i = 0; i < P.length; i++) {
			int left = P[i];
			int right = Q[i] + 1;
			
			if(map[0][right] - map[0][left] > 0)
				result[i] = 1;
			else if(map[1][right] - map[1][left] > 0)
				result[i] = 2;
			else if(map[2][right] - map[2][left] > 0)
				result[i] = 3;
			else
				result[i] = 4;
		}
		return result;
	}
}
