package Kendaraan.Tugas;

public abstract class Kendaraan {
    String nama;
    int bobot;
    int KapasitasPenumpang;
    int harga;

    public Kendaraan(String nama, int bobot, int kapasitasPenumpang, int harga) {
        this.nama = nama;
        this.bobot = bobot;
        this.KapasitasPenumpang = kapasitasPenumpang;
        this.harga = harga;
    }

    abstract void berhenti();

    abstract void berjalan();

    void membawa(){
        System.out.println( nama + " membawa " + KapasitasPenumpang + " penumpang");
    }

    void terbang() {
        System.out.println("tidak semua kendaraan bisa terbang");
    }

    int dijual(){
        System.out.println("kendaraan ini dijual");
        return 0;
    }

    int dijual(int pajak){
        System.out.println("penjualan kendaraan dikenai pajak");
        return 0;
    }


}
