package practices;

import java.util.Scanner;

public class EkokBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1, n2, ekok = 1;

        System.out.print("lütfen n1 sayısını giriniz: ");
        n1 = scan.nextInt();

        System.out.print("lütfen n2 sayısını giriniz: ");
        n2 = scan.nextInt();

        for (int i = 1; i <= (n1 * n2); i++) {
            if (i%n1 == 0 && i%n2 == 0) {
                ekok = i;
                break;
            }
        }

        System.out.println(ekok);
    }
}
