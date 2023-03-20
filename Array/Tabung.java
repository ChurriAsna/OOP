
package Array;

public class Tabung {
    //atribut
    public int radius, tinggi;
    double phi=3.14, volume;
    
    public Tabung(){
        this.radius=5;
        this.tinggi=8;
    }
    
    public void computeAndSetVolume(){
        double calculateVol=this.phi*this.radius*this.radius*this.tinggi;
        this.volume=calculateVol;
    }
    public double getVolume(){
        return this.volume;
    }
}
