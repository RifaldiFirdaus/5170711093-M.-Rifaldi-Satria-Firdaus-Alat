package pbo11;
import java.util.*;
public class alat {
    Scanner input = new Scanner(System.in);
    public String nama(String nm){
        System.out.print("Nama Alat \t= ");
        nm = input.next();
        return nm;
    }
       
    public String merk(String mrk){
        System.out.print("Merk \t\t= ");
        mrk = input.next();
        return mrk;
    }
    
     public double hargaBeli(double harga){
         System.out.print("Harga \t\t= ");
         harga = input.nextDouble();
        return harga;
    }
}

