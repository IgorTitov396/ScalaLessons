import java.io.PrintWriter

io.Source.fromFile("D:\\~IdeaProjects\\Scala\\Chapter9\\input.txt", "UTF-8").mkString.split("\\s+").filter(_.length >= 12).foreach(println(_))

val a = new PrintWriter("D:\\~IdeaProjects\\Scala\\Chapter9\\output.txt")

for (i <- 0 to 20) {
  a.println("%8d   %f".format(math.pow(2, i).toInt, 1/math.pow(2, i)))
}

a.close