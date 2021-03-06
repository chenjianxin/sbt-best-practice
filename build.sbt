sbtPlugin in ThisBuild := true

organization in ThisBuild := "com.thoughtworks.sbt-best-practice"

lazy val `detect-license` = project dependsOn git

lazy val travis = project dependsOn git

lazy val git = project

lazy val `scalac-options` = project

lazy val `publish-unidoc` = project

lazy val `detect-scala-organization` = project

lazy val mima = project

dependsOn(`scalac-options`, `detect-license`, travis, git, `publish-unidoc`, `detect-scala-organization`)

libraryDependencies += "com.lihaoyi" %% "sourcecode" % "0.1.6"

addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "3.0.0")

enablePlugins(ScalaUnidocPlugin)
