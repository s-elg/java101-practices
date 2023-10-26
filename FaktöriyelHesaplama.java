package practices;

import java.util.Scanner;

public class FaktöriyelHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, factorial = 1;

        System.out.print("faktöriyeli hesaplanacak sayıyı giriniz: ");
        a = scan.nextInt();

        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        System.out.println("girdiğiniz sayının faktöriyeli: " + factorial);
    }
}
