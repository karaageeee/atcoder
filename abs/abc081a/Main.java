package abs.abc081a;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String val = sc.next();
    Integer count = 0;
    for (String s: val.split("")) {
      if (s.equals("1")) count++;
    }

    System.out.println(count.toString());

    sc.close();
  }
}
