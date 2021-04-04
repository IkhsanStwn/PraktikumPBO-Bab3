package Kendaraan.Tugas;

public class verifikasiKendaraan {
    private String namaPemilik;
    private String nomorRangka;

    public verifikasiKendaraan(String namaPemilik, String nomorRangka) {
        this.namaPemilik = namaPemilik;
        this.nomorRangka = nomorRangka;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void setNomorRangka(String nomorRangka) {
        this.nomorRangka = nomorRangka;
    }

    boolean verifikasi(String namaPemilik, String nomorRangka){
        if (this.namaPemilik.equals(namaPemilik) && this.nomorRangka.equals(nomorRangka)){
            return true;
        }
        else {
            return false;
        }
    }
}
