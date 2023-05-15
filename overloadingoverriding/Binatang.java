
package overloadingoverriding;

public class Binatang {
    String tinggal;
    
    public Binatang(String tinggal){
        this.tinggal=tinggal;
    }
    public void satu(){
        System.out.println("\nIni adalah klasifikasi binatang");
    }
    public static void main(String[] args){
        darat b = new darat("tanah & udara", "paru-paru/trakhea", "berjalan");
        laut c = new laut("air","insang/paru-paru","sirip","melahirkan/bertelur");
        sapi d = new sapi("darat","paru-paru","kaki","rumput");
        paus e = new paus("laut","paru-paru","sirip","ikan kecil","melahirkan");
        
        b.satu();
        System.out.println("\nbinatang di darat tinggal di : "+b.tinggal+
                "\nbernapas menggunakan : "+b.napas+
                "\nbergerak dengan cara : "+b.gerak);
        
        c.satu();
        System.out.println("\nbinatang di laut tinggal di : "+c.tinggal+
                "\nbernapas menggunakan : "+c.napas+
                "\nbergerak dengan cara : "+c.gerak+
                "\bBerkembang biak dengan cara : "+c.reproduksi);
        
        d.satu();
        System.out.println("\nbinatang sapi tinggal di : "+d.tinggal+
                "\nbernapas menggunakan : "+d.napas+
                "\nbergerak menggunakan : "+d.gerak+
                "\nmakanan : "+d.makan);
        
        e.satu();
        System.out.println("\nbinatang paus tinggal di : "+e.tinggal+
                "\nbernapas menggunakan : "+e.napas+
                "\nbergerak dengan cara : "+b.gerak+
                "\nmakanan : "+e.makan+
                "\ncberkebang biak dengan cara : "+e.reproduksi);
    }
    
}

class darat extends Binatang{
    String napas;
    String gerak;
    public darat(String tinggal, String napas, String gerak){
        super(tinggal);
        this.napas=napas;
        this.gerak=gerak;
    }
}

class laut extends Binatang{
    String napas;
    String gerak;
    String reproduksi;
    public laut(String tinggal, String napas, String gerak, String reproduksi){
        super(tinggal);
        this.napas=napas;
        this.gerak=gerak;
        this.reproduksi=reproduksi;
    }
}

class sapi extends darat{
    String makan;
    public sapi(String tinggal, String napas, String gerak, String makan){
        super(tinggal, napas, gerak);
        this.makan=makan;
    }
}

class paus extends laut{
    String makan;
    public paus(String tinggal, String napas, String gerak, String makan, String reproduksi){
        super(tinggal, napas, gerak, reproduksi);
        this.makan=makan;
    }
}