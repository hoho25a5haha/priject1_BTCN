package Tuan4_5;

import java.util.Scanner;

public class b6 {
    private static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap xau ban dau:");
        String name = sc.nextLine();
        char []a=name.toCharArray();
        System.out.println("xau sau khi doi la: ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
}
