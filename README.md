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
