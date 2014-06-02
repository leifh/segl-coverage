package com.github.leifh.seglcoverage

import scala.util.Random

object SystemService extends AnotherService {

  def getCustomer(id : Long) = Customer("Smith", Switzerland, Random.nextInt(120))

  def orderProduct(product : Product, customer : Customer) : Option[Order] = {

    customer.country match {
      case Switzerland =>
      case France =>
      case _ => throw new Exception("unknown country")
    }

    Some(Order(Random.nextLong()))
  }

  def isUnder18OneLine(customer : Customer) : Boolean = if(customer.age < 18) true else false

  def isUnder18(customer : Customer) : Boolean = {
    if(customer.age < 18) {
      true
    } else {
      false
    }
  }

}

