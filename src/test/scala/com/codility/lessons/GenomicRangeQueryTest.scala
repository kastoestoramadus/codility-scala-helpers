package com.codility.lessons

import com.codility.SolutionTest

// ('CAGCCTA', [2, 5, 0], [4, 5, 6])
class GenomicRangeQueryTest extends SolutionTest(GenomicRangeQuery,
  Seq(
    ("CAGCCTA", Array(2, 5, 0), Array(4, 5, 6)) -> Array(2, 4, 1)
  )
)
