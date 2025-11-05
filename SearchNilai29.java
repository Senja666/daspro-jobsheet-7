public class SearchNilai29 {
    public static void main(String[] args) {
        int[] arrNilai = {80, 85, 78, 96, 90, 82, 86};
        int key = 90;
        int hasil = -1;  // gunakan -1 agar bisa tahu jika tidak ditemukan

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break; // berhenti setelah menemukan nilai
            }
        }

        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}
