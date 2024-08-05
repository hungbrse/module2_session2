package module_session02;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào 1 số đê bạn ");

        int n = sc.nextInt();

        if (n % 3 == 0  && n % 5 == 0) {
            System.out.println("số này chia hết cho 3 và 5 nhé bạn ");

        } else  if (n % 5 == 0) {
            System.out.println("số này chia hết cho 5 nhé bạn ");
        } else  if (n % 3 == 0) {
            System.out.println("số này chia hết cho 3 ");
        }

    }
}
