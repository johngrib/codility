/*
 * https://codility.com/programmers/task/frog_jmp/
 */
object Lesson03 {
  import scala.collection.JavaConversions._

  object Solution {
    def solution(X: Int, Y: Int, D: Int): Int = {
      val distance: Int = Y - X

      val count = distance % D

      if (count == 0)
        return distance / D
      else
        return (distance / D) + 1
    }
  }
}