package com.github.leifh.seglcoverage

sealed trait Country { def iso: String }

case object Switzerland extends Country { val iso = "CH" }
case object France extends Country { val iso = "FR" }
