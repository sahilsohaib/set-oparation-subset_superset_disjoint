object SetRelationships {
  def main(args: Array[String]): Unit = {
    val setA = Set(1, 2, 3, 4, 5)
    val setB = Set(3, 4, 5)
    val setC = Set(6, 7, 8)

    println(setRelationships(setA, setB))  // Output: "Set 1 is a subset of Set 2."
    println(setRelationships(setB, setA))  // Output: "Set 2 is a subset of Set 1."
    println(setRelationships(setA, setC))  // Output: "Set 1 and Set 2 are disjoint sets."
    println(setRelationships(setB, setC))  // Output: "Set 1 and Set 2 have no specific relationship."
  }

  def setRelationships(set1: Set[Int], set2: Set[Int]): String = {
    if (set1 == set2) {
      "Set 1 and Set 2 are equal sets."
    } else if (set1.subsetOf(set2)) {
      "Set 1 is a subset of Set 2."
    } else if (set2.subsetOf(set1)) {
      "Set 2 is a subset of Set 1."
    } else if (set1.intersect(set2).isEmpty) {
      "Set 1 and Set 2 are disjoint sets."
    } else {
      "Set 1 and Set 2 have no specific relationship."
    }
  }
}
