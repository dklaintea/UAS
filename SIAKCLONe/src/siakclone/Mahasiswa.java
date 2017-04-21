/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siakclone;

/**
 *
 * @author ibnumasud
 */
public class Mahasiswa {
    private String nim;
            private String nama;
            private String TTL;
            private String Jurusan;
    
    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String TTL, String Jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.TTL = TTL;
        this.Jurusan = Jurusan;
    }
    

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the TTL
     */
    public String getTTL() {
        return TTL;
    }

    /**
     * @param TTL the TTL to set
     */
    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    /**
     * @return the Jurusan
     */
    public String getJurusan() {
        return Jurusan;
    }

    /**
     * @param Jurusan the Jurusan to set
     */
    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }
}
