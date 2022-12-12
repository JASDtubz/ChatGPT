import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    ProcessBuilder pb = new ProcessBuilder("python", "/path/to/script.py");
    Process proc = pb.start();
    proc.waitFor();
  }
}
