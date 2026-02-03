import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine().trim().toUpperCase(); // Viết hoa toàn bộ

        System.out.print("Nhập tác giả: ");
        String author = sc.nextLine().trim().toLowerCase();

        // Logic viết hoa chữ cái đầu bằng vòng lặp cơ bản
        String authorFixed = "";
        for (int i = 0; i < author.length(); i++) {
            char c = author.charAt(i);
            // Nếu là ký tự đầu tiên hoặc ký tự sau khoảng trắng thì viết hoa
            if (i == 0 || author.charAt(i - 1) == ' ') {
                authorFixed += Character.toUpperCase(c);
            } else {
                authorFixed += c;
            }
        }

        System.out.println("\nKết quả: [" + title + "] - Tác giả: [" + authorFixed + "]");
    }
}