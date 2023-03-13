
package MultipleConstructor;

public class Bola {
    //atribut
    public int radius;
    public double volume, phi=3.14;
    
    //constructor 1
    public Bola(){
    }
    
    //constructor 2
    public Bola(int r){
        this.radius=r;
    }
    
    public void computeAndSetVolume(){
        double calculateVol=(this.phi*this.radius*this.radius*this.radius)*4/3;
        this.volume=calculateVol;
    }
    
    public double getVolume(){
        return volume;
    }
}
