
package Array;

public class Balok {
    //atribut
    public int panjang, lebar, tinggi;
    double volume;

    public Balok(){
        this.panjang=3;
        this.lebar=4;
        this.tinggi=2;
    }
    
    //method
    public void computeAndSetVolume(){
        //hitung volume
        int calculateVol=this.panjang*this.lebar*this.tinggi;
        this.volume=calculateVol;
    }
    public double getVolume(){
        computeAndSetVolume();
        return this.volume;
    }
}
