package com.codility.lessons

import com.codility.Solution

object CountDiv extends Solution[(Int, Int, Int), Int]{

  override def solution(tuple: (Int, Int, Int)): Int = { val (a, b, k) = tuple
    val p = (a-1)%k
    val l = b - a + 1 + p
    l/k
  }
}


















