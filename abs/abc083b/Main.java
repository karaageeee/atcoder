package abs.abc083b;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Integer n = Integer.parseInt(sc.next());
    Integer a = Integer.parseInt(sc.next());
    Integer b = Integer.parseInt(sc.next());

    int total = 0;

    for (int i = 1; i <= n; i++) {
      int sum = Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
      if (sum >= a && sum <= b) total += i;
    }

    System.out.println(total);

    sc.close();
  }
}
