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
Class `MainAset` digunakan sebagai class utama untuk menjalankan program pengelolaan aset. Di dalam method `main()`, dibuat object `ManajemenAset` melalui `ManajemenAset Manajemen = new ManajemenAset();`. Object tersebut digunakan untuk mengakses method yang terdapat pada class `ManajemenAset`, seperti menambahkan, menampilkan, dan menghapus aset.

Selanjutnya, empat object `AsetIT` dibuat menggunakan constructor parameterized dan langsung dikirimkan sebagai parameter ke method `tambahAset()`. Setiap object memiliki ID, nama perangkat, lokasi, dan status kondisi yang berbeda. Data tersebut kemudian dimasukkan ke dalam `daftarAset` melalui method `tambahAset()`. Setelah seluruh aset ditambahkan, `System.out.println("Semua Aset");` digunakan untuk memberikan keterangan pada output, kemudian `Manajemen.tampilkanSemuaAset();` dipanggil untuk menampilkan seluruh aset yang tersimpan.
### Output Program
<img width="461" height="320" alt="Screenshot 2026-09-26 060629" src="https://github.com/user-attachments/assets/0d7822e5-0583-4128-8c56-8467532d6619" />

### Penjelasan Output
Output tersebut menunjukkan hasil eksekusi program dari proses penambahan, penampilan, dan penghapusan data aset IT. Pada bagian awal dengan keterangan “Semua Aset”, ditampilkan empat object `AsetIT` yang sebelumnya telah ditambahkan melalui method `tambahAset()`. Data tersebut terdiri dari ID `001` dengan perangkat Server yang berada di Lab Komputer dan memiliki kondisi Baik, ID `002` dengan perangkat Router yang berada di Ruang 17 dan memiliki kondisi Rusak, ID `003` dengan perangkat Switch yang berada di Perpustakaan dan memiliki kondisi Rusak, serta ID `004` dengan perangkat PC yang berada di Lab Komputer dan memiliki kondisi Baik.

Selanjutnya, program menampilkan keterangan “Hapus Aset ID” dan menjalankan method `hapusAset("004")`. Method tersebut mencari aset dengan ID `004` menggunakan `Iterator`. Karena aset dengan ID tersebut ditemukan, aset kemudian dihapus dari `daftarAset`. Output “Aset dengan ID: 004 telah dihapus” menunjukkan bahwa proses penghapusan berhasil dilakukan.

Setelah proses penghapusan selesai, program menampilkan kembali seluruh data dengan keterangan “Semua Aset Setelah Update dan Delete”. Pada bagian ini hanya terdapat tiga aset, yaitu ID `001`, `002`, dan `003`. Data dengan ID `004` sudah tidak ditampilkan karena telah berhasil dihapus dari `daftarAset`. Hal tersebut menunjukkan bahwa operasi penghapusan berdasarkan ID telah berjalan sesuai dengan proses yang dibuat pada program.
