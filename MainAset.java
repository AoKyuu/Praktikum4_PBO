package Praktikum4.Tugas;

public class MainAset {
    public static void main(String[] args) {
        ManajemenAset Manajemen = new ManajemenAset();
        
        Manajemen.tambahAset(new AsetIT("001","Server","Kebumen","Baik"));
        Manajemen.tambahAset(new AsetIT("002","Router","Ngawi  ","Rusak"));
        Manajemen.tambahAset(new AsetIT("003","Switch","Magetan","Rusak"));
        Manajemen.tambahAset(new AsetIT("004","PC    ","Pacitan","Baik"));
        
        System.out.println("Semua Aset");
        Manajemen.tampilkanSemuaAset();
        
        Manajemen.hapusAset("004");
        System.out.println("Hapus Aset ID 004");
        
        Manajemen.tampilkanSemuaAset();
        System.out.println("Semua Aset Setelah Update dan Delete");
        
    }
    
}
