package jobsheet5;
import java.util.Scanner;

public class perpustakaan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
        boolean kartu = input.nextBoolean();

        System.out.print("Apakah sudah registrasi online? (true/false): ");
        boolean registrasi = input.nextBoolean();

        if (kartu || registrasi) {
            System.out.println("Mahasiswa boleh masuk");
        } else {
            System.out.println("Mahasiswa tidak boleh masuk");
        }
    }
}
