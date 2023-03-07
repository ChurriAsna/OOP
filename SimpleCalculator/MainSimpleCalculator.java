package Tugas;

import java.util.Scanner;

public class MainSimpleCalculator {
    public static void main(String []args){
        MainSimpleCalculator object = new MainSimpleCalculator();
        object.menu();
    }
    
    public void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nKALKULATOR SEDERHANA");
        
        /*int n;
        System.out.print("Banyak elemen yang akan dimasukkan : ");
        n=input.nextInt();
        
        int array[] = new int [n];
        System.out.println("Masukkan nilai yang akan dihitung : " );
        
        //array[n] = input.nextInt();
        for (int i=0; i<n; i++){
            array[i]=input.nextInt();
        }*/
        
        System.out.println("OPERASI YANG DILAKUKAN\n\n"+
                            "\t1. PENJUMLAHAN\n"+
                            "\t2. PENGURANGAN\n"+
                            "\t3. PERKALIAN\n"+
                            "\t4. PEMBAGIAN\n" +
                            "\t5. RATA-RATA\n\n"+
                            "Masukkan pilihan anda : ");
        int pilih = input.nextInt();
        
        switch (pilih){
            case 1:{
                SimpleCalculator MainSimpleCalculator =new SimpleCalculator();
                MainSimpleCalculator.Penjumlahan();
                menu();
                break;
            }
            case 2:{
                SimpleCalculator MainSimpleCalculator =new SimpleCalculator();
                MainSimpleCalculator.Pengurangan();
                menu();
                break;
            }
            case 3:{
                SimpleCalculator MainSimpleCalculator =new SimpleCalculator();
                MainSimpleCalculator.Perkalian();
                menu();
                break;
            }
            case 4:{
                SimpleCalculator MainSimpleCalculator =new SimpleCalculator();
                MainSimpleCalculator.Pembagian();
                menu();
                break;
            }
            case 5:{
                SimpleCalculator MainSimpleCalculator =new SimpleCalculator();
                MainSimpleCalculator.RataRata();
                menu();
                break;
            }
        }
    }
}