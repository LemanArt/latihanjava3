/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author Leman
 */
public class manusia {

    private String nama;
    private String jenisKelamin;
    private int umur;
    private String alamat;
    //setter
    public void setNama(String Nama) {
        this.nama = Nama;
    }
    public void setJenisKelamin(String JenisKelamin) {
        this.jenisKelamin = JenisKelamin;
    }
    public void setUmur(int Umur) {
        this.umur = Umur;
    }
    public void setAlamat(String Alamat) {
        this.alamat = Alamat;
    }
    
    // getter
    public String getNama() {
        return this.nama;
    }
    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    public int getUmur() {
        return this.umur;
    }
    public String getAlamat(){
        return this.alamat;
    }
}
