package practices;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;

        System.out.print("kullanıcı adını giriniz: ");
        userName = input.nextLine();

        System.out.print("şifrenizi giriniz: ");
        password = input.nextLine();

        if (userName.equals("william") && password.equals("java321") ) {
            System.out.println("başarıyla giriş yaptınız!");
        }else {
            System.out.println("girdiğiniz bilgiler yanlış!");
        }
    }
}
