// If you want to add a dependency, please add the same one to build.sbt.
// import $ivy.`com.sample::scala-library:0.1.0`

@main
def hello(thing: String = "World"): Unit = {
  println(s"Hello, $thing!")
}