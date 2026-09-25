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
