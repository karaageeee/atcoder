package abc248.a;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String line = scanner.next();
    int total = 0;
    for (String valStr : line.split("")) {
      total += Integer.parseInt(valStr);
    }
    System.out.println(45 - total);
    scanner.close();
  }
}
