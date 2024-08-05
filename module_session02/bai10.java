package module_session02;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("nhập cạnh a:");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("nhập cạnh b:");
                int b = Integer.parseInt(sc.nextLine());
                System.out.println("nhập cạnh c:");
                int c = Integer.parseInt(sc.nextLine());

                if (a > 0 && b > 0 && c > 0) {
                    if (a + b > c && b + c > a && a + c > b) {
                        int perimeter = a + b + c;
                        System.out.println("Chu vi là: " + perimeter);

                        double s = perimeter / 2.0;
                        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                        System.out.println("Diện tích là: " + area);

                        break; // Exit the loop after computing the perimeter and area
                    } else {
                        System.out.println("Các cạnh không hợp lệ để tạo thành một tam giác.");
                    }
                } else {
                    System.out.println("Các cạnh phải là số dương.");
                }
            }
        }
}
