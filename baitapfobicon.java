package baibuoi2java;

import java.util.Scanner;

public class baitapfobicon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(n + " sổ trong dãy số fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " "  );
        }
    }   
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
