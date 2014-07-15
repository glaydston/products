name := """products"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)


libraryDependencies ++= Seq(
  "org.reactivemongo" % "play2-reactivemongo_2.10" % "0.10.2",
  "org.reactivemongo" % "reactivemongo_2.10" % "0.10.0",
  "net.sf.barcode4j" % "barcode4j" % "2.0"
)
