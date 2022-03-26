package abc245.a;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.next());
    int b = Integer.parseInt(scanner.next());
    int c = Integer.parseInt(scanner.next());
    int d = Integer.parseInt(scanner.next());

    if (a < c) {
      System.out.println("Takahashi");
    } else if (a > c) {
      System.out.println("Aoki");
    } else {
      if (b < d) {
        System.out.println("Takahashi");
      } else if (b > d) {
        System.out.println("Aoki");
      } else {
        System.out.println("Takahashi");
      }
    }

    scanner.close();
  }
}
