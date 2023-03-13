
package MultipleConstructor;

public class Kubus {
    //atribut
    public int sisi, volume;
    
    //constructor 1 tanpa paramater
    public Kubus(){
    }
    //constructor 2 dengan 1 parameter
    public Kubus(int s){
        this.sisi=s;
    }
    
    //method
//    public void setSisi(int s){
//        this.sisi=s;
//    }
    public void computeAndSetVolume(){
        //hitung volume
        int calculateVol=this.sisi*this.sisi*this.sisi;
        this.volume=calculateVol;
    }
    public int getVolume(){
        return this.volume;
    }
}
