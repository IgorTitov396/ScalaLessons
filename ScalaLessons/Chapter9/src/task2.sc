import java.io.PrintWriter

import scala.io.Source

val file = Source.fromFile("D:\\~IdeaProjects\\Scala\\Chapter9\\input.txt", "UTF-8")
val file_out = new PrintWriter("D:\\~IdeaProjects\\Scala\\Chapter9\\output.txt")

file_out.print("\t".r.replaceAllIn(file.mkString, "XXX"))

'\t'.toString

file.close
file_out.close