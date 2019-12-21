lazy val root = project
  .in(file("."))
  .settings(
    organization := "io.github.fgrutsch",
    name := "gh-page",
    scalaVersion := "2.13.1",
    git.remoteRepo := "git@github.com:fgrutsch/fgrutsch.github.io.git",
    ghpagesBranch := "master",
    ghpagesCommitOptions := Seq("-m", s"[${version.value}] updated site"),
    ghpagesPrivateMappings := Path.allSubpaths(file("target/hugo")).toSeq,
    baseURL in Hugo := uri("https://fgrutsch.github.io")
  )
  .enablePlugins(HugoPlugin, GhpagesPlugin)
