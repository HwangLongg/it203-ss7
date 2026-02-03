import java.util.regex.*;

public class Bai5 {
    public static void main(String[] args) {
        String log = "2024-05-20 | User: Long | Action: BORROW | BookID: BK123";

        // Tạo các "cái bẫy" () để hứng dữ liệu
        String regex = "(\\d{4}-\\d{2}-\\d{2}) \\| User: (\\w+) \\| Action: (\\w+) \\| BookID: (\\w+)";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(log);

        if (m.find()) {
            System.out.println("Ngày: " + m.group(1)); // Cái bẫy 1
            System.out.println("Tên: " + m.group(2));  // Cái bẫy 2
            System.out.println("Hành động: " + m.group(3)); // Cái bẫy 3
        }
    }
}