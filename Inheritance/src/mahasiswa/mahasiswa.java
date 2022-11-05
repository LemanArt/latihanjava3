/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author Leman
 */
public class mahasiswa extends manusia {
    private String nim;
    private String jurusan;
    //setter
    public void setNIM(String NIM) {
        this.nim = NIM;
    }
    public void setJurusan(String Jurusan) {
        this.jurusan = Jurusan;
    }
    // getter
    public String getNIM() {
        return this.nim;
    }
    public String getJurusan() {
        return this.jurusan;
    }
}
