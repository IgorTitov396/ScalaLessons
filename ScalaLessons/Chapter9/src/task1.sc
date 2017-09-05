import java.io.PrintWriter

import scala.io.Source

val file = Source.fromFile("D:\\~IdeaProjects\\Scala\\Chapter9\\input.txt", "UTF-8")
val file_out = new PrintWriter("D:\\~IdeaProjects\\Scala\\Chapter9\\output.txt")

var a = file.getLines.toArray.reverse.foreach(file_out.println(_))

file.close
file_out.close