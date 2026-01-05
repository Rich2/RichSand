/* Copyright 2026 Richard Oliver. Licensed under Apache Licence version 2.0. */
package pcore
import scala.annotation.unchecked.uncheckedVariance

trait Tran[-A]
{ def meth(obj: A, op: Int): A @uncheckedVariance
}