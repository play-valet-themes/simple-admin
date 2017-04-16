
lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "tct-admin",
    version := "0.0.1",
    scalaVersion := "2.11.8",
    CoffeeScriptKeys.sourceMap := false,
    LessKeys.compress in Assets := true,
    includeFilter in(Assets, LessKeys.less) := "*.less",
    includeFilter in gzip := "*.js",
    pipelineStages := Seq(gzip),
    libraryDependencies ++= Seq(
      cache,
      ws,
      filters,
      //      "com.h2database" % "h2" % "1.4.193",
      "mysql" % "mysql-connector-java" % "5.1.40",
      // "org.postgresql" % "postgresql" % "9.4.1208",
      // "com.github.mumoshu" %% "play2-memcached-play24" % "0.7.0",
      //      "com.github.tototoshi" %% "slick-joda-mapper" % "2.2.0",
      "com.typesafe.play" %% "play-slick" % "2.0.2",
      "org.slf4j" % "slf4j-nop" % "1.6.4",
      // "com.typesafe.play" %% "play-slick-evolutions" % "2.0.2",
      // "org.flywaydb" %% "flyway-play" % "3.0.1",
      "jp.t2v" %% "play2-auth" % "0.14.2",
      "jp.t2v" %% "play2-auth-test" % "0.14.2" % "test",
      //      "org.typelevel" %% "cats" % "0.9.0",
      "org.scalaz" %% "scalaz-core" % "7.2.10",
      "org.springframework.security" % "spring-security-web" % "4.2.2.RELEASE",
      "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
    )
  )
