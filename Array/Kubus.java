
package Array;

public class Kubus {
    //atribut
    public int sisi;
    double volume;
    
    public Kubus(){
        this.sisi=5;
    }

    public void computeAndSetVolume(){
        //hitung volume
        int calculateVol=this.sisi*this.sisi*this.sisi;
        this.volume=calculateVol;
    }
    public double getVolume(){
        computeAndSetVolume();
        return this.volume;
    }
}
