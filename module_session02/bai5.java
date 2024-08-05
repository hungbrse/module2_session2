package module_session02;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập số thứ nhất đi bạn ");
        int n1 = sc.nextInt();


        System.out.println("nhập số thứ 2 đi bạn ");
        int n2 = sc.nextInt();

        int sum = 0;
        for (int i = n1 ;i <= n2 ; i ++) {

            if (i % 2 == 0) {
                sum = sum + i;

            }
        }

        System.out.println("tổng  của các số chẵn từ n1 - n2 là" + sum);
    }
}
