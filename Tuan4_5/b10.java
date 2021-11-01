package Tuan4_5;
import java.util.*;
public class b10 {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap so phan tu co trong mang:");
        int number=sc.nextInt();
        String[] a=new String[number];
        for (int i = 0; i < a.length; i++) {
            System.out.println("nhap a["+(i+1)+"]: ");
            a[i]=sc.nextLine();
        }
        String b=a[0];
        int max=a[0].length();
        int x=1;
        for (int i = 0; i < a.length; i++) {
            if(a[i].length()>max){
                max=a[i].length();
                b=a[i];
                x=i+1;
            }
        }
        System.out.println("Phan tu "+x+" : ["+b+"] co do dai "+max+" la lon nhat trong xau a");
        
       
        
    }
}
