package abc245.c;

import java.util.Scanner;

// TODO: DP (動的計画法)
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int[] A = new int[n];
    int[] B = new int[n];

    for (int i = 0; i < n; i++) {
      A[i] = Integer.parseInt(sc.next());
    }
    for (int i = 0; i < n; i++) {
      B[i] = Integer.parseInt(sc.next());
    }
    boolean isValid = true;
    for (int i = 2; i < n; i++) {
      if (
      Math.abs(A[i - 1] - A[i]) <= k ||
      Math.abs(A[i - 1] - B[i]) <= k ||
      Math.abs(B[i - 1] - A[i]) <= k ||
      Math.abs(B[i - 1] - B[i]) <= k) {
        continue;
      }

      isValid = false;
      break;
    }

    if (isValid) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }
}
