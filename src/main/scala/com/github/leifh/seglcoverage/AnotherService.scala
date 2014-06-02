package com.github.leifh.seglcoverage

trait AnotherService {
  def isUnder18AndSwiss(customer : Customer) : Boolean = if(customer.age < 18) true else if(customer.country == Switzerland) true else false
}
