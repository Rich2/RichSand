/* Copyright 2024 Richard Oliver. Licensed under Apache Licence version 2.0. */
name:= "RichSand"
version := "0.0.1snap"
scalaVersion := "3.6.4"
resolvers += "RichStrat" at "https://richstrat.com/repository"
libraryDependencies += "com.richstrat" % "rutil" % "0.3.6" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "geom" % "0.3.6" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "tiling" % "0.3.6" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "egrid" % "0.3.6" withSources() withJavadoc()
libraryDependencies += "org.openjfx" % "javafx-controls" % "21.0.6" withSources() withJavadoc()