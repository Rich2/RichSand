package pserv
import scalasql.*, PostgresDialect.*

object SSMain{
  def main(args: Array[String]): Unit =
  { println("Hello Scala Servlet")
    val dataSource = new org.postgresql.ds.PGSimpleDataSource
    dataSource.setURL("jdbc:postgresql://localhost:5432/")
  }
}
