publishMavenStyle := true

pomIncludeRepository := { _ => false }

publishArtifact in Test := false

publishTo := {
  val repoUrl = "http://my-repository-url/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("My repository snapshots" at repoUrl + "content/repositories/my-repository-snapshots")
  else
    Some("My repository releases" at repoUrl + "content/repositories/my-repository-releases")
}

credentials += Credentials("My repository manager", "my-repository-host", "some-user", "some-password")