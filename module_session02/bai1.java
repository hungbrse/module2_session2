package module_session02;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("nhập vào 1 số từ 0-9:");

        int number = sc.nextInt();


        if (number > 0 && number <= 9) {
            switch (number) {
                case 1:
                    System.out.println("số một");
                    break;
                case 2:
                    System.out.println("số hai");
                    break;
                case 3:
                    System.out.println("số ba");
                    break;

                case 4:
                    System.out.println("số bốn");
                    break;

                case 5:
                    System.out.println("số năm");
                    break;

                case 6:
                    System.out.println("số sáu");
                    break;

                case 7:
                    System.out.println("số bẩy");
                    break;

                case 8:
                    System.out.println("số tám");
                    break;

                case 9:
                    System.out.println("số chín ");
                    break;
                default:
                    System.out.println("số không hợp ");
            }
        } else  {
            System.out.println("số không hợp ");

        }

    }
}
