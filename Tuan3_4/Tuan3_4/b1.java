/**
 * b1
 */
package Tuan3_4;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class b1 {
    private static Scanner sr=new Scanner(System.in);
public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<Integer>();
    java.util.Random rand =new Random();
    System.out.print("Nhap so phan tu cua mang:");
    int p=sr.nextInt();
    for(int i=0;i<p;i++){
        int x=rand.nextInt(100);
        a.add(x);
    }
    System.out.println("mang truoc xap xep: ");
    for (int i : a) {
        System.out.print("|"+i+"|");
    }
    System.out.println("");
    a.sort((o1,o2)->o2-o1);
    System.out.println("mang sau xap xep: ");
    for (int i : a) {
        System.out.print("|"+i+"|");
    }
}
}