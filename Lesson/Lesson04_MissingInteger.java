/*
 * https://codility.com/programmers/task/missing_integer/
 */
public class Lesson04_MissingInteger {

	public static int solution(int[] A) {
		
		boolean[] map = new boolean[A.length + 1];
		map[0] = true;
		
		for (int number : A) {
			if(0 < number && number <= A.length){
				map[number] = true;
			}
		}
		
		for (int i = 1; i < map.length; i++) {
			if(!map[i])
				return i;
		}
		return map.length;
	}
}