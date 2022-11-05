/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawai;

/**
 *
 * @author Leman
 */
public class pegawai {

    private String nama;
    private double gajiPokok;

    public void setNama(String Nama) {
        this.nama = Nama;
    }
    public void setgajiPokok(double GajiPokok) {
        this.gajiPokok = GajiPokok;
    }
    public String getNama() {
        return this.nama;
    }
    public double getgajiPokok() {
        return this.gajiPokok;
    }
    public void cetakInfo(){
        System.out.println("Nama :"+ nama + "bagian" +  "\n Gaji :" + gajiPokok + "\n");
    }
    
}
