package practices;

import java.util.Scanner;
public class BuyuktenKucugeSiralama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("a sayısını girin: ");
        a = input.nextInt();

        System.out.print("b sayısını giriniz: ");
        b = input.nextInt();;

        System.out.print("c sayısını giriniz: ");
        c = input.nextInt();

        if (a > b && a > c) {
            if(b > c) {
                System.out.println("a > b > c");
                System.out.println(a + " > " + b + " > " + c);
            } else {
                System.out.println("a > c > b");
                System.out.println(a + " > " + c + " > " + b);
            }
        } else if (b > a && b > c) {
            if (a > c){
                System.out.println("b > a > c");
                System.out.println(b + " > " + a + " > " + c);
            } else {
                System.out.println("b > c > a");
                System.out.println(b + " > " + c + " > " + a);
            }
        }else if (c > a && c > b) {
            if (b > a){
                System.out.println("c > b > a");
                System.out.println(c + " > " + b + " > " + a);
            } else {
                System.out.println("c > a > b");
                System.out.println(c + " > " + a + " > " + b);
            }
        }
    }
}
