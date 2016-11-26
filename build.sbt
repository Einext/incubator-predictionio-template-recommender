import AssemblyKeys._

assemblySettings

name := "MyRecommendation"

organization := "org.apache.predictionio"

libraryDependencies ++= Seq(
  "org.apache.predictionio" %% "apache-predictionio-core" % "0.10.0-incubating" % "provided",
  "org.apache.spark"        %% "spark-core"               % "1.6.2" % "provided",
  "org.apache.spark"        %% "spark-mllib"              % "1.6.2" % "provided")
