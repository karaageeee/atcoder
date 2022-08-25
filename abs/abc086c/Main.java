import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer n = Integer.parseInt(sc.next());
    Integer[] tArr = new Integer[n];
    Integer[] xArr = new Integer[n];
    Integer[] yArr = new Integer[n];
    for (int i = 0; i < n; i++) {
      tArr[i] = Integer.parseInt(sc.next());
      xArr[i] = Integer.parseInt(sc.next());
      yArr[i] = Integer.parseInt(sc.next());
    }

    boolean isValid = true;
    for (int i = 0; i < n; i++) {
      Integer prevT, prevX, prevY;
      if (i == 0) {
        prevT = 0;
        prevX = 0;
        prevY = 0;
      } else {
        prevT = tArr[i -1];
        prevX = xArr[i -1];
        prevY = yArr[i -1];
      }
      Integer t = tArr[i] - prevT;
      Integer x = Math.abs(xArr[i] - prevX);
      Integer y = Math.abs(yArr[i] - prevY);
      Integer remainT = t - (x + y);
      if (remainT < 0 || remainT % 2 != 0) {
        isValid = false;
        break;
      }

    }
    if (isValid) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    sc.close();
  }
}
