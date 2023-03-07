package Tugas;

import java.util.Scanner;

/**
 *
 * @author MyBook14G
 */
public class SimpleCalculator {
    public int n, jumlah=0, rerata=0, kurang=0, kali=0, bagi=0;
    
    public int Penjumlahan(){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Banyak elemen yang akan dimasukkan : ");
        n=input.nextInt();
        
        int array[] = new int [n];
        System.out.println("Masukkan nilai yang akan dihitung : " );
        
        for (int i=0; i<n; i++){
            array[i]=input.nextInt();
            
            jumlah=jumlah+array[i];
            //jumlah +=array[i]; (Bentuk lain dari rumus penjumlahan)
        }
        System.out.println("Hasil dari elemen yang telah dimasukkan : " + jumlah);
        return 1;
    }
    
    public int Pengurangan(){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Banyak elemen yang akan dimasukkan : ");
        n=input.nextInt();

        int array[] = new int [n];
        System.out.println("Masukkan nilai yang akan dihitung : " );
        
        for (int i=0; i<n; i++){
            array[i]=input.nextInt();
        
        if(i==0)
                kurang=array[i];
            else
                kurang = kurang - array[i];
                //kurang -= array[i]; (Bentuk lain dari rumus pengurangan)
    }
        System.out.println("Hasil dari elemen yang telah dimasukkan : " + kurang);
        return 0;
    }
      
    public int Perkalian(){
        Scanner input = new Scanner (System.in);

        System.out.print("Banyak elemen yang akan dimasukkan : ");
        n=input.nextInt();

        int array[] = new int [n];
        System.out.println("Masukkan nilai yang akan dihitung : " );
        
        for (int i=0; i<n; i++){
            array[i]=input.nextInt();
            
        if(i==0)
                kali=array[i];
            else
                kali=kali*array[i];
                //kali*=array[i]; (Bentuk lain dari rumus perkalian)
        }
        System.out.println("Hasil dari elemen yang telah dimasukkan : " + kali);
        return 0;
    }
    
    public int Pembagian(){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Banyak elemen yang akan dimasukkan : ");
        n=input.nextInt();

        int array[] = new int [n];
        System.out.println("Masukkan nilai yang akan dihitung : " );
        
        for (int i=0; i<n; i++){
            array[i]=input.nextInt();
        
        if(i==0)
                bagi=array[i];
            else
                bagi=bagi/array[i];
        }
        System.out.println("Hasil dari elemen yang telah dimasukkan : " + bagi);
        return 0;
    }
    
    public int RataRata(){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Banyak elemen yang akan dimasukkan : ");
        n=input.nextInt();

        int array[] = new int [n];
        System.out.println("Masukkan nilai yang akan dihitung : " );
        
        for (int i=0; i<n; i++){
            array[i]=input.nextInt();
            rerata=jumlah/n;
        }
        System.out.println("Hasil dari elemen yang telah dimasukkan : " + rerata);
        return 0;
    }
}
