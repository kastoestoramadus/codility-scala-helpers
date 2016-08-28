package com.codility.lessons

import com.codility.SolutionTest

class CountDivTest extends SolutionTest(CountDiv, Seq(
  (6, 11, 2) -> 3,
  (1,4,3) -> 1,
  (2,5,3) -> 1,
  (3,6,3) -> 2,
  (1,5,3) -> 1,
  (2,6,3) -> 2
))
// 1, 2, 3 , 4, 5, 6, 7