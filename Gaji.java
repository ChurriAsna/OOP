package Latihan;

import java.util.Scanner;

public class Gaji {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String nama, alamat;
        int pengalaman, skill, departmen;
        int PengGaji=0, SkillGaji=0, DepGaji=0;
        int FullGaji;
        
        System.out.println("Perhitungan Gaji Pegawai");
        System.out.print("Nama    : ");
        nama = input.next();
        
        System.out.print("Alamat    : ");
        alamat = input.next();
        
        System.err.println("1. Pemula");
        System.err.println("2. Menengah");
        System.err.println("3. Expert");
        System.out.print("Pilih Pengalaman  : ");
        pengalaman = input.nextInt();

        System.err.println("1. Web");
        System.err.println("2. Mobile");
        System.err.println("3. Desktop");
        System.out.print("Pilih Skill   : ");
        skill = input.nextInt();

        System.err.println("1. IT");
        System.err.println("2. HRD");
        System.err.println("3. Finance");
        System.out.print("Departmen : ");
        departmen = input.nextInt();
        
        switch(pengalaman){
            case 1 :
                PengGaji = 500000;
                break;
            case 2:
                PengGaji = 1000000;
                break;
            case 3:
                PengGaji = 2000000;
                break;
            default:
                System.out.println("Kesalahan");
        }
        switch(skill){
            case 1:
                SkillGaji = 1000000;
                break;
            case 2:
                SkillGaji = 2000000;
                break;
            case 3:
                SkillGaji = 3000000;
                break;
            default:
                System.out.println("Kesalahan");
        }
        switch(departmen){
            case 1:
                DepGaji = 8000000;
                break;
            case 2:
                DepGaji = 5000000;
                break;
            case 3:
                DepGaji = 4000000;
                break;
            default:
                System.out.println("Kesalahan");
        }
        FullGaji=(PengGaji + SkillGaji + DepGaji);
        
        System.out.println("\n===================================");
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Gaji berdasar pengalaman: "+PengGaji);
        System.out.println("Gaji berdasar skill: "+SkillGaji);
        System.out.println("Gaji berdasar departmen: "+DepGaji);
        System.out.println("Gaji karyawan: "+FullGaji);
    }
}
