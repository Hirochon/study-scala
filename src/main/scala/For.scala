object For extends App{
  def foo(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- 0 until n if i + j == v)
    yield (i, j)

  foo(10, 10) foreach {
    case (i, j) =>
      println(s"($i, $j) ")  // prints (1, 9) (2, 8) (3, 7) (4, 6) (5, 5) (6, 4) (7, 3) (8, 2) (9, 1)
  }

  println("----------")

  def foo2(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- 0 until n if i + j == v)
      println(s"($i, $j)")

  foo2(10, 10)
}
