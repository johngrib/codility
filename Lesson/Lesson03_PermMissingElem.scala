/*
 * https://codility.com/demo/take-sample-test/perm_missing_elem/
 */
object Lesson03_PermMissingElem {

  def main(args: Array[String]): Unit = {
  }

  def solution(A: Array[Int]): Int = {
    val min = 1
    val max = A.length + 1
    val sum = (min + max) * max / 2
    
    sum - A.sum
  }

}