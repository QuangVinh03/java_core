package java_core;

public class Test {
	public static void main(String[] args) {
		int number = 0;  // Bắt đầu từ số 1

        for (int i = 1; i <= 5; i++) {  // Số dòng của tháp (5 dòng)
        	number = number+1;
            for (int j = 0; j < i; j++) {  // Số lượng phần tử trên mỗi dòng
                System.out.print(number + " ");
                number += 2;  // Tăng thêm 2 cho mỗi phần tử
            }
            System.out.println();  // Xuống dòng sau mỗi dòng của tháp
        }
 
	}
}
