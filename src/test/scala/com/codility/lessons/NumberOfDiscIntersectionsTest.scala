package com.codility.lessons

import com.codility.SolutionTest

class NumberOfDiscIntersectionsTest extends SolutionTest(NumberOfDiscIntersections,
  Seq(
    Array(1, 2147483647, 0) -> 2,
    Array(1,5,2,1,4,0) -> 11
  ))