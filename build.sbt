name := "test-nocomet"

version := "1.0"

organization := "intenium"

scalaVersion := "2.9.0-1"

resolvers += "Java.net Maven2 Repo" at "http://download.java.net/maven/2/"

libraryDependencies ++= Seq(
	"net.liftweb" %% "lift-webkit" % "2.4-M3" % "compile",
	"org.eclipse.jetty" % "jetty-webapp" % "7.4.4.v20110707" % "jetty",
	"ch.qos.logback" % "logback-classic" % "0.9.26"
)

seq(webSettings :_*)

