/* Copyright 2024 Richard Oliver. Licensed under Apache Licence version 2.0. */
name:= "RichSand"
version := "0.0.1snap"
scalaVersion := "3.5.1"
resolvers += "RichStrat" at "https://richstrat.com/repository"
libraryDependencies += "com.richstrat" % "rutil" % "0.3.4" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "geom" % "0.3.4" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "tiling" % "0.3.4" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "egrid" % "0.3.4" withSources() withJavadoc()