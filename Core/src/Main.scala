/* Copyright 2026 Richard Oliver. Licensed under Apache Licence version 2.0. */
package pcore
import ostrat.*

object MainApp extends App
{
  val r0 = RectB(4)
  val r1 = r0.meth4(100)
  val l1: List[RectA] = List(r0, r1).meth4(10)
  val aa1 = RArr(r0, r1).meth4(200)  
  debvar(aa1)
}