package advent

import org.scalatest.{FlatSpec, Matchers}

import scala.language.implicitConversions

trait Advent extends FlatSpec with Matchers {

  implicit class AdventString(s: String) {
    def splitOnSpace: Array[String] = s.split("\\s+")

    def splitOnNewline: Array[String] = s.split("\n")
  }

}
