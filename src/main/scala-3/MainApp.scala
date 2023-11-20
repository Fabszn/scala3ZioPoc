

import cats.effect
import fs2.io.file.{Files, Path}
import zio.*
import zio.logging.LogFormat
import zio.logging.backend.SLF4J

import zio.interop.catz.*
import zio.interop.catz.implicits.*
import zio.stream.ZStream
import zio.stream.interop.fs2z.*
import zio.config.typesafe.TypesafeConfigProvider

object MainApp extends ZIOAppDefault {

  override val bootstrap: ZLayer[ZIOAppArgs, Any, Any] = {
    Runtime.removeDefaultLoggers >>> SLF4J.slf4j(LogFormat.default)
    Runtime.setConfigProvider(
      TypesafeConfigProvider.fromResourcePath()
    )
  }
  override def run: ZIO[Any with ZIOAppArgs with Scope, Any, Any] = {
    ZIO.attempt(
      Files[Task]
        .walk(Path("import java.io.File"))
        .filter(p => p.toNioPath.toFile.isFile)
        .filter(f => (java.lang.System.currentTimeMillis() - f.toNioPath.toFile.lastModified()) == 30000).toZStream()
    )



  }


}
