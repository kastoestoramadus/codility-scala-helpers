package com.codility.github

import com.codility.SolutionTest

class FrogJumpTest extends SolutionTest(FrogJump, Seq(
  (10, 85, 30) -> 3,
  (10, 85, 1) -> 75,
  (1, 85, 30) -> 3,
  (10, 85, 3) -> 25,
  (1, 1, 1000000000) -> 0,
  (1, 2, 1000000000) -> 1,
  (1000000000, 1000000000, 1000000000) -> 0,
  (1, 1, 1) -> 0
))

