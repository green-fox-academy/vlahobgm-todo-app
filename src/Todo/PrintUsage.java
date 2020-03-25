package Todo;

public class PrintUsage {
  public void PrintUsage(){
    System.out.println("Command Line Todo application\n" +
        "=============================\n" +
        "Command line arguments:\n\t" +
        "-l   Lists all the tasks\n\t" +
        "-a   Adds a new task\n\t" +
        "-r   Removes an task\n\t" +
        "-c   Completes an task");
  }
}
