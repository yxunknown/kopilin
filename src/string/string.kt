package string

object blank
object empty

infix fun String.be(x: blank): Boolean = isBlank()

infix fun String.be(x: empty): Boolean = isEmpty()

