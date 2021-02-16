package mangbuoi3;
import java.util.Scanner;
public class mangbuoi3 {
     public static void main(String[] args) {
    Scanner scanner  = new Scanner(System.in);
    System.out.println(" Nhập số phần tử của mảng");
    int n = scanner.nextInt();
    int arrn[] = new int [n];

    for (int  i=0; i < n; i++){
        System.out.printf ("nhập phần tử thứ arrn[%d] :", i );
        arrn[i] = scanner.nextInt();
    }
 
    System.out.println("mảng arrn là :" );
    for (int i=0 ; i<n ; i++){ 
        System.out.print( arrn [i] + "  " );

    }

    int minn = arrn[0];
    int maxx = arrn[0];

    for( int i=0 ; i<n; i++){
        if(minn> arrn[i]){
            minn = arrn[i];
        }
        if( maxx < arrn[i]){
            maxx= arrn[i];
        }
    }
    System.out.println("\nphần tử nhỏ nhất trong mảng là: " + minn);
    System.out.println("phần tử lớn nhất trong mảng là: " + maxx);

    int countt = 0;
    System.out.println("Các phần tử chẵn trong mảng là: ");
    for ( int i = 0 ; i< n; i++){
        if( arrn[i]%2==0){
            countt ++;
            System.out.print(arrn[i]+"  ");
        }
    }
    System.out.print("\ncác phần tử là số nguyên tố: ");
    for (int i=0; i<n; i++){
        if(kiemtrasonguyento(arrn[i])){
            System.out.print(arrn[i]+" ");  
        }
    }

    System.out.println("\nmảng theo thứ tự giảm dần là:  ");
    for(int i =0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(arrn[i]>arrn[j]){
                int temp = arrn[i];
                arrn[i]=arrn[j];
                arrn[j]=temp;
            }
        }

    }
    for(int i=0; i<n; i++){
        System.out.print(arrn[i]+" ");
    }
    System.out.println("\nmảng theo thứ tự tăng dần là:  ");
    for(int i =0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(arrn[i]<arrn[j]){
                int temp = arrn[i];
                arrn[i]=arrn[j];
                arrn[j]=temp;
            }
        }

    }
    for(int i=0; i<n; i++){
        System.out.print(arrn[i]+" ");
    }
    scanner.close();
    }
    public static boolean kiemtrasonguyento(int n){
        if(n<=2){
            return false;
        }
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
