/* Copyright 2026 Richard Oliver. Licensed under Apache Licence version 2.0. */
package pcore
import ostrat.*, webjvm.*

object MainApp
{
  def main(args: Array[String]): Unit =
  { deb("At moment just to test ScalaDoc.")

    deb("Welcome to PostApp!")
    val eStr: IOExcEither[String] = resourceStr("Postgres.rson")
    val eName = eStr.flatMap(_.findStrSetting("username"))
    val ePass = eStr.flatMap(_.findStrSetting("pWord"))
    debvar(eName)
    debvar(ePass)
  }
}