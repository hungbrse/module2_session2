package module_session02;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("mời bạn yêu nhập điểm toán");
        double toan = sc.nextDouble();


        System.out.println("mời bạn yêu nhập điểm Lý");
        double ly = sc.nextDouble();


        System.out.println("mời bạn yêu nhập điểm Hóa");
        double hoa = sc.nextDouble();



        System.out.println("mời bạn yêu nhập điểm ");
        double anh = sc.nextDouble();


        double tbMon = (toan + ly + hoa + anh) /4;

                if(tbMon >= 0 && tbMon < 5) {
                    System.out.println("trung bình môn là " +tbMon +"xếp loại yếu ");
                } else if (tbMon >=5 && tbMon < 6.5) {
                    System.out.println("trung bình môn là " +tbMon + "xếp loại Trung ");
                } else if ( tbMon <= 6.5 && tbMon <8) {
                    System.out.println("trung bình môn là " +tbMon +"xếp loại Khá ");
                } else if (tbMon <= 9) {
                    System.out.println("trung bình môn là " +tbMon +"xếp loại xuất ");
                }

    }
}
