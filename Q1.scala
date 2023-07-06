package package1

import scala.io.StdIn

object Q1 {
  def main(args: Array[String]): Unit = {

    println("Enter your deposit money:")
    val deposit = StdIn.readLine().toDouble
    val interest = calculateInterest(deposit)
    println(s"The interest earned on Rs. $deposit is Rs. $interest")
  }

  def calculateInterest(depositAmount: Double): Double = {
    if (depositAmount <= 20000) {
      depositAmount * 0.02 // 2% interest for deposits up to Rs. 20,000
    } else if (depositAmount <= 200000) {
      depositAmount * 0.04 // 4% interest for deposits up to Rs. 200,000
    } else if (depositAmount <= 2000000) {
      depositAmount * 0.035 // 3.5% interest for deposits up to Rs. 2,000,000
    } else {
      depositAmount * 0.065 // 6.5% interest for deposits over Rs. 2,000,000
    }
  }
}
