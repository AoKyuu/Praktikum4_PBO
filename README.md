# Tugas Praktikum 4 - Pemrograman Berorientasi Objek
<p align="center">
  <img width="286" height="286" alt="image" src="https://github.com/user-attachments/assets/c2271d06-376d-46e9-ac2f-8856b022f5ec" /><br>
  <b>Nama: Azis Fauzi Ramadhan<br>
  NIM: L0325043</b>
</p>

## Penjelasan Kode
### AsetIT.java
```java
package Praktikum4.Tugas;

public class AsetIT {
    String IdAset;
    String NamaPerangkat;
    String Lokasi;
    String StatusKondisi;
    
    public AsetIT (String IdAset, String NamaPerangkat, String Lokasi, String StatusKondisi) {
        this.IdAset = IdAset;
        this.NamaPerangkat = NamaPerangkat;
        this.Lokasi = Lokasi;
        this.StatusKondisi = StatusKondisi;
    }
    
    public void TampilkanInfoAset() {
        System.out.println(IdAset + "    " + NamaPerangkat + "             " + Lokasi + "     " + StatusKondisi);
    }
}
```
Class `AsetIT` merupakan class yang digunakan sebagai rancangan untuk membuat object yang merepresentasikan sebuah aset IT. `Class` ini memiliki empat atribut, yaitu `IdAset` untuk menyimpan ID aset, `NamaPerangkat` untuk menyimpan nama perangkat, `Lokasi` untuk menyimpan lokasi aset, dan `StatusKondisi` untuk menyimpan kondisi aset. Keempat atribut tersebut bertipe `String` dan digunakan untuk menyimpan informasi dari setiap aset yang dibuat.

Constructor `AsetIT` merupakan constructor parameterized yang memiliki empat parameter dengan nama yang sama seperti atribut class. Parameter tersebut digunakan untuk memberikan nilai awal pada atribut ketika object `AsetIT` dibuat. Kata kunci `this` digunakan untuk membedakan atribut milik object dengan parameter constructor, seperti pada `this.IdAset = IdAset`, yang berarti nilai parameter `IdAset` dimasukkan ke atribut `IdAset` milik object. Dengan constructor tersebut, object dapat langsung memiliki data aset ketika dibuat.

Method `TampilkanInfoAset()` digunakan untuk menampilkan informasi aset ke layar. Method ini mengakses keempat atribut yang telah dimiliki object, kemudian menggabungkannya menggunakan operator `+` dan menampilkannya dengan `System.out.println()`. Dengan demikian, class `AsetIT` berfungsi sebagai rancangan object yang menyimpan data aset IT sekaligus menyediakan method untuk menampilkan informasi dari aset tersebut.

### ManajemenAset.java
```java
package Praktikum4.Tugas;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ManajemenAset {
    List<AsetIT> daftarAset = new ArrayList<>();
        
    public void tambahAset(AsetIT asetbaru){
        daftarAset.add(asetbaru);
    }
        
    public void tampilkanSemuaAset() {
        for (AsetIT AIT : daftarAset) {
            AIT.TampilkanInfoAset();
        }
    }
    
    public void hapusAset(String IdAset) {
        Iterator<AsetIT> Iterator = daftarAset.iterator();
        
        while (Iterator.hasNext()) {
            AsetIT AIT = Iterator.next();
            
            if (AIT.IdAset.equals(IdAset)) {
                Iterator.remove();
                System.out.println("Aset dengan ID: " + IdAset + " " + "telah dihapus");
                return;
            }
        }
        
        System.out.println("ID aset " + IdAset + " " + "tidak ditemukan");
    }
}
```
Class `ManajemenAset` digunakan untuk mengelola kumpulan object `AsetIT`. Pada bagian awal terdapat `import java.util.ArrayList`, `import java.util.List`, dan `import java.util.Iterator` yang digunakan untuk menyediakan fitur `ArrayList`, `List`, dan `Iterator`. Kemudian `List<AsetIT> daftarAset = new ArrayList<>()`; digunakan untuk membuat sebuah list bernama `daftarAset` yang dapat menyimpan object bertipe `AsetIT`. Dengan demikian, satu `daftarAset` dapat menampung beberapa data aset.

Method `tambahAset(AsetIT asetbaru)` digunakan untuk menambahkan object `AsetIT` ke dalam `daftarAset`. Parameter `asetbaru` digunakan untuk menerima object aset yang dikirim ketika method dipanggil. Object tersebut kemudian dimasukkan ke dalam list menggunakan `daftarAset.add(asetbaru)`. Jadi, method ini berfungsi sebagai proses penambahan data aset ke dalam daftar.

Method `tampilkanSemuaAset()` digunakan untuk menampilkan seluruh aset yang tersimpan dalam `daftarAset`. Proses tersebut menggunakan _for-each_ dengan `AIT` sebagai variabel yang mewakili setiap object `AsetIT` yang terdapat di dalam list. Pada setiap perulangan, `AIT.TampilkanInfoAset()` dipanggil untuk menampilkan informasi dari aset tersebut. Dengan cara ini, seluruh object yang ada di dalam `daftarAset` dapat ditampilkan satu per satu.

Method `hapusAset(String IdAset)` digunakan untuk menghapus aset berdasarkan ID yang diberikan melalui parameter `IdAset`. Di dalamnya dibuat object `Iterator<AsetIT>` yang mengambil iterator dari `daftarAset`. Perulangan `while (Iterator.hasNext())` digunakan untuk memeriksa setiap object yang masih tersedia dalam list, kemudian `Iterator.next()` mengambil object berikutnya dan menyimpannya ke variabel `AIT`. Selanjutnya, `AIT.IdAset.equals(IdAset)` digunakan untuk membandingkan ID aset yang sedang diperiksa dengan ID yang diberikan kepada method. Jika ID sesuai, `Iterator.remove()` digunakan untuk menghapus aset tersebut dari list, kemudian program menampilkan pesan bahwa aset telah dihapus dan `return` menghentikan method. Jika seluruh data telah diperiksa tetapi tidak ada ID yang sesuai, program menjalankan `System.out.println()` terakhir untuk menampilkan pesan bahwa ID aset tidak ditemukan.

### MainAset.java
```java
package Praktikum4.Tugas;

public class MainAset {
    public static void main(String[] args) {
        ManajemenAset Manajemen = new ManajemenAset();
        
        Manajemen.tambahAset(new AsetIT("001","Server","Lab Komputer","Baik"));
        Manajemen.tambahAset(new AsetIT("002","Router","Ruang 17    ","Rusak"));
        Manajemen.tambahAset(new AsetIT("003","Switch","Perpustakaan","Rusak"));
        Manajemen.tambahAset(new AsetIT("004","PC    ","Lab Komputer","Baik"));
        
        System.out.println("Semua Aset");
        Manajemen.tampilkanSemuaAset();
        
        System.out.println("Hapus Aset ID");
        Manajemen.hapusAset("004");        
        
        System.out.println("\nSemua Aset Setelah Update dan Delete");
        Manajemen.tampilkanSemuaAset();
                
    }
    
}
```

### Output Program

### Penjelasan Output
