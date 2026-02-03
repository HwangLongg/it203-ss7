public class Bai2 {
    public static void main(String[] args) {
        String moTa = "Sách Toán lớp 10. Kệ: A12, tầng 2.";

        if (moTa.contains("Kệ:")) {
            // Tìm vị trí bắt đầu ngay sau chữ "Kệ: "
            int start = moTa.indexOf("Kệ:") + 4;
            // Tìm dấu phẩy gần nhất sau đó
            int end = moTa.indexOf(",", start);

            String maViTri = moTa.substring(start, end);

            // Thay thế chữ
            String moTaMoi = moTa.replace("Kệ:", "Vị trí lưu trữ:");

            System.out.println("Mã vị trí trích xuất: " + maViTri.trim());
            System.out.println("Mô tả sau khi thay thế: " + moTaMoi);
        }
    }
}