package Todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListTasks {

  public void ListTasks(){

    FileHandler fileHandler = new FileHandler();
    fileHandler.readFile();
    for (String lines: fileHandler.content) {
      System.out.println(lines);
    }
  }
}
