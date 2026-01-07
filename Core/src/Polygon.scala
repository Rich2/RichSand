/* Copyright 2026 Richard Oliver. Licensed under Apache Licence version 2.0. */
package pcore

trait Polygon
{ def num: Int
  def meth(op: Int): Polygon = Polygon(num + op)
}

object Polygon
{
  def apply(num: Int): Polygon = PolygonImp(num)

  given rotateEv[A <: Polygon]: RotateLike[A, Polygon] = (obj, op) => obj.meth(op)
  case class PolygonImp(num: Int) extends Polygon
}

trait Rectangle
{
  def num: Int
  def meth(op: Int): Rectangle = Rectangle(num + op)
}

object Rectangle
{
  def apply(num: Int): Rectangle = RectAImp(num)
  
  given rotateEv: Rotate[Rectangle] = (obj, op) => obj.meth(op)
  case class RectAImp(num: Int) extends Rectangle
}

case class Rect(num: Int) extends Rectangle