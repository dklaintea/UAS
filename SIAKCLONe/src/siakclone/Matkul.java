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
public class Matkul {
    private String kode_mk;
    private String nama_mk;
    private int sks;

    public Matkul() {
    }

    public Matkul(String kode_mk, String nama_mk, int sks) {
        this.kode_mk = kode_mk;
        this.nama_mk = nama_mk;
        this.sks = sks;
    }
    

    /**
     * @return the kode_mk
     */
    public String getKode_mk() {
        return kode_mk;
    }

    /**
     * @param kode_mk the kode_mk to set
     */
    public void setKode_mk(String kode_mk) {
        this.kode_mk = kode_mk;
    }

    /**
     * @return the nama_mk
     */
    public String getNama_mk() {
        return nama_mk;
    }

    /**
     * @param nama_mk the nama_mk to set
     */
    public void setNama_mk(String nama_mk) {
        this.nama_mk = nama_mk;
    }

    /**
     * @return the sks
     */
    public int getSks() {
        return sks;
    }

    /**
     * @param sks the sks to set
     */
    public void setSks(int sks) {
        this.sks = sks;
    }
    
}
