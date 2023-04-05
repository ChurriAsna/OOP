
package bushalte;

public class Main {
    
    public static void main(String[] args) {
        Tampil bus = new Tampil();
        
        bus.tambahJalur(1,5, 0, "KANTOR");
        bus.tambahJalur(2,2, 0, "PORONG");
        bus.tambahJalur(3, 5, 0, "SURABAYA");
        bus.tambahJalur(4, 2, 0, "GRESIK");
        
        bus.tampil();
    }
    
}
