package main.scala.learning

object Main {
  def main(args: Array[String]) {
    val roulette = new Roulette()

    val spinDisplay = "Spinning the roulette!"
    println(spinDisplay)

    val result = roulette.spin()

    val spinResult = "Result: " + result
    println(spinResult)
  }
  
}
