import java.util.Scanner;
public class SiakadFor28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tertinggi = 0;
        double terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            double nilai = scanner.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        scanner.close();
    }
}