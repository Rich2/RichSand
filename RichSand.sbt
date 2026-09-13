/* Copyright 2024-6 Richard Oliver. Licensed under Apache Licence version 2.0. */
version := "1.0.0"
scalaVersion := "3.9.0"
val osUri = uri("https://github.com/Rich2/openstrat.git#a5ff384")
lazy val Util = ProjectRef(osUri, "Util")
lazy val Geom = ProjectRef(osUri, "Geom")
lazy val Tiling = ProjectRef(osUri, "Tiling")
lazy val EGrid = ProjectRef(osUri, "EGgrid")

lazy val Core = (project in file("Core")).dependsOn(Geom).settings(
  name := "Core",
  //resolvers += "RichStrat" at "https://richstrat.com/repository",
  Compile/unmanagedResourceDirectories += (ThisBuild/baseDirectory).value / "User",
  libraryDependencies += ("org.openjfx" % "javafx-controls" % "25.0.3").withSources().withJavadoc(),
  libraryDependencies += ("dev.zio" %% "zio-prelude" % "1.0.0-RC44").withSources().withJavadoc(),
  Compile/scalaSource := baseDirectory.value / "src",
  Compile/mainClass := Some("pcore.MainApp"),
  scalacOptions ++= Seq("-feature", "-language:implicitConversions", "-noindent", "-deprecation", "-encoding", "UTF-8"),
)

lazy val Serv = (project in file("Serv")).settings(
  name := "Serv",
  libraryDependencies += ("jakarta.servlet" % "jakarta.servlet-api" % "6.1.0" % "provided").withSources().withJavadoc(),
  Compile/scalaSource := baseDirectory.value / "src",
)