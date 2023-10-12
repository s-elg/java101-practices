package practices;

import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double tutar, kdvTutari, kdvOrani = 0.18;
        int fiyat;

        System.out.print("Lütfen alacağınız ürünün fiyatını girinz: ");
        fiyat = input.nextInt();

        kdvTutari = fiyat * kdvOrani;

        tutar = kdvTutari + fiyat;
        System.out.println("Almayı seçtiğiniz ürünün KDV'siz fiyatı: " + fiyat);
        System.out.println("Aldığınız ürünün KDV tutarı: " + kdvTutari);
        System.out.println("Aldığınız ürünün KDV eklenmiş fiyatı: " + tutar);



    }
}
