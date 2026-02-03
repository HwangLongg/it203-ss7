public class Bai6 {
    public static void main(String[] args) {
        String danhGia = "Quyển sách này rất tệ, nội dung dở quá.";
        String[] blacklist = {"tệ", "dở"};

        // Duyệt từng từ xấu trong danh sách đen
        for (int i = 0; i < blacklist.length; i++) {
            String tuXau = blacklist[i];

            // Tạo chuỗi **** có độ dài bằng từ xấu
            String sao = "";
            for (int j = 0; j < tuXau.length(); j++) {
                sao += "*";
            }

            // Thay thế từ xấu bằng sao
            danhGia = danhGia.replace(tuXau, sao);
        }

        System.out.println("Kết quả: " + danhGia);
    }
}