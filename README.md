A [Giter8][g8] template for generating a Scala Scripts ([Ammonite][ammonite]) project for [IntelliJ IDEA][intellij].

## Usage

### Setup a project

1. Run `sbt new`.

```shell-session
$ sbt new NomadBlacky/ammonite-intellij.g8
```

2. Import the project with IntelliJ IDEA.

`File` -> `Open` -> Select the generated project.

3. Set the configuration of IntelliJ IDEA.

`File` -> `Settings` -> `Language & Frameworks` -> `Scala` -> `Worksheet`

Change from `Always Worksheet` to `Always Ammonite`.

### Add dependencies to Scala Scripts

Scala Scripts can add dependencies with `$ivy`.

```scala
import $ivy.`com.sample::scala-library:0.1.0`
```

But, IntelliJ IDEA sometimes can't recognize to add dependencies.

You can resolve the problem by adding dependencies to `build.sbt`.

```scala
libraryDependencies ++= Seq(
  "com.sample" %% "scala-library" % "0.1.0"
)
```

After, when refreshing the project, you can enable code completion.

## Template license

Written in 2018 by Takumi Kadowaki

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
[ammonite]: http://ammonite.io
[intellij]: https://www.jetbrains.com/idea/
