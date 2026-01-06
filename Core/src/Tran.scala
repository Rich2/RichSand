/* Copyright 2026 Richard Oliver. Licensed under Apache Licence version 2.0. */
package pcore
import scala.annotation.unchecked.uncheckedVariance

trait Tran[-A]
{ def methT(obj: A, op: Int): A @uncheckedVariance
}

extension[A](value: A)(using evT: Tran[A])
{
  def meth4(op: Int) = evT.methT(value, op + 4)
}