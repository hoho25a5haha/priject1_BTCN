import java.util.Scanner;
public class B4 {
    private static Scanner Sc=new Scanner(System.in);
    private static int Fi(int a){
        if(a==1)return 1;
        else if(a==2)return 2;
        else return Fi(a-1)+Fi(a-2);

    }
    public static void main(String[] args) {
        System.out.print("Nhap so tu nhien N: ");
        int a= Sc.nextInt();  
        System.out.print("Số Fibonaci thứ N = "+Fi(a)); 
          
    }
}
