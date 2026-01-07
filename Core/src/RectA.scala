/* Copyright 2026 Richard Oliver. Licensed under Apache Licence version 2.0. */
package pcore

trait RectA
{
  def num: Int
  def meth(op: Int): RectA = RectA(num + op)
}

object RectA
{
  def apply(num: Int): RectA = RectAImp(num)
  
  given tranEv: Tran[RectA] = (obj, op) => obj.meth(op)
  case class RectAImp(num: Int) extends RectA
}

case class RectB(num: Int) extends RectA

object RectB
{
  given transEv: Trans[RectB, RectA] = (obj, op) => obj.meth(op)
}