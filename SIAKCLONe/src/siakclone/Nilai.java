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
public class Nilai {
    private String nim;
    private String kode_mk;
    private char nilai;

    public Nilai() {
    }

    public Nilai(String nim, String kode_mk, char nilai) {
        this.nim = nim;
        this.kode_mk = kode_mk;
        this.nilai = nilai;
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
     * @return the nilai
     */
    public char getNilai() {
        return nilai;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setNilai(char nilai) {
        this.nilai = nilai;
    }
    
}
