
package Array;

public class LimasSegiEmpat {
    //atribut
    public int sisi, tinggi;
    double volume;
    
    public LimasSegiEmpat(){
        this.sisi=4;
        this.tinggi=6;
    }
    
    public void computeAndSetVolume(){
        int calculateVol=(this.sisi*this.sisi*this.tinggi)*1/3;
        this.volume=calculateVol;
    }
    
    public double getVolume(){
        return volume;
    }
}
