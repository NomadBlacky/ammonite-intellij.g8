// It uses to import dependencies to IntelliJ.
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "<scala_version>"
    )),
    libraryDependencies ++= Seq(
      "com.lihaoyi" % "ammonite" % "<ammonite_version>" cross CrossVersion.full
      // Please add dependencies to use in Scala Scripts.
      // "com.sample" %% "scala-library" % "0.1.0"
    )
  )
