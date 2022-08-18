package abs.abc081b;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer n = Integer.parseInt(sc.next());
    List<Integer> values = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      values.add(Integer.parseInt(sc.next()));
    }

    Integer count = 0;
    while (values.stream().allMatch(v -> v % 2 == 0)) {
      values = values.stream().map(v -> v / 2).collect(Collectors.toList());
      count++;
    }

    System.out.println(count);

    sc.close();
  }
}
