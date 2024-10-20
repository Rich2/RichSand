/* Copyright 2024 Richard Oliver. Licensed under Apache Licence version 2.0. */
import java.net.*, java.io.*

object Main
{
  def main(args: Array[String]): Unit =
  { println("RichSand starting.")
    val sock: Socket = new Socket("richstrat.com", 8082)
    val out: PrintWriter = new PrintWriter(sock.getOutputStream(), true)
    val in: BufferedReader = new BufferedReader(new InputStreamReader(sock.getInputStream()))

    in.close
    out.close
    sock.close
  }
} 
