
package MultipleConstructor;

public class LimasSegiEmpat {
    //atribut
    public int sisi, tinggi, volume;
    
    //constructor 1
    public LimasSegiEmpat(int s){
        this.sisi=s;
    } 
    
    //constructor 2
    public LimasSegiEmpat(int s, int t){
        this.sisi=s;
        this.tinggi=t;
    }
    
    public void computeAndSetVolume(){
        int calculateVol=(this.sisi*this.sisi*this.tinggi)*1/3;
        this.volume=calculateVol;
    }
    
    public int getVolume(){
        return volume;
    }
}
