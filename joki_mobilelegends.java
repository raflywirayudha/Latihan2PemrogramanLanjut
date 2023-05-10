/*Program yang saya buat adalah program joki classic mobile legends (game online). 
Joki classic mobile legends ini adalah sistem yang dimana seorang penjoki memainkan
akun klien untuk mendapatkan kemenangan sesuai keinginan klien dan penjoki tersebut
mendapat imbalan uang.*/

package tugaspl2;

/*Dalam kelas tersebut saya memberi nama class yaitu joki_mobilelegends, 
saya membuat 6 variabel dgn tipe data string yang terdiri dari nickname, email, password, noTelp1, namaPenjoki, noTelp2.
Dan 1 variabel dengan tipe data integer yaitu jumlahMenang.*/

class joki_mobilelegends {
    
    String nickname;
    String email;
    String password;
    String noTelp1;
    int jumlahMenang;
    String namaPenjoki;
    String noTelp2;
    
/*Kemudian saya membuat 2 konstruktor yang terdiri dari konstruktor tanpa parameter yang berisi
nama usaha joki uang saya buat. Dan konstruktor dengan parameter yang menginisialisasikan variabel 
variabel yang sudah saya buat.
*/
    
    joki_mobilelegends(){
        System.out.println("=================== @jokiclassicml.id ===================");
    }
    
    joki_mobilelegends(String nickname, String email, String password, String noTelp1, int jumlahMenang, String namaPenjoki, String noTelp2){
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.noTelp1 = noTelp1;
        this.jumlahMenang = jumlahMenang;
        this.namaPenjoki = namaPenjoki;
        this.noTelp2 = noTelp2;
        
    }
    
/*Selanjutnya saya membuat 3 method yang terdiri dari 2 method void yaitu method untuk dataKlien
untuk menampilkan nickname, email,  password, nomor telepon, juga jumlah menang yg diinginkan oleh klien.
Kemudian dataPenjoki untuk menampilan nama dan nomor telepon dari penjoki. Selanjutnya ada method non 
void yaitu int hitungHarga yang bertujuan untuk menghitung harga jasa joki dengan rumus 5000 dikali dengan 
jumlah menang.*/
    
    void dataKlien(){
        System.out.println("Nickname                      : " + this.nickname);
        System.out.println("Email                         : " + this.email);
        System.out.println("Password                      : " + this.password);
        System.out.println("Nomor Telepon Klien           : " + this.noTelp1);
        System.out.println("Jumlah Menang                 : " + this.jumlahMenang);
    }
    
    void dataPenjoki(){
        System.out.println("Dijoki oleh                   : " + this.namaPenjoki);
        System.out.println("Nomor Telepon Penjoki         : " + this.noTelp2);
    }
    
    int hitungHarga(){
       int totalHarga = 5000 * jumlahMenang;
       return totalHarga;

    }
    
    
    
    
}
    
    


