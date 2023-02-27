package Tugas;
import java.util.Scanner;
/**
 *
 * @author MyBook14G
 */
public class Lingkaran {
    double r, phi=3.14, Luas, Keliling;
    
    public int HitungLuas(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------------------------\n");
        System.out.println("PROGRAM LUAS LINGKARAN");
        System.out.println("\n--------------------------------\n");
        System.out.print("Masukan Jari-jari : ");
        r=input.nextInt();
        
        Luas=phi*r*r;
        System.out.println("Luas Lingkaran adalah : " + Luas);
        return 0;
    }
    public int HitungKeliling(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------------------------\n");
        System.out.println("PROGRAM KELILING LINGKARAN");
        System.out.println("\n--------------------------------\n");
        System.out.print("Masukan Jari-jari : ");
        r=input.nextInt();
        
        Keliling=phi*r*2;
        System.out.println("Keliling Lingkaran adalah : " + Keliling);
        return 0;
    }
}
