
package MultipleConstructor;

public class Main {
    public static void main(String[]args){
    
    //KUBUS
    Kubus Kubus1=new Kubus(5); //memanggil constructor 2 pada line 13-15 clas Kubus karena memiliki parameter "s"
    Kubus Kubus2=new Kubus(); //memanggil constructor 1 pada line 9-11 clas Kubus karena tidak memiliki parameter
    Kubus1.computeAndSetVolume();
    Kubus2.computeAndSetVolume();
    
    System.out.println("\t\t\nKUBUS\n");
    System.out.println("Volume kubus dengan sisi "+Kubus1.sisi+" adalah " +Kubus1.getVolume());
    System.out.println("Volume kubus dengan sisi "+Kubus2.sisi+" adalah " +Kubus2.getVolume());
    
    //BALOK
    Balok Balok1=new Balok(3);
    Balok Balok2=new Balok(3, 4);
    Balok Balok3=new Balok(3, 4, 2);
    Balok1.computeAndSetVolume();
    Balok2.computeAndSetVolume();
    Balok3.computeAndSetVolume();
    
    System.out.println("\t\t\nBALOK\n");
    System.out.println("Volume balok dengan panjang "+Balok1.panjang+" lebar "+Balok1.lebar+" tinggi "+Balok1.tinggi+" adalah " +Balok1.getVolume());
    System.out.println("Volume balok dengan panjang "+Balok2.panjang+" lebar "+Balok2.lebar+" tinggi "+Balok2.tinggi+" adalah " +Balok2.getVolume());
    System.out.println("Volume balok dengan panjang "+Balok3.panjang+" lebar "+Balok3.lebar+" tinggi "+Balok3.tinggi+" adalah " +Balok3.getVolume());
    
    //TABUNG
    Tabung Tabung1=new Tabung(5);
    Tabung Tabung2=new Tabung(5, 8);
    Tabung1.computeAndSetVolume();
    Tabung2.computeAndSetVolume();
    
    System.out.println("\t\t\nTABUNG\n");
    System.out.println("Volume tabung dengan radius "+Tabung1.radius+ " tinggi " +Tabung1.tinggi+ " adalah " +Tabung1.getVolume());
    System.out.println("Volume tabung dengan radius "+Tabung2.radius+ " tinggi " +Tabung2.tinggi+ " adalah " +Tabung2.getVolume());
    
    //LIMAS SEGI EMPAT
    LimasSegiEmpat LimasSegiEmpat1=new LimasSegiEmpat(4);
    LimasSegiEmpat LimasSegiEmpat2=new LimasSegiEmpat(4, 6);
    LimasSegiEmpat1.computeAndSetVolume();
    LimasSegiEmpat2.computeAndSetVolume();
    
    System.out.println("\t\t\nLIMAS SEGI EMPAT\n");
    System.out.println("Volume limas segi empat dengan sisi "+LimasSegiEmpat1.sisi+" tinggi "+LimasSegiEmpat1.tinggi+" adalah " +LimasSegiEmpat1.getVolume());
    System.out.println("Volume limas segi empat dengan sisi "+LimasSegiEmpat2.sisi+" tinggi "+LimasSegiEmpat2.tinggi+" adalah " +LimasSegiEmpat2.getVolume());
    
    //BOLA
    Bola Bola1=new Bola();
    Bola Bola2=new Bola(6);
    Bola1.computeAndSetVolume();
    Bola2.computeAndSetVolume();
    
    System.out.println("\t\t\nBOLA\n");
        System.out.println("Volume bola dengan radius "+Bola1.radius+ " adalah " +Bola1.getVolume());
        System.out.println("Volume bola dengan radius "+Bola2.radius+ " adalah " +Bola2.getVolume());
    }
}
