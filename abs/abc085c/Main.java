package abs.abc085c;

import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Integer n = Integer.parseInt(sc.next());
    Integer y = Integer.parseInt(sc.next());

    boolean found = false;
    for (int i = 0; i <= n; i++){
      for (int j = 0; j <= n - i; j++){
        int k = n - i - j;
        int total = i * 10000 + j * 5000 + k * 1000;
        if (total == y) {
          System.out.println(String.format("%d %d %d", i, j, k));
          found = true;
          break;
        }
        if (found) break;
      }
      if (found) break;
    }

    if (!found) System.out.println(String.format("%d %d %d", -1, -1, -1));
    sc.close();
  }
}
