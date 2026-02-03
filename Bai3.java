public class Bai3 {
    public static void main(String[] args) {

        StringBuilder nhatKy = new StringBuilder();

        nhatKy.append("BÁO CÁO NGÀY: 2026-01-28\n");

        String[] maSach = {"BK001", "BK002", "BK003"};
        String[] ngayMuon = {"20/01", "21/01", "22/01"};

        for (int i = 0; i < maSach.length; i++) {

            nhatKy.append("Mã: ").append(maSach[i]);
            nhatKy.append(" | Ngày: ").append(ngayMuon[i]).append("\n");
        }

        System.out.println(nhatKy.toString());
    }
}