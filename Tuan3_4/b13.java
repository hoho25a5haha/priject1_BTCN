

import java.io.*;
import java.util.Scanner;

class b13 {
    static void spiralPrint(int m, int n, int a[][]) {
        int i, k = 0, l = 0;
        while (k < m && l < n) {
            
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }           
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap n");
        int R = sc.nextInt();
        int[][] ax = new int[R][R];
        for (int i = 0; i < ax.length; ++i) {
            for(int j = 0; j < ax[i].length; ++j) {
                System.out.println("Nhap A["+(i+1)+"]["+(j+1)+"]=");
                ax[i][j]=sc.nextInt();
            }
          }
        spiralPrint(R, R, ax);
    }
}
