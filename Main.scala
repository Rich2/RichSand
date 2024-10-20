import java.net.*, java.io.*

object Main
{
  def main(args: Array[String]): Unit =
  { println("RichSand starting.")
    val sock: Socket = new Socket("richstrat.com", 8080)
    val out: PrintWriter = new PrintWriter(sock.getOutputStream(), true)
    val in: BufferedReader = new BufferedReader(new InputStreamReader(sock.getInputStream()))

    in.close
    out.close
    sock.close
  }
} 
