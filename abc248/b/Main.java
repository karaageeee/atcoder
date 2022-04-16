package abc248.b;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long slimes = Integer.parseInt(sc.next());
    int targetSlimeCount = Integer.parseInt(sc.next());
    int ratio = Integer.parseInt(sc.next());

    int shoutCount = 0;
    while (slimes < targetSlimeCount) {
      shoutCount++;
      slimes *= ratio;
    }

    System.out.println(shoutCount);
    sc.close();
  }
}
