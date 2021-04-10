package Kendaraan.Tugas;

import java.util.Scanner;
import java.util.InputMismatchException;

public class OOP {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        Kendaraan mobil = new Mobil("", 0, 0, 0);
        Kendaraan pesawat = new Pesawat("", 0, 0, 0);
        verifikasiKendaraan identitas = new verifikasiKendaraan("ikhsan", "123190111");

        int pilih = 0;
        String namaPemilik="", nomorRangka="";

        System.out.println("Tugas BAB 3");
        System.out.println("1. Mobil");
        System.out.println("2. Pesawat");
        System.out.println("3. Verifikasi Kendaraan");

        //error handling untuk pengecekan kesalahan inputan
        try {
            System.out.print("pilih : ");
            pilih = input.nextInt();
        } catch (InputMismatchException error){
            System.out.println("Errornya adalah " + error);
        }
        input.nextLine();

        switch (pilih) {
            case 1 -> {
                //error handling untuk pengecekan kesalahan inputan
                try {
                    System.out.println("--MOBIL--");
                    System.out.print("nama mobil = ");
                    mobil.nama = input.nextLine();
                    System.out.print("bobot mobil = ");
                    mobil.bobot = input.nextInt();
                    System.out.print("Kapasitas mobil = ");
                    mobil.KapasitasPenumpang = input.nextInt();
                    System.out.print("Harga : Rp  ");
                    mobil.harga = input.nextInt();
                } catch (Exception error ){
                    System.out.println("Errornya adalah " + error);
                }
                finally{
                    mobil.membawa();
                    mobil.berjalan();
                    mobil.berhenti();

                    System.out.println("harga dasar jual : Rp " + mobil.dijual());
                    System.out.println("harga jual setelah pajak : Rp " + mobil.dijual(10));
                }
            }
            case 2 -> {
                //error handling untuk pengecekan kesalahan inputan
                try {
                    System.out.println("--PESAWAT--");
                    System.out.print("nama pesawat = ");
                    pesawat.nama = input.nextLine();
                    System.out.print("bobot pesawat = ");
                    pesawat.bobot = input.nextInt();
                    System.out.print("Kapasitas pesawat = ");
                    pesawat.KapasitasPenumpang = input.nextInt();
                    System.out.print("Harga : Rp  ");
                    pesawat.harga = input.nextInt();
                } catch (Exception error ){
                    System.out.println("Errornya adalah " + error);
                } finally {
                    pesawat.membawa();
                    pesawat.berjalan();
                    pesawat.terbang();
                    pesawat.berhenti();
                    pesawat.dijual();
                }



            }

            case 3 -> {
                //error handling untuk pengecekan kesalahan inputan
                try {
                    System.out.println("--Verifikasi Kendaraan--");
                    System.out.print("nama pemilik : ");
                    namaPemilik = input.nextLine();
                    System.out.print("nomor rangka : ");
                    nomorRangka = input.next();
                } catch (Exception error){
                    System.out.println("Errornya adalah " + error);
                }


                if (identitas.verifikasi(namaPemilik,nomorRangka)){
                    System.out.println("Kendaraan anda sudah terdaftar");
                }
                else {
                    System.out.println("Kendaraan anda belum terdaftar");
                }
            }
        }
    }
}
