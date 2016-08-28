package com.codility.lessons

import com.codility.SolutionTest

class CountDivTest extends SolutionTest(CountDiv, Seq(
  (6, 11, 2) -> 3,
  (1,4,3) -> 1,
  (2,5,3) -> 1,
  (3,6,3) -> 2,
  (1,5,3) -> 1,
  (2,6,3) -> 2,
  (0,0,11) -> 1,
  (11,11,11) -> 1,
  (0, 2000000000, 1) -> 2000000001,
  (0, 2000000000, 2000000000) -> 2
))
// 1, 2, 3 , 4, 5, 6, 7