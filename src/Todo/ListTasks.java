package Todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListTasks {
  Path filepath = Paths.get("assets/tasks.txt");
  List<String> lines = new ArrayList<>();

  public void ListTasks(){

    try {
      lines = Files.readAllLines(filepath);
    }catch (IOException e){
      System.out.println("Cant read the file...");
    }
    for (String line: lines ) {
      System.out.println(line);
    }
  }
}
