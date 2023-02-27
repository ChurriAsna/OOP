package Tugas;
import java.util.Scanner;
/**
 *
 * @author MyBook14G
 */
public class Elips {
    double phi=3.14, semimajoraxis, semiminoraxis, Luas, Keliling;
    double c = Math.sqrt((this.semimajoraxis*this.semimajoraxis)+(this.semiminoraxis*this.semiminoraxis)/2);
    
    public int HitungLuas(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------------------------\n");
        System.out.println("PROGRAM LUAS ELIPS");
        System.out.println("\n--------------------------------\n");
        
        System.out.print("Masukan semimajoraxis : ");
        semimajoraxis=input.nextInt();
        System.out.print("Masukan semiminoraxis : ");
        semiminoraxis=input.nextInt();
        
        Luas=phi*semimajoraxis*semiminoraxis;
        System.out.println("Luas Lingkaran adalah : " + Luas);
        return 0;
    }
    public int HitungKeliling(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n--------------------------------\n");
        System.out.println("PROGRAM KELILING ELIPS");
        System.out.println("\n--------------------------------\n");
        
        System.out.print("Masukan semimajoraxis : ");
        semimajoraxis=input.nextInt();
        System.out.print("Masukan semiminoraxis : ");
        semiminoraxis=input.nextInt();
        
        Keliling=phi*c*2;
        System.out.println("Keliling Lingkaran adalah : " + Keliling);
        return 0;
    }
}
