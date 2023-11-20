import Dependencies.versions.*
import sbt.*


object Dependencies {
  object versions {
    lazy val zioVersion            = "2.0.19"
    lazy val zioConfigVersion      = "4.0.0-RC16"
    lazy val zioPreludeVersion     = "1.0.0-RC21"
    lazy val apachePoiVersion      = "5.2.4"
    lazy val logbackVersion        = "1.2.3"
    lazy val logstashVersion       = "6.6"
    lazy val zioLoggingVersion     = "2.1.15"
    lazy val fs2Version            = "3.9.3"
    lazy val ziocatsInteropVersion = "3.1.1.0"
    lazy val catsVersion           = "2.10.0"
    lazy val catsEffectVersion     = "3.5.2"

  }

  lazy val zioConfig         = "dev.zio" %% "zio-config"          % zioConfigVersion
  lazy val zioConfigMagnolia = "dev.zio" %% "zio-config-magnolia" % zioConfigVersion
  lazy val zioConfigTypeSafe = "dev.zio" %% "zio-config-typesafe" % zioConfigVersion
  lazy val zioConfigRefined  = "dev.zio" %% "zio-config-refined"  % zioConfigVersion
  lazy val zioConfigLibs     = Seq(zioConfig, zioConfigMagnolia, zioConfigTypeSafe, zioConfigRefined)

  lazy val fs2Core = "co.fs2" %% "fs2-core" % fs2Version
  lazy val fs2Io   = "co.fs2" %% "fs2-io"   % fs2Version
  // lazy val fs2ReactStream = "co.fs2" %% "fs2-reactive-streams" % fs2Version
  lazy val fs2Libs = Seq(fs2Core, fs2Io)

  lazy val zio            = "dev.zio"       %% "zio"         % zioVersion
  lazy val zioPrelude     = "dev.zio"       %% "zio-prelude" % zioPreludeVersion
  lazy val apachePoi      = "org.apache.poi" % "poi"         % apachePoiVersion
  lazy val apachePoiOoxml = "org.apache.poi" % "poi-ooxml"   % apachePoiVersion

  lazy val catsLibs = Seq(
    "org.typelevel" %% "cats-core"   % catsVersion,
    "org.typelevel" %% "cats-kernel" % catsVersion,
    "org.typelevel" %% "cats-free"   % catsVersion,
    "org.typelevel" %% "cats-effect" % catsEffectVersion
  )

  lazy val zioCatsInterop = "dev.zio" %% "zio-interop-cats" % ziocatsInteropVersion

  lazy val zioLoggingSlf4j = "dev.zio"             %% "zio-logging-slf4j"        % zioLoggingVersion
  lazy val zioLogging      = "dev.zio"             %% "zio-logging"              % zioLoggingVersion
  lazy val logback         = "ch.qos.logback"       % "logback-classic"          % logbackVersion
  lazy val logstashEncoder = "net.logstash.logback" % "logstash-logback-encoder" % logstashVersion
  lazy val zioTest =
    Seq("dev.zio" %% "zio-test" % zioVersion % "test", "dev.zio" %% "zio-test-sbt" % zioVersion % "test")

}
