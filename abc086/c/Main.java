package abc086.c;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    int[] position = new int[2];
    position[0] = 0; // x
    position[1] = 0; // y
    int time = 0;

    for(int i = 0; i < n; i++) {
      int t = Integer.parseInt(scanner.next());
      int x = Integer.parseInt(scanner.next());
      int y = Integer.parseInt(scanner.next());

      while (time < t) {

        time++;

        // x
        if (position[0] < x) {
          position[0]++;
          continue;
        } else if (position[0] > x) {
          position[0]--;
          continue;
        }
        // y
        if (position[1] < y) {
          position[1]++;
          continue;
        } else if (position[1] > y) {
          position[1]--;
          continue;
        }

        // move anyway
        if (position[0] == x) {
          position[1]++;
        } else {
          position[0]++;
        }

      }

      if (position[0] != x || position[1] != y) {
        System.out.println("No");
        scanner.close();
        return;
      }

    }

    scanner.close();
    System.out.println("Yes");

  }
}
