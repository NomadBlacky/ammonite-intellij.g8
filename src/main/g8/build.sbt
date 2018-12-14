// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "<scala_version>"
    )),
    libraryDependencies ++= Seq(

    )
  )
