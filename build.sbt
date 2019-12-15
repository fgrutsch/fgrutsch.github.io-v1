lazy val root = project
  .in(file("."))
  .settings(
    organization := "io.github.fgrutsch",
    name := "gh-page",
    scalaVersion := "2.13.1",
    git.remoteRepo := "git@github.com:fgrutsch/fgrutsch.github.io.git",
    ghpagesBranch := "master"
  )
  .enablePlugins(HugoPlugin, GhpagesPlugin)
