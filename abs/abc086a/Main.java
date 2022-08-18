package abs.abc086a;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Integer a = Integer.parseInt(sc.next());
    Integer b = Integer.parseInt(sc.next());

    if (a % 2 == 0 || b % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }

    sc.close();
  }
}
