package practices;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n1, n2, selection;

        System.out.print("ilk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.print("işlem seçiniz (1-toplama, 2-çıkarma, 3-çarpma 4-bölme): ");
        selection = input.nextInt();

        if (selection == 1) {
            System.out.println("seçtiğiniz işlem sonucu: " + (n1+n2));
        }else if (selection == 2) {
            System.out.println("seçtiğiniz işlem sonucu: " + (n1-n2));
        }else if (selection == 3) {
            System.out.println("seçtiğiniz işlem sonucu: "+ (n1*n2));
        }else if (selection == 4) {
            System.out.println("seçtiğiniz işlem sonucu: "+ (n1/n2));
        }
    }
}
