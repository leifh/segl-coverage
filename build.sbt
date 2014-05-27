name := "segl-coverage"

version := "1.0"

scalaVersion := "2.11.1"

ScoverageSbtPlugin.instrumentSettings

ScoverageKeys.highlighting := true

ScctPlugin.instrumentSettings

libraryDependencies += "org.specs2" %% "specs2" % "2.3.12" % "test"
