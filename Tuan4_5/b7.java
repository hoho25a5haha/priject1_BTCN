package Tuan4_5;

import java.util.*;
public class b7 {
    private static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap xau ban dau:");
        String name = sc.nextLine();
        char []a=name.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='1'||a[i]=='2'||a[i]=='3'||a[i]=='4'||a[i]=='5'||a[i]=='6'||a[i]=='7'||a[i]=='8'||a[i]=='9'||a[i]=='0'){              
                a[i]='$';
            }
            
        }
        System.out.println("xau sau khi doi la: ");
        System.out.println(a);
    }
}
