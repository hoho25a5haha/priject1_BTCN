package Tuan4_5;

import java.util.*;

public class b11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("nhap so hoc sinh trong lop:");
        int number=sc.nextInt();
        String[] a=new String[number];
        for (int i = 0; i < a.length; i++) {
            System.out.println("nhap a["+(i+1)+"]: ");
            a[i]=sc.nextLine(); 
            a[i].trim().replaceAll("\\s+"," ");           
        }
        
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].length()!=0){
                String b=a[i];
                int x=b.length()-2;
                if(b.subSequence(x, b.length()).equals("An")||
                    b.subSequence(x,b.length()).equals("an"))count++;
            }
        }
        System.out.println("co "+count+" ban ten An");
    }
}
