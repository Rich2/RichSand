/* Copyright 2026 Richard Oliver. Licensed under Apache Licence version 2.0. */
package pcore
import collection.mutable.ArrayBuffer

/** This is to test ScalaDoc by mentioning [[collection.mutable.ArrayBuffer]]. */
class BuffTester(val inp: ArrayBuffer[Double])
{ def num: Int = 5
  def meth(op: Int): Double = 2 +op
}