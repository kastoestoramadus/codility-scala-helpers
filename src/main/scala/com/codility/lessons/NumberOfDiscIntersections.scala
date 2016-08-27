package com.codility.lessons

import com.codility.Solution

import scala.math._

object NumberOfDiscIntersections extends Solution[Array[Int], Int]{

  override def solution(a: Array[Int]): Int = greedy(a)

  def greedy(a: Array[Int]): Int = {
    var counter = 0
    // write your code in Scala 2.11
    for (i <- a.indices ) {
      for (j <- i+1 until a.length ) {
        if(abs(i-j) <= a(i).toLong+a(j).toLong)
          counter += 1
        if(counter>10000000)
          return -1
      }
    }
    counter
  }
}
