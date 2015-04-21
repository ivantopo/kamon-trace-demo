import sbt._                                                                                                       

object Version {
  val akka         = "2.3.4"
  val logback      = "1.1.1"
  val scala        = "2.11.6"
  val kamon        = "0.3.6-eb07f2f0b583c759e9cfaba27e3bcddeaf05a4cf"
  val aspectJ      = "1.8.1"
  val scalatest    = "2.2.1"
  val scalatestPlus= "1.2.0"
  val hadoop       = "2.5.0-SIMCLOUD-000"
  val akkaHttp     = "1.0-M5"
  val authenticator = "1.0"
  val levelDB      = "0.7"
  val levelDBJNI   = "1.7"
}

object Library {
  val akkaActor       = "com.typesafe.akka"      %% "akka-actor"                    % Version.akka
  val akkaContrib     = "com.typesafe.akka"      %% "akka-contrib"                  % Version.akka
  val akkaSlf4j       = "com.typesafe.akka"      %% "akka-slf4j"                    % Version.akka
  val kamonCore       = "io.kamon"               %% "kamon-core"                    % Version.kamon
  val kamonLogReporter= "io.kamon"               %% "kamon-log-reporter"            % Version.kamon
  val kamonSystemMetrics= "io.kamon"             %% "kamon-system-metrics"          % Version.kamon
  val kamonStatsD     = "io.kamon"               %% "kamon-statsd"                  % Version.kamon
  val kamonAkka       = "io.kamon"               %% "kamon-akka"                    % Version.kamon
  val aspectJ         = "org.aspectj"            %  "aspectjweaver"                 % Version.aspectJ
  val scalatest       = "org.scalatest"          %  "scalatest_2.11"                % Version.scalatest
  val logback         = "ch.qos.logback"         % "logback-classic"                % Version.logback
  val akkaHttp        = "com.typesafe.akka"      %%"akka-http-experimental"         % Version.akkaHttp
  val akkaHttpJson    = "com.typesafe.akka"      %%"akka-http-spray-json-experimental" % Version.akkaHttp
}

object Dependencies {

  import Library._

  val demo = List(
    akkaActor,
    akkaContrib,
    akkaSlf4j,
    kamonCore,
    // Useful for debugging Kamon Metrics
    //kamonLogReporter,
    kamonSystemMetrics,
    kamonStatsD,
    kamonAkka,
    aspectJ,
    scalatest % "test",
    logback
    ,akkaHttp
    ,akkaHttpJson
  )
}
