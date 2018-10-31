val dottyVersion = "0.11.0-bin-20181031-5a465af-NIGHTLY"

lazy val root = project
  .in(file("."))
  .settings(
    name := "simple",
    version := "0.1.0",

    scalaVersion := dottyVersion,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
