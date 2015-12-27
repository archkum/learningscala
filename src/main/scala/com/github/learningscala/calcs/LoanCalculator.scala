package com.github.learningscala.calcs

import java.security.Principal

/**
  * Created by archana on 12/20/15.
  */

import java.lang.Math._

object LoanCalculator {


  case class Loan (termInMonths: Int, annualRate : Double, amount : Double)

  case class MonthlyPayment ( principal: Double, interest: Double, balance : Double )

  def monthlyPayment( loan: Loan) : Double = {
    val monthlyRate: Double = loan.annualRate / 12
    ( monthlyRate * loan.amount)/ ( 1 - pow( 1.0 + ( monthlyRate) , -(loan.termInMonths )))
  }


  def paymentSchedule( loan: Loan) : List[MonthlyPayment] = ???




}
