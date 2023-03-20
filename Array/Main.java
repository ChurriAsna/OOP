
package Array;

public class Main {
    public static void main(String[] args){
        double [] volume = new double [5];
        
        Kubus a = new Kubus();
        Balok b = new Balok();
        Tabung c = new Tabung();
        LimasSegiEmpat d = new LimasSegiEmpat();
        Bola e = new Bola();
        
        for (int i = 0; i < volume.length; i++){
        switch(i){
            case 0: 
                volume[0]= a.getVolume();
                break;
            case 1:
                volume[1]=b.getVolume();
                break;
            case 2:
                volume[2]=c.getVolume();
                break;
            case 3:
                volume[3]=d.getVolume();
                break;
            case 4:
                volume[4]=e.getVolume();
                break;
        }
        }  
        
        double total = a.getVolume() + b.getVolume() + c.getVolume() + d.getVolume() + e.getVolume();
        double rata_rata = total/volume.length;
        System.out.println("Rata- rata: "+ rata_rata);
    }
}
