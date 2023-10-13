package practices;

import java.util.Scanner;
public class DaireAlanCevreHesaplama {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        int r;
        double cevre, alan, pi = 3.14;

        System.out.print("lütfen çevresi ve alanı hesaplanacak dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        cevre = 2 * pi * r;
        alan = pi * r * r;

        System.out.print("yarıçapını verdiğiniz çevrenin alanı: " + alan + " ve cevresi : " + cevre);
    }

}