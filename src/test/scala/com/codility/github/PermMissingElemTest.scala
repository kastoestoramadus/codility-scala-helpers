package com.codility.github

import com.codility.SolutionTest

class PermMissingElemTest extends SolutionTest(PermMissingElem, Seq(
  Array(2, 3, 1, 5) -> 4,
  Array(2, 3, 1, 4) -> 5,
  Array(2, 3, 5, 4) -> 1,
  Array(2, 3, 1, 5, 6) -> 4
))

