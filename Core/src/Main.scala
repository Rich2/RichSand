/* Copyright 2026 Richard Oliver. Licensed under Apache Licence version 2.0. */
package pcore
import ostrat.*, utiljvm.*, zio.prelude.Validation

object MainApp
{
  def main(args: Array[String]): Unit =
  { deb("Welcome to PostApp!")
    val eStr: IOExcEither[String] = loadResourceStr("Postgres.rson")
    val eName = eStr.flatMap(_.findStrSetting("username"))
    val ePass = eStr.flatMap(_.findStrSetting("pWord"))
    debvar(eName)
    debvar(ePass)
    val vStr = Validation(io.Source.fromResource("Postgres.rson").mkString)
    val vName = vStr.flatMap(str => Validation.fromEither(str.findStrSetting("username")))
    val vPass = vStr.flatMap(str => Validation.fromEither(str.findStrSetting("pWord")))
    val vPerson = Validation.validateWith(vName, vPass)((_, _))
    debvar(vPerson)
  }
}