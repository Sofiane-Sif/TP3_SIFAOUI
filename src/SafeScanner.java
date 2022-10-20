import java.io.InputStream;
import java.util.Scanner;

public class SafeScanner {
    Scanner sc;
    public SafeScanner(InputStream is){
        this.sc = new Scanner(is);
    }

  //  public int getInt() {
             // à compléter
  //        }
    public void closeScanner(){
        sc.close();
    }
}
