
package bushalte;

public class Halte {
    int jalurBus, naik, turun ;
    String namaHalte;
    
    Halte(int jalurBus, int naik, int turun, String namaHalte) {
        this.jalurBus = jalurBus; 
        this.naik = naik;
        this.turun = turun;
        this.namaHalte = namaHalte;
    }
}
