package Tuan4_5;

import java.util.*;

public class b14 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("nhap so phan tu co trong mang:");
        int number = sc.nextInt();
        System.out.println("nhap S[" + (1) + "]: ");
        Integer s0 = sc.nextInt();
        String[] a = new String[number];
        a[0] = Integer.toString(s0);
        String []ch;
       
        String b;
        ArrayList<String> x=new ArrayList<String>();
        int q=a[0].length();
        for (int i = 0; i <number-1; i++) {
            for (int j = 0; j <q-1; j++) {
                b=String.valueOf(a[i].charAt(j));
                switch (b) {
                    case "1":{ b="2";break;}
                    case "2":{ b="3";break;}
                    case "3":{ b="4";break;}
                    case "4":{ b="5";break;}
                    case "5":{ b="6";break;}
                    case "6":{ b="7";break;}
                    case "7":{ b="8";break;}
                    case "8":{ b="9";break;}
                    case "9":{ b="10";break;}                                 
                }
                x.add(b);
                x.toArray();
            }
            System.out.println(x); 
        }
        
    }
}
