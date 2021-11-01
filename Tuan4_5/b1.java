package Tuan4_5;
import java.util.*;
public class b1 {
    private static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhập ho ten:");
        String name = sc.nextLine();
        System.out.println("");
        name=name.trim().toLowerCase();
        name=name.replaceAll("\\s+", " ");
        System.out.println(""+name);
    }
}
