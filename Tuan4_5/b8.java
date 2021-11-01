package Tuan4_5;
import java.util.*;
public class b8 {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap s1<s2");
        System.out.println("nhap s1:");
        String s1=sc.nextLine();
        System.out.println("nhap s2:");
        String s2=sc.nextLine();
        boolean a=s2.contains(s1);
        int count=0;
        if(a){
            for (int i = 0; i < s2.length()-s1.length()+1; i++) {
                int x=s1.length()+i;
                if(s2.subSequence(i,x ).equals(s1)){
                    count++;
                }
            }
            System.out.println("S1 xuat hien "+count+" lan tai s2.");
        }
        else System.out.println("S1 khong xuat hien tai s2.");
    }
}
