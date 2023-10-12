package practices;

import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double hipotenus;
        int a, b;

        System.out.print("lütfen dik üçgeninizin a kenarını giriniz: ");
        a = input.nextInt();

        System.out.print("lütfen dik içgeninizin b kenarını giriniz: ");
        b = input.nextInt();

        hipotenus = Math.sqrt((a*a) + (b*b));

        System.out.println("girdiğiniz a kenarı: " + a);
        System.out.println("girdiğiniz b kenarı: " + b);
        System.out.println("girdiğiniz verilere yapılan işlemler sonucu bulunan hipotenüz: " + hipotenus);


    }
}
