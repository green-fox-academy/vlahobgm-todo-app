package Todo;

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

    if (args[0].equals("-l")){
      ListTasks listTasks = new ListTasks();
      listTasks.ListTasks();
    }

  }


}
