package advent

import org.scalatest.{FlatSpec, Matchers}

import scala.language.implicitConversions

trait Advent extends FlatSpec with Matchers {

  implicit class AdventString(s: String) {
    def splitOnSpace: Array[String] = s.split("\\s+").filter(_.length > 0).map(_.trim)

    def splitOnNewline: Array[Int] = s.split("\n").filter(_.length > 0).map(_.trim).map(_.toInt)
  }

}
