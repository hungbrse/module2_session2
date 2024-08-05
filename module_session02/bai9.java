package module_session02;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));


        while (true) {
            System.out.println("1.Tính chu vi và diện tích hình chữ nhật .");
            System.out.println("2.Tính chu vi và diện tích hình tam giác");
            System.out.println("3.Tính chu vi và diện tích hình tròn.");
            System.out.println("exit");


            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 4) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("nhập chiều rộng");
                    int chieuRong =  Integer.parseInt(sc.nextLine());
                    System.out.println("nhập chiều dai ");
                    int chieuDai =  Integer.parseInt(sc.nextLine());

                    System.out.println("chu vi hinh chữ nhật là " + 2*(chieuRong + chieuDai));
                    System.out.println("diện tích hinh chữ nhật là " + (chieuRong * chieuDai));
                    break;

                    case 2:
                        System.out.println("nhập cạnh a: cạnh bên trái");
                        int a =  Integer.parseInt(sc.nextLine());
                        System.out.println("nhập cạnh b: cạnh bên phải");
                        int b =  Integer.parseInt(sc.nextLine());
                        System.out.println("nhập cạnh c: cạnh đáy");
                        int c =  Integer.parseInt(sc.nextLine());
                        System.out.println("nhập chiều cao tam ");
                        int chieuCao =  Integer.parseInt(sc.nextLine());


                        System.out.println("chu vi tam giác là " +(a+b+c));
                        System.out.println("diện tích tam giác là " + (0.5 *c *chieuCao));


                case 3:

                    System.out.println("nhập bán kính hình tròn ");
                    int r =  Integer.parseInt(sc.nextLine());

                    System.out.println("diện tích hình chữ tròn" + 3.14 * r * r);
                    System.out.println("chu vi hinh tron" + 2* 3.14 * r );

                case 4:
                    break;
            }


        }



    }
}
