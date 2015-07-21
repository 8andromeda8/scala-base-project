import sbt._

object Resolvers {

	val all = Seq(
		"Scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
    "Sonatype releases" at "http://oss.sonatype.org/content/repositories/releases",
		"Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
		"Spray repository" at "http://repo.spray.io/",
		"Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
	)

}

object Version {

	// SPRAY LIBRARIES
	val sprayVersion: String = "1.3.3"

	// JSON LIBRARIES
	val json4sVersion: String = "3.2.11"
	val collectionJsonVersion: String = "2.3"

	// AKKA LIBRARIES
	val akkaVersion: String = "2.3.12"

	// FUNCTIONAL PROGRAMMING LIBRARIES
	val shapelessVersion: String = "2.2.4"
	val scalazVersion: String = "7.1.3"

	// UTILS LIBRARIES
	val ficusVersion: String = "1.1.2"

	// TESTING LIBRARIES
	val specs2Version: String = "3.6.2"

	// LOGGING LIBRARIES
  val logbackVersion: String = "1.1.3"
	val scalaloggingVersion: String = "3.1.0"

}

object Library {

  import Version._

  // SPRAY LIBRARIES
  val sprayCan = "io.spray" %% "spray-can" % sprayVersion
  val sprayRouting = "io.spray" %% "spray-routing" % sprayVersion
  val sprayClient = "io.spray" %%  "spray-client" % sprayVersion
  val sprayTestkit = "io.spray" %% "spray-testkit" % sprayVersion % "test"

  // JSON LIBRARIES

  	// -- JSON4S
  	val json4sExt = "org.json4s" %%  "json4s-ext" % json4sVersion
  	val json4sJackson = "org.json4s" %%  "json4s-jackson" % json4sVersion
  	val json4sNative = "org.json4s" %%  "json4s-native" % json4sVersion

  	// -- COLLECTION+JSON
  	val collectionJson = "net.hamnaberg.rest" %% "scala-json-collection" % collectionJsonVersion

  // AKKA LIBRARIES
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
  val akkaTestkit = "com.typesafe.akka" %%  "akka-testkit" % akkaVersion % "test"
  
  // FUNCTIONAL PROGRAMMING LIBRARIES

  	// -- SHAPELESS
  	val shapeless = "com.chuusai" %% "shapeless" % shapelessVersion

  	// -- SCALAZ
  	val scalaz = "org.scalaz" %% "scalaz-core" % scalazVersion

  // UTILS LIBRARIES

  	// -- FICUS
  	val ficus = "net.ceedubs" %% "ficus" % ficusVersion
  
  // TESTING LIBRARIES

  	// -- SPECS2
  	val specs2 = "org.specs2" %% "specs2-core" % specs2Version % "test"

  // LOGGING LIBRARIES

  	// -- LOGBACK
  	val logback = "ch.qos.logback" % "logback-classic" % logbackVersion

  	// -- SCALALOGGING
  	val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % scalaloggingVersion

}

object Dependencies {

  import Library._

  // SPRAY LIBRARIES
  val sprayLibraries = Seq(sprayCan, sprayRouting, sprayClient, sprayTestkit)

  // JSON LIBRARIES
  val jsonLibraries = Seq(json4sExt, json4sJackson, json4sNative, collectionJson)

  // AKKA LIBRARIES
  val akkaLibraries = Seq(akkaActor, akkaTestkit)
  
  // FUNCTIONAL PROGRAMMING LIBRARIES
  val functionalProgrammingLibraries = Seq(shapeless, scalaz)

  // UTILS LIBRARIES
  val utilsLibraries = Seq(ficus)

  // TESTING LIBRARIES
  val testingLibraries = Seq(specs2)

  // LOGGING LIBRARIES
  val loggingLibraries = Seq(logback, scalaLogging)

  // ------------ ALL LIBRARIES -------------------
  val all = sprayLibraries ++ jsonLibraries ++ akkaLibraries ++ 
  	functionalProgrammingLibraries ++ utilsLibraries ++ testingLibraries ++ loggingLibraries

}