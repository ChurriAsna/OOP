package Tugas;
import java.util.Scanner;
/**
 *
 * @author MyBook14G
 */
public class PersegiPanjang {
    public int Panjang, Lebar, Luas, Keliling;
    
    public int HitungLuas(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------------------------\n");
        System.out.println("PROGRAM LUAS PERSEGI PANJANG");
        System.out.println("\n--------------------------------\n");
        System.out.print("Masukan Panjang : ");
        int Panjang = input.nextInt();
        System.out.print("Masukan Lebar : ");
        int Lebar = input.nextInt();
        
        
        //int Luas;
        Luas = Panjang*Lebar;
        System.out.println("Luas Persegi adalah : " + Luas);
        return Luas;
    }
    
    public int HitungKeliling(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------------------------\n");
        System.out.println("PROGRAM KELILIG PERSEGI PANJANG");
        System.out.println("\n--------------------------------\n");
        System.out.print("Masukan Panjang : ");
        int Panjang= input.nextInt();
        System.out.print("Masukan Lebar : ");
        int Lebar = input.nextInt();
        
        //int Keliling;
        Keliling = 2*(Panjang+Lebar);
        System.out.println("Keliling Persegi adalah : " + Keliling);
        return Keliling;
    }
}
