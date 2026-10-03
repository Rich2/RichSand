package pserv
import scalasql.*, PostgresDialect.*, ostrat.*

object SSMain{
  def main(args: Array[String]): Unit =
  { println("Hello Scala Servlet")
    val home = System.getProperty("user.home")
    deb(home)
    val dataSource = new org.postgresql.ds.PGSimpleDataSource
    dataSource.setURL("jdbc:postgresql://localhost:5432/")
  }
}