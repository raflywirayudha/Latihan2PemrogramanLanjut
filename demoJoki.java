package tugaspl2;

/*Saya membuat kelas dengan nama "demoJoki" untuk menjalankan program tersebut. 
Di class tersebut saya memasukkan masing masing 3 data dari klien dan penjoki. 
Pertama diawali dengan mewujudkan construktor tanpa parameter yang saya buat sebelumnya.
Lalu diikuti dengan mewujudkan method dataKlien, dataPenjoki, dan hitungHarga.*/

public class demoJoki {
    public static void main(String[] args) {
        new joki_mobilelegends();
        joki_mobilelegends klien1 = new joki_mobilelegends("Ninja", "ninjaganz@gmail.com", "ninja112", "081234232133", 10, "Iqbal", "081376332957");
        klien1.dataKlien();
        klien1.dataPenjoki();
        int totalHarga1 = klien1.hitungHarga();
        System.out.println("\tTotal Harga adalah Rp." + totalHarga1 + " (10 kali menang)\n" );
        
        joki_mobilelegends klien2 = new joki_mobilelegends("RiverFlows", "raply17@gmail.com", "Rplyzz346", "081252351762", 25, "Sigit Rendang", "082355489912");
        klien2.dataKlien();
        klien2.dataPenjoki();
        int totalHarga2 = klien2.hitungHarga();
        System.out.println("\tTotal Harga adalah Rp." + totalHarga2 + " (25 kali menang)\n" );
        
        joki_mobilelegends klien3 = new joki_mobilelegends("The Killer", "yosua4@gmail.com", "yosuamahardika99", "085273241164", 7, "Rehan Wangsaf", "085367781342");
        klien3.dataKlien();
        klien3.dataPenjoki();
        int totalHarga3 = klien3.hitungHarga();
        System.out.println("\tTotal Harga adalah Rp." + totalHarga3 + " (7 kali menang)\n" );
        
    
    
    
    
    
    }
    

}
