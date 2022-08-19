package abs.abc088b;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Integer n = Integer.parseInt(sc.next());
    List<Integer> cards = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      cards.add(Integer.parseInt(sc.next()));
    }

    cards.sort(Comparator.reverseOrder());

    Integer a = 0, b = 0;

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        a += cards.get(i);
      } else {
        b += cards.get(i);
      }
    }

    System.out.println(a - b);

    sc.close();

  }
}
