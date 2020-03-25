package Todo;

import com.sun.tools.javac.Main;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
  List<String> content = new ArrayList<>();
  List<String> newContent = new ArrayList<>();
  Path filepath = Paths.get("assets/tasks.txt");

  public void readFile(){
    try {
      content = Files.readAllLines(filepath);
    } catch (IOException e) {
      System.out.println("Cant read the file...");;
    }
  }

  public void writeFile(){
    readFile();
    try {
      Files.write(filepath,newContent);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
