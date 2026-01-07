/* Copyright 2026 Richard Oliver. Licensed under Apache Licence version 2.0. */
package pcore
import ostrat.*

trait Trans[A, B]
{
  def methT(obj: A, op: Int): B
}

object Trans
{
  given functorEv[F[_], A, B](using evF: Functor[F], evA: Trans[A, B]): Trans[F[A], F[B]] = (obj, op) => evF.mapT(obj, evA.methT(_, op))
  
  given arrEv[A, B, ArrA <: Arr[A], ArrB <: Arr[B]](using evA: Trans[A, B], build: BuilderArrMap[B, ArrB]): Trans[ArrA, ArrB] =
    (obj, op) => obj.map(evA.methT(_, op))
}

trait Tran[A] extends Trans[A, A]

trait Traf[A] extends Trans[]

extension[A, B](value: A)(using evT: Trans[A, B])
{ def meth4(op: Int): B = evT.methT(value, op + 4)
}