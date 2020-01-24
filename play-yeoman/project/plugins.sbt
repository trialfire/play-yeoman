// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.0")

// Add the publish to S3 plugin
addSbtPlugin("com.frugalmechanic" % "fm-sbt-s3-resolver" % "0.19.0")