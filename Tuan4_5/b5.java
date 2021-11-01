package Tuan4_5;
import java.util.*;
public class b5 {
    private static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap xau ban dau:");
        String name = sc.nextLine();
        char []a=name.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='1'){              
                a[i]='0';
            }
            else if(a[i]=='0'){
                a[i]='1';
            }
        }
        System.out.println("xau sau khi doi la: ");
        System.out.println(a);
    }
    
}
