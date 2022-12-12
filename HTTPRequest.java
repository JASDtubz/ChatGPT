import java.io.*;
import java.net.*;

public class Main {
  public static void main(String[] args) throws IOException {
    URL url = new URL("https://www.example.com/api/v1/user/12345");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Accept", "application/json");

    if (conn.getResponseCode() != 200) {
      throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
    }

    BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

    String output;
    while ((output = br.readLine()) != null) {
      System.out.println(output);
    }

    conn.disconnect();
  }
}
