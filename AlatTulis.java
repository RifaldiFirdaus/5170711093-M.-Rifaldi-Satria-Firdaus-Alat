package pbo11;
import java.util.*;
public class AlatTulis extends alat{
    Scanner input = new Scanner(System.in);
    String fungsi (String fungsi){
        System.out.print("Masukan Fungsi  = ");
        fungsi = input.next();
        return fungsi;
    } 
    int dimensi(int dimensi) {
        System.out.println("Masukan Dimensi ");
        int p, l;
        System.out.print("Masukan Panjang = ");
        p = input.nextInt();
        System.out.print("Masukan Lebar   = ");
        l = input.nextInt();
        
        return dimensi;
    }       
}
