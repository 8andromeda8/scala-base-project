organization := "co.rc"

name := "scala-base-project"

scalaVersion := "2.11.7"

description := "Generic scala base project template with dependencies"

resolvers ++= Resolvers.all

libraryDependencies ++= Dependencies.all

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Xfuture",
  "-Xcheckinit"
)