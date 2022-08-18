package abs.abc087b;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Integer a = Integer.parseInt(sc.next()); // 500 yen
    Integer b = Integer.parseInt(sc.next()); // 100 yen
    Integer c = Integer.parseInt(sc.next()); // 50 yen
    Integer x = Integer.parseInt(sc.next()); // total

    Integer count = 0;

    for (int i = 0; i <= a; i++) {
      for (int j = 0; j <= b; j++) {
        for (int k = 0; k <= c; k++) {
          Integer total = i * 500 + j * 100 + k * 50;
          if (total.equals(x)) count++;
        }
      }
    }

    System.out.println(count);

    sc.close();
  }
}
