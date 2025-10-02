package jobsheet5;
import java.util.Scanner;

public class ifElseAngka10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan positif: ");
        int angka = input.nextInt();

        if (angka %2 == 0) {
            System.out.println("Bilangan tersebut Genap");
        } else {
            System.out.println("Bilangan tersebut Ganjil");
        }
    }
}
