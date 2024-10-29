package oop_company;

import java.util.Scanner;

public class Main {
	static Company com;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Menu:");
		System.out.println("1. Nhập thông tin công ty");
		System.out.println("2. Thêm thông tin một nhân sự");
		System.out.println("3. Thêm, xóa thông tin một nhân sự");
		System.out.println("4. Phân bổ Nhân viên vào Trưởng phòng");
		System.out.println("5. Xuất ra thông tin toàn bộ người trong công ty");
		System.out.println("6. Tính và xuất tổng lương cho toàn công ty");
		System.out.println("7. Tìm Nhân viên thường có lương cao nhất");
		System.out.println("8. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất");
		System.out.println("9. Sắp xếp nhân viên toàn công ty theo thứ tự abc");
		System.out.println("10. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần");
		System.out.println("11. Tìm Giám Đốc có số lượng cổ phần nhiều nhất");
		System.out.println("12. Tính và Xuất tổng THU NHẬP của từng Giám Đốc");
		System.out.println("0. Thoát");
		while (true) {
			
			System.out.print("Chọn chức năng: ");
			int choice = sc.nextInt();
			sc.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				nhapThongTinCongTy();
				break;
			case 2:
				themNhanSu();
				break;
			case 3:
//				themXoaNhanSu();
				break;
			case 4:
//				xuatThongTinToanBo();
				break;
			case 5:
//				tinhTongLuong();
				break;
			case 6:
//				timNhanVienLuongCaoNhat();
				break;
			case 7:
//				timTruongPhongNhieuNhanVienNhat();
				break;
			case 8:
//				sapXepNhanVienTheoABC();
				break;
			case 9:
//				sapXepNhanVienTheoLuongGiamDan();
				break;
			case 10:
//				timGiamDocCoPhanNhieuNhat();
				break;
			case 11:
//				tinhThuNhapGiamDoc();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Chức năng không hợp lệ!");
			}
		}
	}

	private static void nhapThongTinCongTy() {
		System.out.print("Nhập tên công ty: ");
		String tenCongTy = sc.nextLine();
		System.out.print("Nhập mã số thuế: ");
		String maSoThue = sc.nextLine();
//		sc.nextLine(); // Consume newline
		com = new Company(tenCongTy, maSoThue);
	}
	
	private static void themNhanSu() {
		System.out.print("Nhập ID nhan su: ");
		String id = sc.nextLine();
		System.out.print("Nhập ten nhan su: ");
		String tenNhanSu = sc.nextLine();
		System.out.print("Nhập so dien thoai: ");
		String soDienThoai = sc.nextLine();
		System.out.print("Nhập số ngày làm việc: ");
		int maSoThue = sc.nextInt();
		System.out.print("Nhập lương 1 ngày: ");
		double luongMotNgay = sc.nextDouble();
//		People people = new St;
		
		
	}

}
