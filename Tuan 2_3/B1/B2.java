
import java.util.Scanner;
public class B2 {
    private static double P(int a) {
        double x=1;
        double z=0;
        for(int i=1;i<=a;i++){
            x=x*i;
        }
        z=(1/x);
        return z;
    }
    private static double S(int a) {
        if(a==1)return 1;
        else return S(a-1)+P(a);
    }
    private static Scanner Sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap so tu nhien N: ");
        int a= Sc.nextInt();  
        System.out.print("Tong S = "); 
        System.out.printf("%.16f",S(a));  
    }
}
