addSbtPlugin("com.github.mpeltonen" %% "sbt-idea" % "1.6.0")

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

// only version working with scala 2.11
addSbtPlugin("com.sqality.scct" %% "sbt-scct" % "0.3.1-SNAPSHOT")

addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "0.99.5.1")

addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.5")
