package baibuoi2java;
import java.util.Scanner;
public class bacanhtamgiac{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a, b, c;
    System.out.println(" Nhập cạnh a :");
    a = scanner.nextInt();
    System.out.println(" Nhập cạnh b :");
    b = scanner.nextInt();
    System.out.println(" Nhập cạnh c :");
    c = scanner.nextInt();
    if (a+b>c) {
        if(b+c>a){
            if (c+a >b);
            System.out.println("giá trị : "+a + "," + b +"," + c +" là 3 cạnh của tam giác");
        }
        
    } else {
        System.out.println("giá trị : "+a + "," + b +"," + c +" không là 3 cạnh của tam giác");
    }
    scanner.close();
}
        
    }
    

