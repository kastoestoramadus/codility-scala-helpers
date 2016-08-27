package com.codility

import org.scalatest.{FlatSpec, Matchers}

import scala.runtime.ScalaRunTime

abstract class SolutionTest[I,O](sol: Solution[I,O], testCases: Seq[(I, O)]) extends FlatSpec with Matchers{
  "Given Solution" should "pass testcases from the table" in {
    for(in <- testCases) {
      val prettyIn = ScalaRunTime.stringOf (in._1)

      withClue(s"For parameters $prettyIn :\n\t") {
        sol.solution(in._1) should equal(in._2) }
    }
  }
}
