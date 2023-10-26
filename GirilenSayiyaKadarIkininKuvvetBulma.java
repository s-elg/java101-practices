package practices;

import java.util.Scanner;

public class GirilenSayiyaKadarIkininKuvvetBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i*=2){
            System.out.println(i);
        }
    }
}
