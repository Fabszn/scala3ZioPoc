
import Dependencies.*

scalaVersion := "3.3.1"

libraryDependencies ++= Seq(
  zio,
  zioPrelude,
  apachePoi,
  apachePoiOoxml,
  logstashEncoder,
  logback,
  zioLogging,
  zioLoggingSlf4j,
  zioCatsInterop
) ++ zioTest ++ fs2Libs ++ zioConfigLibs ++ catsLibs

enablePlugins(JavaAppPackaging,DockerPlugin, BuildInfoPlugin)
dockerExposedPorts ++= Seq(9000)

Global / wartremoverErrors ++= Seq(
  // Wart.Any,
  // Wart.AnyVal,
  Wart.ArrayEquals,
  Wart.AsInstanceOf,
  // Wart.DefaultArguments,
  Wart.EitherProjectionPartial,
  Wart.Enumeration,
  // Wart.Equals,
  // Wart.ExplicitImplicitTypes,
  Wart.FinalCaseClass,
  // Wart.FinalVal,
  // Wart.ImplicitConversion,
  // Wart.ImplicitParameter,
  Wart.IsInstanceOf,
  // Wart.JavaConversions,
  // Wart.JavaSerializable,
  Wart.LeakingSealed,
  // Wart.MutableDataStructures,
  // Wart.NonUnitStatements,
  // Wart.Nothing,
  Wart.Null,
  // Wart.Option2Iterable,
  Wart.OptionPartial,
  Wart.Overloading,
  // Wart.Product,
  // Wart.PublicInference,
  // Wart.Recursion,
  Wart.Return,
  // Wart.Serializable,
  // Wart.StringPlusAny,
  // Wart.Throw,
  Wart.ToString,
  // Wart.TraversableOps,
  Wart.TryPartial,
  Wart.Var
  // Wart.While,
)
