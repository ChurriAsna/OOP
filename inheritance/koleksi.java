
package inheritance;

public class koleksi {
    String judul, penerbit;
    int tahun;
    
    public koleksi(String judul, String penerbit, int tahun){
        this.judul=judul;
        this.penerbit=penerbit;
        this.tahun=tahun;
    }
    public static void main(String[] args){
        koleksi a=new koleksi("novel", "tere liye",2017);
        System.out.println("------------- KOLEKSI -------------");
        System.out.println("\nJudul : "+a.judul+"\nPenerbit : "+a.penerbit+"\nTahun terbit : "+a.tahun);
        
        System.out.println("\n------------- BUKU -------------");
        buku b=new buku("Bumi","Tere Liye", "Gramedia", 2017);
        System.out.println("\nJudul : "+b.judul+"\nPenulis : "+b.penulis+"\nPenerbit : "+b.penerbit+"\nTahun terbit : "+b.tahun);
        
        System.out.println("\n------------- MAJALAH -------------");
        majalah c=new majalah("NewsWeek", "2", "Joana", 2014);
        System.out.println("\nJudul : "+c.judul+"\nEdisi : "+c.edisi+"\nPenerbit : "+c.penerbit+"\nTahun terbit : "+c.tahun);
        
        System.out.println("\n------------- SKRIPSI -------------");
        skripsi d=new skripsi("21081010001", "Dewantara", "Basis data", "Pustaka", 2014);
        System.out.println("\nNPM : "+d.NPM+"\nPenulis : "+d.penulis+"\nJudul : "+d.judul+"\nPenerbit : "+d.penerbit+"\nTahun terbit : "+d.tahun);
    }
}

class buku extends koleksi{
    String penulis;
    public buku (String judul, String penulis, String penerbit, int tahun){
        super (judul, penerbit, tahun);
        this.penulis=penulis;
    }
}

class majalah extends koleksi{
    String edisi;
    public majalah (String judul, String edisi, String penerbit, int tahun){
        super (judul, penerbit, tahun);
        this.edisi=edisi;
    }
}

class skripsi extends buku{
    String NPM;
    public skripsi (String NPM, String penulis, String judul, String penerbit, int tahun){
        super (judul,penulis, penerbit, tahun);
        this.NPM=NPM;
    }
}