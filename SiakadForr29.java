import java.util.Scanner;
public class SiakadForr29 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        double nilai = 0,tertinggi = 0, terendah = 100;
        for(int i = 1; i <= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke " + i+":");
            nilai = sc.nextDouble();
            if(nilai > tertinggi) {
                tertinggi = nilai;
            }
            if(nilai < terendah){
                terendah =nilai;
            }
        }

        System.out.println("Nilai tertinggi adalah :"+tertinggi);    
        System.out.println("Nilai terendah adalah :"+terendah);
        sc.close();
    }
    }