/* Copyright 2026 Richard Oliver. Licensed under Apache Licence version 2.0. */
package pcore
import ostrat.*

object MainApp extends App
{
  val p1 = Polygon(2)
  val p2 = Polygon(4)
  val lp1 = List(p1, p2).bam(4)
  debvar(lp1)
  val ap1 = RArr(p1, p2).bam(5)
  debvar(ap1)
  val r1 = Rectangle(4)
  val r2 = r1.bam(100)
  val ar1 = RArr(r1, r2).bam(10)
  debvar(ar1)
  val rr1 = Rect(3)
  val rr2 = rr1.bam(-20)
  val arr1: RArr[Rectangle] = RArr(rr1, rr2).bam(200)  
  debvar(arr1)
}