/*
 * https://codility.com/programmers/task/binary_gap/
 */
object Lesson01_BinaryGap {

  def solution(N: Int): Int = {
    val resultSet =
      N.toBinaryString
        .replaceAll("0*$", "")
        .split("1")
    if (resultSet.size > 0)
      resultSet.map(_.size).max
    else
      0
  }
}
