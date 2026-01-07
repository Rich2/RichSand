/* Copyright 2026 Richard Oliver. Licensed under Apache Licence version 2.0. */
package pcore
import ostrat.*

trait RotateLike[A, B]
{ def methT(obj: A, op: Int): B
}

object RotateLike
{ given functorEv[F[_], A, B](using evF: Functor[F], evA: RotateLike[A, B]): RotateLike[F[A], F[B]] = (obj, op) => evF.mapT(obj, evA.methT(_, op))
  
  given arrEv[A, B, ArrA <: Arr[A], ArrB <: Arr[B]](using evA: RotateLike[A, B], build: BuilderArrMap[B, ArrB]): RotateLike[ArrA, ArrB] =
    (obj, op) => obj.map(evA.methT(_, op))

  given subTypes[A, B >: A](using ev: Rotate[B]): RotateLike[A, B] = (obj, op) => ev.methT(obj, op)
}

trait Rotate[A] extends RotateLike[A, A]

trait RotateSub[A] extends RotateLike[? <: A, A]

extension[A, B](value: A)(using evT: RotateLike[A, B])
{ def bam(op: Int): B = evT.methT(value, op + 4)
}