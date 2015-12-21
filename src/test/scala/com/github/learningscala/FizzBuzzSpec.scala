package com.github.learningscala

/**
  * Created by archana on 12/20/15.
  */

import org.scalatest._

class FizzBuzzSpec extends UnitSpec {
  val fizzBuzz: FizzBuzz = new FizzBuzz

  "FizzBuzz" should "return Fizz for multiples of 3 but not multiples of 5" in {
    Seq(3, 6, 9, 99).foreach { i =>
      fizzBuzz.getFizzBuzz(i) should be("fizz")
    }
  }

  it should "return Buzz for multiples of 5 but not multiples of 3" in {
    Seq(5, 20, 80).foreach { i =>
      fizzBuzz.getFizzBuzz(i) should be("buzz")
    }

  }
  it should "return FizzBuzz for multiples of 3 and multiples of 5" in {
    Seq(15, 30, 120).foreach { i =>
      fizzBuzz.getFizzBuzz(i) should be("fizz buzz")
    }

  }

  it should "return the number if not multiples of 3 or 5" in {
    Seq(Integer.MIN_VALUE, 0, 7, 11, Integer.MAX_VALUE).foreach { i =>

      fizzBuzz.getFizzBuzz(i) should be(s"${i}")
    }

  }
}
