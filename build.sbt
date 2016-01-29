name := "helloWorldTfly"

organization := "TicketFly"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.8",
  "com.typesafe.akka" %% "akka-remote" % "2.3.8",
  "com.typesafe.akka" %% "akka-slf4j" % "2.3.8"
)