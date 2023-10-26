package practices;

import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, toplam = 0;

        do {
            System.out.print("bir sayı giriniz: ");
            sayi = input.nextInt();
            if (!(sayi % 2 == 0))
                toplam += sayi;
        } while (sayi > 0);

        System.out.println("girdiğiniz tek sayıların toplamı: " + toplam);

    }
}
