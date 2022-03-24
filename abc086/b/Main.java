package abc086.b;

import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    if (Math.sqrt(Double.parseDouble(sc.next() + sc.next())) % 1 != 0) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
    sc.close();
  }
}
