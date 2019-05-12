package pbo11;
import java.util.*;
public class Pbo11 {
    
    static String merk, nama, wujud, warna, fungsi, manfaat,j_kes, jenis, man;
    static int jumlah, alat, dimensi;
    static double harga;
    static Scanner input = new Scanner(System.in); 
    static AlatMandi bersih = new AlatMandi();
    static AlatTulis kerja = new AlatTulis();
    static AlatKesehatan sehat = new AlatKesehatan();
    public static void main(String[] args) {
        input();       
    }
public static void input() {
        System.out.print("Masukkan Jumlah Alat : ");
        jumlah = input.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nAlat ke~ "+(i+1));
            System.out.println("Pilihan Yang Tersedia");
            System.out.println("1. Alat Mandi");
            System.out.println("2. Alat Tulis");
            System.out.println("3. Alat Kesehatan");
            System.out.print("Jenis Alat : ");
            alat = input.nextInt();
            if (alat == 1) {
                System.out.println("\nAlat Mandi");
                nama = bersih.nama(nama);
                merk = bersih.merk(merk);
                harga = bersih.hargaBeli(harga);
                wujud = bersih.wujud(wujud);
                warna = bersih.warna(warna);
            }
            if (alat == 2) {
                System.out.println("\nAlat Tulis");
                nama = kerja.nama(nama);
                merk = kerja.merk(merk);
                harga = kerja.hargaBeli(harga);
                fungsi= kerja.fungsi(fungsi);
                dimensi = kerja.dimensi(dimensi);
            }
            if (alat == 3) {
                System.out.println("\nAlat Kesehatan");
                nama = sehat.nama(nama);
                merk = sehat.merk(merk);
                harga = sehat.hargaBeli(harga);
                j_kes = sehat.jenis(j_kes);
                man = sehat.manfaat(man);
            }
        }    
    }
}

