package practices;

import java.util.Scanner;

public class GecmeDurumu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int turkce, mat, fizik, kimya, muzik, gecmeNotu = 55;
        double ortalama;

        System.out.print("türkçe notu: ");
        turkce = input.nextInt();

        System.out.print("matematik notu: ");
        mat = input.nextInt();

        System.out.print("fizik notu: ");
        fizik = input.nextInt();

        System.out.print("kimya notu: ");
        kimya = input.nextInt();

        System.out.print("muzik notu: ");
        muzik = input.nextInt();

        ortalama = (double) (turkce + mat + fizik + kimya + muzik) / 2;

        if(ortalama >= gecmeNotu){
            System.out.println("sınfı geçtiniz.");
        }else {
            System.out.println("sınıf tekrarı yapacaksınız.");
        }

        System.out.println("ortalamanız: " + ortalama);


    }
}
