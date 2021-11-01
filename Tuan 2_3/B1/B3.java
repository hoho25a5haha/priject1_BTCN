import java.util.Scanner;
public class B3 {   
    private static double X(int a){
        int p=1;
        double e=0;       
        for(int i=1;i<=a;i++){
            p*=i;
            e+=p;
        }
        double z=1/e;
        return z;
    }
    private static double S(int a) {
        if(a==1)return 1;
        else return S(a-1)+X(a);
    }
    private static Scanner Sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap so tu nhien N: ");
        int a= Sc.nextInt();  
        System.out.print("Tong S = "); 
        System.out.printf("%.16f",S(a));  
    }
}