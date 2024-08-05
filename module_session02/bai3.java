package module_session02;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số từ 1 đến 999:");

        int number = sc.nextInt();

        if (number >= 0 && number < 10) {
            switch (number) {
                case 0: System.out.println("zero"); break;
                case 1: System.out.println("one"); break;
                case 2: System.out.println("two"); break;
                case 3: System.out.println("three"); break;
                case 4: System.out.println("four"); break;
                case 5: System.out.println("five"); break;
                case 6: System.out.println("six"); break;
                case 7: System.out.println("seven"); break;
                case 8: System.out.println("eight"); break;
                case 9: System.out.println("nine"); break;
            }
        } else if (number >= 10 && number < 20) {
            switch (number) {
                case 10: System.out.println("ten"); break;
                case 11: System.out.println("eleven"); break;
                case 12: System.out.println("twelve"); break;
                case 13: System.out.println("thirteen"); break;
                case 14: System.out.println("fourteen"); break;
                case 15: System.out.println("fifteen"); break;
                case 16: System.out.println("sixteen"); break;
                case 17: System.out.println("seventeen"); break;
                case 18: System.out.println("eighteen"); break;
                case 19: System.out.println("nineteen"); break;
            }
        } else if (number >= 20 && number < 100) {
            int hangChuc = number / 10;
            int hangDonVi = number % 10;
            String inHangChuc = "";
            String inHangDonVi = "";

            switch (hangChuc) {
                case 2: inHangChuc = "twenty"; break;
                case 3: inHangChuc = "thirty"; break;
                case 4: inHangChuc = "forty"; break;
                case 5: inHangChuc = "fifty"; break;
                case 6: inHangChuc = "sixty"; break;
                case 7: inHangChuc = "seventy"; break;
                case 8: inHangChuc = "eighty"; break;
                case 9: inHangChuc = "ninety"; break;
            }

            switch (hangDonVi) {
                case 1: inHangDonVi = "one"; break;
                case 2: inHangDonVi = "two"; break;
                case 3: inHangDonVi = "three"; break;
                case 4: inHangDonVi = "four"; break;
                case 5: inHangDonVi = "five"; break;
                case 6: inHangDonVi = "six"; break;
                case 7: inHangDonVi = "seven"; break;
                case 8: inHangDonVi = "eight"; break;
                case 9: inHangDonVi = "nine"; break;
                default: inHangDonVi = ""; break; // Trường hợp không hợp lệ
            }

            if (hangDonVi == 0) {
                System.out.println(inHangChuc);
            } else {
                System.out.println(inHangChuc + " " + inHangDonVi);
            }
        } else if (number >= 100 && number < 1000) {
            int hangTram = number / 100;
            int hangChuc = (number % 100) / 10;
            int hangDonVi = number % 10;
            String inHangTram = "";
            String inHangChuc = "";
            String inHangDonVi = "";

            switch (hangTram) {
                case 1: inHangTram = "one hundred"; break;
                case 2: inHangTram = "two hundred"; break;
                case 3: inHangTram = "three hundred"; break;
                case 4: inHangTram = "four hundred"; break;
                case 5: inHangTram = "five hundred"; break;
                case 6: inHangTram = "six hundred"; break;
                case 7: inHangTram = "seven hundred"; break;
                case 8: inHangTram = "eight hundred"; break;
                case 9: inHangTram = "nine hundred"; break;
            }

            if (hangChuc == 0 && hangDonVi == 0) {
                System.out.println(inHangTram);
            } else {
                switch (hangChuc) {
                    case 2: inHangChuc = "twenty"; break;
                    case 3: inHangChuc = "thirty"; break;
                    case 4: inHangChuc = "forty"; break;
                    case 5: inHangChuc = "fifty"; break;
                    case 6: inHangChuc = "sixty"; break;
                    case 7: inHangChuc = "seventy"; break;
                    case 8: inHangChuc = "eighty"; break;
                    case 9: inHangChuc = "ninety"; break;
                }

                switch (hangDonVi) {
                    case 1: inHangDonVi = "one"; break;
                    case 2: inHangDonVi = "two"; break;
                    case 3: inHangDonVi = "three"; break;
                    case 4: inHangDonVi = "four"; break;
                    case 5: inHangDonVi = "five"; break;
                    case 6: inHangDonVi = "six"; break;
                    case 7: inHangDonVi = "seven"; break;
                    case 8: inHangDonVi = "eight"; break;
                    case 9: inHangDonVi = "nine"; break;
                }

                if (hangChuc == 0) {
                    System.out.println(inHangTram + " " + inHangDonVi);
                } else {
                    System.out.println(inHangTram + " " + inHangChuc + " " + inHangDonVi);
                }
            }
        }
    }
}
