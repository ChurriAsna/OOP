
package MultipleConstructor;

public class Balok {
    //atribut
    public int panjang, lebar, tinggi, volume;
    
    //constructor 1
    public Balok(int p){
        this.panjang=p;
    }
    
    //constructor 2
    public Balok(int p, int l){
        this.panjang=p;
        this.lebar=l;
    }
    
    //constructor 3
    public Balok(int p, int l, int t){
        this.panjang=p;
        this.lebar=l;
        this.tinggi=t;
    }
    
    //method
    public void computeAndSetVolume(){
        //hitung volume
        int calculateVol=this.panjang*this.lebar*this.tinggi;
        this.volume=calculateVol;
    }
    public int getVolume(){
        return this.volume;
    }
}
