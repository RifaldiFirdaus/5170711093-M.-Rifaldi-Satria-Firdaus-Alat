package pbo11;
import java.util.*;
public class AlatMandi extends alat{
        
    Scanner input = new Scanner(System.in);
    public String wujud(String warna){
        System.out.print("Masukkan Warna \t= ");
        warna = input.next();
        return warna;
    }

    public String warna(String wujud) {
        System.out.print("Masukkan wujud \t= ");
        wujud = input.next();
        return wujud;
    }
}
