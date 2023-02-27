package Tugas;
/**
 *
 * @author MyBook14G
 */
import java.util.Scanner;
public class Main {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        //char lagi ='y';
        Main object = new Main();
        object.menu();
        
    }
    public void menu(){
        System.out.println("\n--------------------------------\n");
        System.out.println("PROGRAM HITUNG BANGUN DATAR");
        System.out.print(" 1. Luas Persegi \n " +
                        "2. Persegi Panjang \n " +
                        "3. Lingkaran \n " +
                        "4. Elips \n " +
                        "0. Keluar \n " +
                        "Masukkan pilihan anda : "); 
        int pilih = input.nextInt();
        
        switch(pilih){
            case 1: {
                Persegi input=new Persegi();
                input.HitungLuas();
                input.HitungKeliling();
                menu();
                break;
            }
            case 2: {
                PersegiPanjang input=new PersegiPanjang();
                input.HitungLuas();
                input.HitungKeliling();
                menu();
                break;
            }
            case 3: {
                Lingkaran input=new Lingkaran();
                input.HitungLuas();
                input.HitungKeliling();
                menu();
                break;
            }
            case 4: {
                Elips input=new Elips();
                input.HitungLuas();
                input.HitungKeliling();
                menu();
                break;
            }
            case 0: {
                System.exit(0);
            }
            default : {
                System.err.println("Terjadi kesalahan"); System.exit(0);
            }
        }
    }
}
