package module_session02;

public class bai7 {
    public static void main(String[] args) {


        int count = 0; // Đếm số lượng số nguyên tố đã tìm được
        int number = 2; // Số cần kiểm tra xem có phải là số nguyên tố không

        while (count < 20) {
            boolean isPrime = true; // Giả sử số hiện tại là số nguyên tố

           for (int i = 2; i < number ; i ++) {
               if (number % i == 0) {
                   isPrime = false;
                   break;
               }
           }


           if (isPrime) {
               System.out.println(number);
               count++;
           }

           number++;




        }
    }
}
