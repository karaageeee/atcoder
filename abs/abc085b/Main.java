package abs.abc085b;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Integer n = Integer.parseInt(sc.next());
    Integer[] values = new Integer[n];
    for (int i = 0; i < n; i++) {
      values[i] = Integer.parseInt(sc.next());
    }

    long size = Arrays.stream(values).distinct().count();

    System.out.println(size);

    sc.close();

  }
}
