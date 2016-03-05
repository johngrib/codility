/*
 * https://codility.com/programmers/task/passing_cars/
 */
object Lesson04_PassingCars {

  def main(args: Array[String]): Unit = {
    val rs = solution(Array(0, 1, 0, 1, 1))
    println(rs)
  }

  def solution(A: Array[Int]): Int = {

    def calc(AA: List[Int], sum:Int, result: Int): Int = {
      if (AA.isEmpty)
        return result

      if (AA.head == 0) {
        return calc(AA.tail, sum, sum + result)
      } else {
        return calc(AA.tail, sum - 1, result)
      }
    }

    calc(A.toList, A.sum, 0)
  }
}