package Todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Todo {
  public static void main(String[] args) {
    /*int counter =1;
    for (String arg: args) {
      System.out.println(counter + " : " + arg);
      counter++;
    }*/
    if (args.length == 0){
      PrintUsage printUsage = new PrintUsage();
      printUsage.PrintUsage();
    }


    if (args.length > 0 && args[0].equals("-l")) {
      ListTasks listTasks = new ListTasks();
      listTasks.ListTasks();

    }


  }


}
