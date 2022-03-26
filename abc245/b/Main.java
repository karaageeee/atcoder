package abc245.b;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());
    int[] values = new int[n];

    for (int i = 0; i < n; i++) {
      values[i] = Integer.parseInt(sc.next());
    }

    for (int i = 0; i <= 2001; i++) {
      boolean isFound = false;
      for (int j = 0; j < n; j++) {
        if (values[j] == i) {
          isFound = true;
          break;
        }
      }

      if (!isFound) {
        System.out.println(i);
        break;
      }
    }


    sc.close();
  }
}
