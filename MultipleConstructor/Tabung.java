
package MultipleConstructor;

public class Tabung {
    //atribut
    public int radius, tinggi;
    double phi=3.14, volume;

    //constructor 1
    public Tabung(int r){
        //this.phi=ph;
        this.radius=r;
    }
    
    //constructor 2
    public Tabung(int r, int t){
        this.radius=r;
        this.tinggi=t;
    }
    
    public void computeAndSetVolume(){
        double calculateVol=this.phi*this.radius*this.radius*this.tinggi;
        this.volume=calculateVol;
    }
    public double getVolume(){
        return this.volume;
    }
}
