/* Copyright 2024 Richard Oliver. Licensed under Apache Licence version 2.0. */
import java.net.*, java.io.*, ostrat.*

object Main
{
  def main(args: Array[String]): Unit =
  { println("RichSand starting.")
    val sock: Socket = new Socket("richstrat.com", 80)
    val out: PrintWriter = new PrintWriter(sock.getOutputStream(), true)
    val in: BufferedReader = new BufferedReader(new InputStreamReader(sock.getInputStream()))
    out.write("GET / HTTP/1.1\r\nHost: richstrat.com:80\r\n\r\n")
    out.flush
    repeat(8){ println(in.readLine) }

    in.close
    out.close
    sock.close
  }
} 
