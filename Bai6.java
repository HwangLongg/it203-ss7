package PTIT_CNTT1_IT203A_Session07;

import java.util.Scanner;

public class Bai6 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        User user1 = new User(1, "nvana", "nva12345");
        User user2 = new User(2, "tthib", "ttb12345");
        User user3 = new User(3, "bvanc", "bvc12345");

        UserManager.addUser(user1);
        UserManager.addUser(user2);
        UserManager.addUser(user3);



        System.out.println("\nNhập thông tin đăng nhập");
        System.out.print("\tTên đăng nhập: ");
        String loginUsername = sc.nextLine();
        System.out.print("\tMật khẩu: ");
        String loginPassword = sc.nextLine();
        if(UserManager.checkLogin(loginUsername, loginPassword)){
            System.out.println("Đăng nhập thành công");
        }else{
            System.out.println("Tên đăng nhập hoặc mật khẩu chưa đúng, vui lòng thử lại");
        }


    }
}
