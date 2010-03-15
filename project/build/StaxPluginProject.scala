import sbt._

class StaxPluginProject(info: ProjectInfo) extends PluginProject(info) {
  val staxAppserver = "net.stax" % "stax-appserver" % "1.0.20090908-SNAPSHOT"
  val staxApiClient = "net.stax" % "stax-api-client" % "1.0.20090908-SNAPSHOT"

  val staxReleases = "stax-release-repo" at "http://mvn.stax.net/content/repositories/public"
}
