package baibuoi2java;
import java.util.Scanner;
public class bai3buoi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n");
        int n = scanner.nextInt();
        scanner.close();
        System.out.print( n +"! = " + Giaithua(n));
    } 
    public static int Giaithua(int n) {
        int b = 1;
        if (n == 0 || n == 1) {
            return b;
        } else {
            for (int i = 2; i <= n; i++) {
                b *= i;
            }
            return b;
        }
    }
}
