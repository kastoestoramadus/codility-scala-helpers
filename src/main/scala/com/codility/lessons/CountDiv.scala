package com.codility.lessons

import com.codility.Solution

object CountDiv extends Solution[(Int, Int, Int), Int]{

  override def solution(tuple: (Int, Int, Int)): Int = { val (a, b, k) = tuple
    val p =  java.lang.Math.floorMod(a - 1, k)
    val l = (b - a + 1).toLong + p
    (l/k).toInt
  }
}














