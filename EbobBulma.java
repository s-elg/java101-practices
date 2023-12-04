package practices;

import java.util.Scanner;
public class EbobBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1, n2, ebob = 1, ebob2 = 1, enKucuk;

        System.out.print("lütfen n1 sayısını giriniz: ");
        n1 = scan.nextInt();

        System.out.print("lütfen n2 sayısını giriniz: ");
        n2 = scan.nextInt();

        if (n1 < n2) {
            enKucuk = n1;
        } else {
            enKucuk = n2;
        }

        for (int i = 1; i <= enKucuk; i++) {
            if (n1%i == 0 && n2%i == 0) {
                ebob2 = i;
            }
        }

        System.out.println(ebob2);

        System.out.println("****************************");

        for (int i = enKucuk; i >= 1; i--) {
            if (n1%i == 0 && n2%i == 0) {
                ebob = i;
                break;
            }
        }

        System.out.println(ebob);
    }
}
