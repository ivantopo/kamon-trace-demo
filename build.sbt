import com.typesafe.sbt.SbtAspectj._

name := "kamon-trace-demo"

scalaVersion := Version.scala

version := "1.0-SNAPSHOT"

val resolutionRepos = Seq(
      "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
      "Typesafe ivy repository" at "http://repo.typesafe.com/typesafe/ivy-releases/",
      "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
      "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases",
      "Sonatype OSS" at "https://oss.sonatype.org/content/groups/public/",
      "Spray" at "http://repo.spray.io/",
      "Kamon Repository Snapshots" at "http://snapshots.kamon.io",
      "Kamon Repository Releases" at "http://repo.kamon.io"
)

resolvers ++= resolutionRepos

// Check our local m2 repo (Where hadoop is installed)
resolvers += Resolver.mavenLocal

libraryDependencies ++= Dependencies.demo

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"

aspectjSettings

javaOptions <++= AspectjKeys.weaverOptions in Aspectj

// We must fork when we run, such that the AspectJ weaver is used
fork in run := true

// Enable SBT Revolver
Revolver.settings

// Configure our 'Main' class to be the Main class.....
mainClass in Compile := Some("Main")
