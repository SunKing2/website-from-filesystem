import scala.io.Source

val sFiles = Array("./partials/pre-head.html", "./partials/head.html", "./partials/body.html", "./partials/post-body.html")
var sFile = sFiles(0)

for (sFile <- sFiles)
  for (line <- Source.fromFile(sFile).getLines())
    println(line)
