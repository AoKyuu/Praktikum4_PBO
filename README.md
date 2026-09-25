# Tugas Praktikum 4 - Pemrograman Berorientasi Objek
<p align="center">
  <img width="286" height="286" alt="image" src="https://github.com/user-attachments/assets/c2271d06-376d-46e9-ac2f-8856b022f5ec" /><br>
  <b>Nama: Azis Fauzi Ramadhan<br>
  NIM: L0325043</b>
</p>

## Penjelasan Kode
### AsetIT.java
```
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
