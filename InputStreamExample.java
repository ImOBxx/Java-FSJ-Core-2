import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

  public static void main(String[] args) {
    try (InputStream obj = new FileInputStream("mytext.txt")) {
      int i = obj.read();
      while (i != -1) {
        System.out.print((char) i);
        i = obj.read();
      }
    } catch (IOException e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }

}

