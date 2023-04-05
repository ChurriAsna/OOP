
package bushalte;

import java.util.List;
import java.util.ArrayList;

public class Tampil {
    int kapasitas=20, penumpang=0;
    List<Halte> listHalte=new ArrayList<>();
    
    void tambahJalur(int jalurBus, int naik,int turun, String namaHalte){
        Halte jalur=new Halte(jalurBus, naik, turun, namaHalte);
        listHalte.add(jalur);
    }
    void tampil(){
        for (Halte jalur:listHalte){
        
        switch (jalur.jalurBus){
            case 1:
                System.out.println("\nHalte "+jalur.namaHalte+ " : 0 penumpang menunggu");
                break;
            case 2:
                System.out.println("\nHalte "+jalur.namaHalte+ " : "+jalur.naik+" penumpang menunggu");
                break;
            case 3:
                System.out.println("\nHalte "+jalur.namaHalte+ " : "+jalur.naik+" penumpang menunggu");
                break;
            case 4:
                System.out.println("\nHalte "+jalur.namaHalte+ " : "+jalur.naik+" penumpang menunggu");
                break;
        }
        
        int naik = Math.min(jalur.naik, kapasitas - penumpang);
        int turun = Math.min(jalur.turun, penumpang);
        penumpang+=naik;
        System.out.println(naik + " penumpang naik");
        
        if(penumpang>=kapasitas){
            int tunggu=jalur.naik-naik;
            
            if(tunggu>0){
                System.out.println(tunggu+ " penumpang menunggu");
            }
        }
        
        System.out.println("Banyak penumpang dalam bus "+penumpang);
        
        switch(jalur.jalurBus){
            case 1:
                System.out.println("Halte "+jalur.namaHalte+" 0 penumpang menunggu");
                break;
            case 2:
                int awal=jalur.naik;
                int akhir=jalur.naik;
                System.out.println("Halte "+jalur.namaHalte+" : "+(awal - akhir)+" penumpang menunggu");
                break;
            case 3:
                awal=jalur.naik;
                akhir=jalur.naik;
                System.out.println("Halte "+jalur.namaHalte+" : "+(awal - akhir)+" penumpang menunggu");
                break;
            case 4:
                awal=jalur.naik;
                akhir=jalur.naik;
                System.out.println("Halte "+jalur.namaHalte+" : "+(awal - akhir)+" penumpang menunggu");
                break;
        }
        }
    }
}
