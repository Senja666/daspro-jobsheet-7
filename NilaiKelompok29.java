import java.util.Scanner;
public class NilaiKelompok29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = 1, j, nilai;
        float totalNilai, rataNilai;
        while (i <= 6) {
            System.out.println("Kelompok ke - " + i);
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok "+j+": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata nilai kelompok ke - " + i + " adalah: " + rataNilai);
            i++;
        }
    }
}