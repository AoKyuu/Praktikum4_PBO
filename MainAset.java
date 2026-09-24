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
