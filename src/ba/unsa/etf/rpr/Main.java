package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	System.out.print("Unesite n: ");
    Scanner ulaz = new Scanner(System.in);
    int n = ulaz.nextInt();

    for (int i=1; i<n; i++) {
        if (djeljivSaSumomCifara(i)) System.out.print(i+ " ");
    }
    }

    static boolean djeljivSaSumomCifara(int n) {
        return n%sumaCifara(n) == 0;
    }

    static int sumaCifara (int n) {

        int suma = 0;
        int temp = n;
        while (temp != 0) {
            suma = suma + temp%10;
            temp = temp / 10;
        }
            return suma;
    }
}
