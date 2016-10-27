package main.scala.learning

import scala.util.Random

class Roulette {
  val random = Random
  val numberOfPockets = 37

  var pocket = 0


  def spin(): Int ={
    random.nextInt(numberOfPockets)
  }
}
