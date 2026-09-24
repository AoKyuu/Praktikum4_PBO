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