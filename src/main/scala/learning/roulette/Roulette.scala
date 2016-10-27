package main.scala.learning.roulette

import scala.util.Random

trait Roulette {
  private val random = Random

  protected val numberOfPockets : Int


  def spin(): Int ={
    random.nextInt(numberOfPockets)
  }
}
