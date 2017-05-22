import java.nio.file.Path;
import java.nio.file.FileSystems;
import java.io.BufferedReader;
import java.nio.file.Files;

public class MyFs {
  public static void main(String[] args) throws java.io.IOException {
    String[] sFiles = {
      "pre-head.html",
      "head.html",
      "body.html",
      "post-body.html"
    };
    for (String sFileName: sFiles) {
      System.out.println(MyFs.readFile(sFileName));
    }
  }
  public static String readFile(String sFile) throws java.io.IOException {
    String sLine;

    Path path = FileSystems.getDefault().getPath("partials", sFile);
    StringBuilder sb = new StringBuilder();
    BufferedReader in = Files.newBufferedReader(path);
    while ((sLine = in.readLine()) != null) {
      sb.append(sLine);
      sb.append('\n');
    }
    return sb.toString();
  }
}
