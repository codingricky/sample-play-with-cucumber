name := "sample-with-cucumber"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "info.cukes" % "cucumber-java" % "1.1.5",
  "info.cukes" % "cucumber-junit" % "1.1.5"
 )     

play.Project.playJavaSettings

unmanagedResourceDirectories in Compile <+= baseDirectory( _ / "features" )
