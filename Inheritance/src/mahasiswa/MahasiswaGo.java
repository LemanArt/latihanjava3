/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author Leman
 */
public class MahasiswaGo {

    public static void main(String[] args) {
// Membuat object
        mahasiswa Anton = new mahasiswa();
        /* memanggil atribut dan memberi nilai */
        Anton.setNama("Anton Santoso");
        Anton.setJenisKelamin("Laki-laki");
        Anton.setUmur(28);
        Anton.setNIM("10102020");
        Anton.setAlamat("Bekasi Kota");
        Anton.setJurusan("Informatika");

        System.out.println("Nama: " + Anton.getNama());
        System.out.println("JenisKelamin: " + Anton.getJenisKelamin());
        System.out.println("Umur: " + Anton.getUmur());
        System.out.println("NIM: " + Anton.getNIM());
        System.out.println("Jurusan: " + Anton.getJurusan());
        System.out.println("Alamat: " + Anton.getAlamat());
    }
}
