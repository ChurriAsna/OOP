package Tugas;
import java.util.Scanner;
/**
 *
 * @author MyBook14G
 */
public class Persegi {
    public int PanjangSisi, Luas, Keliling;
    
    public int HitungLuas(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------------------------\n");
        System.out.println("PROGRAM LUAS PERSEGI");
        System.out.println("\n--------------------------------\n");
        System.out.print("Masukan Panjang Sisi : ");
        int PanjangSisi = input.nextInt();
        
        //int Luas;
        Luas = PanjangSisi*PanjangSisi;
        System.out.println("Luas Persegi adalah : " + Luas);
        return Luas;
    }
    
    public int HitungKeliling(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------------------------\n");
        System.out.println("PROGRAM KELILING PERSEGI");
        System.out.println("\n--------------------------------\n");
        System.out.print("Masukan Panjang Sisi : ");
        int PanjangSisi = input.nextInt();
        
        //int Keliling;
        Keliling = PanjangSisi*4;
        System.out.println("Luas Persegi adalah : " + Keliling);
        return Keliling;
    }
}
