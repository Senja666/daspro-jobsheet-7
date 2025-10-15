import java.util.Scanner;

public class kafeDoWhile29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHarga = 0;
        String input;

        System.out.println("=== KAFE SEDERHANA ===");
        System.out.println("Menu:");
        System.out.println("1. Kopi  - Rp 12.000");
        System.out.println("2. Teh   - Rp 7.000");
        System.out.println("3. Roti  - Rp 20.000");
        System.out.println("Ketik 'batal' untuk menghentikan transaksi.");
        System.out.println();

        do {
            System.out.print("Masukkan pilihan menu (1/2/3) atau 'batal': ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break; // keluar dari perulangan
            }

            switch (input) {
                case "1":
                    totalHarga += 12000;
                    System.out.println("Kopi ditambahkan. Total sementara: Rp " + totalHarga);
                    break;
                case "2":
                    totalHarga += 7000;
                    System.out.println("Teh ditambahkan. Total sementara: Rp " + totalHarga);
                    break;
                case "3":
                    totalHarga += 20000;
                    System.out.println("Roti ditambahkan. Total sementara: Rp " + totalHarga);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi!");
                    break;
            }

        } while (true);

        System.out.println();
        System.out.println("Total transaksi: Rp " + totalHarga);
        System.out.println("=== Transaksi Selesai ===");

        sc.close();
    }
}



    



