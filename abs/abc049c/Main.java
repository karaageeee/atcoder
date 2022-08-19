package abs.abc049c;

import java.util.*;

// 逆からGreedy
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    StringBuilder ssb = new StringBuilder(s);
    s = ssb.reverse().toString();

    String[] words = {"dream", "dreamer", "erase", "eraser"};
    for(int i = 0; i < words.length; i++) {
      StringBuilder sb = new StringBuilder(words[i]);
      words[i] = sb.reverse().toString();
    }

    String t = "";
    while (true) {

      boolean found = false;
      for (int i = 0; i < words.length; i++) {
        String word = words[i];
        if (t.length() + word.length() > s.length()) continue;
        String subStr = s.substring(t.length(), t.length() + word.length());
        if (subStr.equals(word)) {
          t += word;
          found = true;
          break;
        }
      }

      if (t.equals(s) || !found) break;

    }

    if (t.equals(s)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    sc.close();
  }
}
