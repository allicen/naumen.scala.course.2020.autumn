name := "test2"

version := "0.1"

scalaVersion := "2.13.3"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"

resolvers += Resolver.url("jetbrains-sbt", url(s"http://dl.bintray.com/jetbrains/sbt-plugins"))(Resolver.ivyStylePatterns)

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "MimirDB" at "http://maven.mimirdb.info/"