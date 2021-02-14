package baibuoi2java;

import java.util.Scanner;

public class switchcasedemo {
 public static void main(String[] args) throws Exception {
        Scanner scanner  = new Scanner(System.in); 
        System.out.println( " Nhập tháng :");
        int thang = scanner.nextInt();

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng " + thang +" có 31 ngày.");               
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("tháng " + thang +" có 30 ngày.");     
                break;
            case 2:
            System.out.println("tháng" + " 2 có 28 hoặc 29 ngày.");
            break;
            default:
            System.out.println("không có tháng " + thang);


            scanner.close();
    } 
       
    }
        
    
}
