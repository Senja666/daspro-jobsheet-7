import java.util.Scanner;

public class SiakadWhile29 {5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa;
        double nilai;
        String kategori;

        // Meminta jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();

        // Perulangan untuk input nilai setiap mahasiswa
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            // Validasi input nilai
            while (true) {
                System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
                nilai = sc.nextDouble();

                if (nilai >= 0 && nilai <= 100) {
                    break;  // keluar dari while jika input valid
                } else {
                    System.out.println("❌ Nilai tidak valid! Harus antara 0 - 100. Silakan input ulang.");
                }
            }

            // Menentukan kategori nilai
            if (nilai > 80 && nilai <= 100) {
                kategori = "A";
            } else if (nilai > 73 && nilai <= 80) {
                kategori = "B+";
            } else if (nilai > 65 && nilai <= 73) {
                kategori = "B";
            } else if (nilai > 60 && nilai <= 65) {
                kategori = "C+";
            } else if (nilai > 50 && nilai <= 60) {
                kategori = "C";
            } else if (nilai > 39 && nilai <= 50) {
                kategori = "D";
            } else {
                kategori = "E";
            }

            // Menampilkan hasil kategori
            System.out.println("Nilai mahasiswa ke-" + i + " = " + nilai + " --> Kategori: " + kategori);
            System.out.println("---------------------------------------");
        }

        sc.close();
    }
}
