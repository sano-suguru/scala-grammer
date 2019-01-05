class Student(val name: String, val grade: Int) {


  override def toString: String = s"Student($name, $grade)"

  def canEqual(other: Any): Boolean = other.isInstanceOf[Student]

  override def equals(other: Any): Boolean = other match {
    case that: Student =>
      (that canEqual this) &&
        name == that.name &&
        grade == that.grade
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(name, grade)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

object Student {
  def apply(name: String, grade: Int): Student = new Student(name, grade)
}

case class CStudent(val name: String, val grade: Int)
