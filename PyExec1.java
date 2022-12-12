import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Process proc = Runtime.getRuntime().exec("python /path/to/script.py");
    proc.waitFor();
  }
}
