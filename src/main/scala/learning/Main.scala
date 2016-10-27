package main.scala.learning

import main.scala.learning.roulette.{OneHundredPocketRoulette, StandardRoulette}

import scala.io.StdIn

object Main {

  private val standard = "Standard"

  private val oneHundred: String = "100"

  def notValid(rouletteString: String): Boolean = {
    rouletteString.isEmpty ||
      (!rouletteString.equalsIgnoreCase(standard) && !rouletteString.equalsIgnoreCase(oneHundred))
  }

  def main(args: Array[String]) {
    var rouletteString = ""

    while (notValid(rouletteString)) {
      val spinDisplay = "Which Roulette Would You Like? (" + standard + " or " + oneHundred + ")"
      println(spinDisplay)

      rouletteString = StdIn.readLine()
    }

    var result : Int = -1

    if (rouletteString.equalsIgnoreCase(standard)) {
      result = new StandardRoulette().spin()
    } else if (rouletteString.equalsIgnoreCase(oneHundred)) {
      result = new OneHundredPocketRoulette().spin()
    }

    val spinResult = "Result: " + result
    println(spinResult)
  }

}
