package Kendaraan.Tugas;

public class Mobil extends Kendaraan{

    public Mobil(String nama, int bobot, int kapasitasPenumpang, int harga) {
        super(nama, bobot, kapasitasPenumpang, harga);
    }

    @Override
    void berjalan(){
        System.out.println("mobil " + nama + " berjalan di jalan raya");
    }

    @Override
    void berhenti(){
        System.out.println("mobil " + nama + " berhenti di pinggir jalan");
    }

    //overload
    int dijual(){
        return harga;
    }

    int dijual(int pajak){
        return harga + (harga*pajak/100);
    }
}
