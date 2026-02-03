import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thẻ: ");
        String maThe = sc.nextLine();

        // Regex: 2 chữ hoa + 4 số năm + 5 số ngẫu nhiên
        String mauRegex = "^[A-Z]{2}\\d{4}\\d{5}$";

        if (maThe.matches(mauRegex)) {
            System.out.println("Mã thẻ hợp lệ!");
        } else {
            // Kiểm tra từng đoạn để báo lỗi cụ thể
            if (!maThe.startsWith("TV")) {
                System.out.println("Lỗi: Phải bắt đầu bằng TV");
            } else {
                System.out.println("Lỗi: Sai định dạng năm hoặc số ngẫu nhiên");
            }
        }
    }
}