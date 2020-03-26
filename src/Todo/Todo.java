package Todo;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.Control;

public class Todo {
  public static void main(String[] args) {

    if (args.length == 0){
      PrintUsage printUsage = new PrintUsage();
      printUsage.PrintUsage();
    }


    if (args.length > 0 && args[0].equals("-l")) {
      ListTasks listTasks = new ListTasks();
      listTasks.ListTasks();

    }

    if (args.length == 2 && args[0].equals("-a")){
      FileHandler fileHandler = new FileHandler();
      fileHandler.writeFile(args[1]);
    }


  }


}
