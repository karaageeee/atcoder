package abs.practicea;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Integer a = Integer.parseInt(sc.next());
    Integer b = Integer.parseInt(sc.next());
    Integer c = Integer.parseInt(sc.next());
    String s = sc.next();

    Integer total = a + b + c;
    System.out.println(total.toString() + " " + s);

    sc.close();
  }
}