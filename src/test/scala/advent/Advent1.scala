package advent

class Advent1 extends Advent {

  def partOne(input: String): Int = input.splitOnNewline.sum

  def partTwo(input: String): Int = {
    val ints = input.splitOnNewline.toList

    def find(current: Int, list: List[Int], visited: Set[Int]): Int = {
      val newFrequency = list.head + current
      if (visited.contains(newFrequency)) newFrequency else {
        val newList = if (list.tail.isEmpty) ints else list.tail
        find(newFrequency, newList, visited + newFrequency)
      }
    }

    find(ints.head, ints.tail, Set(0, ints.head))
  }

  partOne("+1\n+1\n+1\n") should be(3)
  partOne("+1\n+1\n-2\n") should be(0)
  partOne("-1\n-2\n-3\n") should be(-6)
  partTwo("+1\n-1\n") should be(0)
  partTwo("+3\n+3\n+4\n-2\n-4\n") should be(10)
  partTwo("-6\n+3\n+8\n+5\n-6\n") should be(5)
  partTwo("+7\n+7\n-2\n-7\n-4\n") should be(14)

  //  println(partOne(Inputs.advent1))
  //  println(partTwo(Inputs.advent1))
}
