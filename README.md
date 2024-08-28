# penjualalattulis

import java.util.Scanner;

public class BBMProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Harga per liter
        double hargaPertamax = 10000;
        double hargaPertalite = 8500;

        // Tampilkan menu
        System.out.println("Pilih jenis BBM:");
        System.out.println("1. Pertamax");
        System.out.println("2. Pertalite");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        // Input jumlah liter
        System.out.print("Masukkan jumlah liter yang ingin dibeli: ");
        int jumlahLiter = scanner.nextInt();

        // Hitung total harga
        double totalHarga = 0;
        switch (pilihan) {
            case 1:
                totalHarga = hargaPertamax * jumlahLiter;
                break;
            case 2:
                totalHarga = hargaPertalite * jumlahLiter;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        // Berikan diskon
        if (jumlahLiter > 25) {
            totalHarga *= 0.95;
        }

        // Tampilkan total harga
        System.out.println("Total harga yang harus dibayar: " + totalHarga);
    }
}