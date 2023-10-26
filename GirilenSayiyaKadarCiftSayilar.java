package practices;

import java.util.Scanner;
public class GirilenSayiyaKadarCiftSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("bir sayı giriniz: ");
        sayi = input.nextInt();

       /*for (int i = 1; i <= sayi; i++) {
            if (!(i % 2 == 0)) {
                continue;
            }
            System.out.println(i);
        }*/


        /* int i = -1;
        while (i <= sayi) {
            i++;
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        } */

    }
}
