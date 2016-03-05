/*
 * https://codility.com/programmers/task/tape_equilibrium/
 */
object Lesson03_TapeEquilibrium {

  def main(args: Array[String]): Unit = {
    val rs = solution(Array(3, 1, 2, 4, 3))
    println(rs)
  }

  def solution(A: Array[Int]): Int = {

    if (A.size == 2)
      return Math.abs(A(0) - A(1))

    var headSum = A(0)
    var tailSum = A.tail.sum
    var minDiff = Math.abs(headSum - tailSum)
    var P = 1

    for {
      i <- (1 until A.size - 1)
    } {
      headSum += A(i)
      tailSum -= A(i)
      
      println(headSum, tailSum)
      val diff = Math.abs(headSum - tailSum)
      if(diff < minDiff) {
        minDiff = diff
        P = i
      }
    }
    minDiff
  }
}