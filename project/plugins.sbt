// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers ++= Seq(
    Resolver.file("Local Ivy Repository", file("/Users/james_mulcahy/.ivy2/local"))(Resolver.ivyStylePatterns)
)

addSbtPlugin("com.typesafe.sbt" % "sbt-aspectj" % "0.9.4")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")
