package com.codility.lessons

import com.codility.Solution

/**
  * Example of not single input argument.
  * Solution taken from: https://github.com/wjjal/Codility/blob/master/src/Lessons/Lesson5_Prefix_Sums/GenomicRangeQuery.scala
  */
object GenomicRangeQuery extends Solution[(String, Array[Int], Array[Int]), Array[Int]]{
  // def solution(S: String, P: Array[Int], Q: Array[Int]): Array[Int]
  override def solution(tup: (String, Array[Int], Array[Int])): Array[Int] = { val (s, p, q) = tup
    // from here you can Copy/Paste between IDE and codility webpage
    val n = s.length()
    val A = new Array[Int](n + 1)
    val C = new Array[Int](n + 1)
    val G = new Array[Int](n + 1)
    val T = new Array[Int](n + 1)
    for (i <- 1 to n) {
      A(i) = A(i - 1)
      C(i) = C(i - 1)
      G(i) = G(i - 1)
      T(i) = T(i - 1)
      s(i - 1) match {
        case 'A' => A(i) += 1
        case 'C' => C(i) += 1
        case 'G' => G(i) += 1
        case 'T' => T(i) += 1
      }
    }
    val re = new Array[Int](p.length)

    for (i <- p.indices) {
      val ps = p(i)
      val qs = q(i) + 1
      if (A(qs) - A(ps) > 0)
        re(i) = 1
      else if (C(qs) - C(ps) > 0)
        re(i) = 2
      else if (G(qs) - G(ps) > 0)
        re(i) = 3
      else if (T(qs) - T(ps) > 0)
        re(i) = 4
    }
    re
  }
}
