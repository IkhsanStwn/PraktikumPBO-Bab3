package Kendaraan.Tugas;

public class Pesawat extends Kendaraan{

    public Pesawat(String nama, int bobot, int kapasitasPenumpang, int harga) {
        super(nama, bobot, kapasitasPenumpang, harga);
    }

    void terbang(){
        System.out.println( nama + " Bisa Terbang");
    }

    @Override
    void berjalan(){
        System.out.println("pesawat " + nama + "berjalan di landasan pacu");
    }

    @Override
    void berhenti(){
        System.out.println("pesawat " + nama + "berhenti di bandara");
    }
}
