import java.nio.file.*
import java.io.BufferedReader
import java.nio.file.Files

fun sum(a: Int, b: Int): Int {
    return a + b
}

@Throws(java.io.IOException::class)
fun myReadFile(sFile:String):String {
  var path = FileSystems.getDefault().getPath("partials", sFile)
  val sb = StringBuilder()
  val fsin = Files.newBufferedReader(path)
  // TODO java has the check condition in the while expression, but this looks kludgey:
  while (true)
  {
    var sLine = fsin.readLine()
    if (sLine == null) {
      break;
    }
    sb.append(sLine)
    sb.append('\n')
  }
  return sb.toString()
}

fun main(args: Array<String>) {
  val sFiles = arrayOf("pre-head.html", "head.html", "body.html", "post-body.html")

  for (sFileName in sFiles) {
    //println(sFile)
    println(myReadFile(sFileName))
  }
}
