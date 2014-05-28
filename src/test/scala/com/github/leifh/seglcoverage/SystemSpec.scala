package com.github.leifh.seglcoverage

import org.specs2.mutable.Specification

class SystemSpec extends Specification {

  "System" should {

    "allow to order a product" in {
      SystemService.orderProduct(Product("bla"), Customer("Eric", Switzerland, 18)) must beSome
    }

    "return false for a customer over 18" in {
      val customer = Customer("Smith", France, 24)

      SystemService.isUnder18(customer) mustEqual false
    }

    "return true for customer under 18" in {
      val customer = Customer("Smith", Switzerland, 5)

      SystemService.isUnder18OneLine(customer) mustEqual true
    }
  }

}
