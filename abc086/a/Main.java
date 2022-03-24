package abc086.a;

import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    sc.close();

    PrintWriter out = new PrintWriter(System.out);
    if ((a * b) % 2 == 0) {
      out.println("Even");
    } else {
      out.println("Odd");
    }

    out.flush();
  }
}