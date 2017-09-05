val a = io.Source.fromFile("D:\\~IdeaProjects\\Scala\\Chapter9\\input.txt", "UTF-8").mkString.split("\\s+").map(_.toDouble)

a.max
a.min
a.sum / a.length
