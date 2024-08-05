package module_session02;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);




        while (true) {
            System.out.println("1.Kiểm tra tính chẵn lẻ của 1 số.");
            System.out.println("2.Kiểm tra số nguyên tố.");
            System.out.println("3.Kiểm tra một số có chia hết cho 3 không.");
            System.out.println("4.Thoát");


            int choice = Integer.parseInt(sc.nextLine());


            if (choice == 4) {
                break;
            }
            switch (choice) {

                case 1:
                    System.out.println("Hãy nhập 1 số");
                    int number1 =  Integer.parseInt(sc.nextLine());

                    if (number1 % 2 == 0) {
                        System.out.println(number1 + "không phải số nguyên tố ");

                    } else  {
                        System.out.println(number1 + "là số  nguyên tố");
                    }
                    break;

                case 2 :
                    System.out.println("Hãy nhập 1 số");
                    int number2 =  Integer.parseInt(sc.nextLine());

                    if (number2 == 1) {
                        System.out.println(number2 + "không phải số nguyên ");
                    } else {
                        for ( int i = 2; i < number2 ; i++) {
                            if (number2 % i == 0) {
                                System.out.println(number2 + "không phải số nguyên tố ");
                            }else {
                                System.out.println(number2 + " số nguyên tố");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Hãy nhập 1 số");

                    int number3 =  Integer.parseInt(sc.nextLine());
                    if (number3 % 3 == 0) {
                        System.out.println(number3 +"chia hết cho 3 kk");
                    }

                case 4 :

                    break;
            }


        }





    }
}
