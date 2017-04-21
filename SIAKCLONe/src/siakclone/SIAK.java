/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siakclone;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ibnumasud
 */
public class SIAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan nim:");
        String nim=sc.next();
        System.out.print("Masukkan nama:");
        String nama=sc.next();
        System.out.print("Masukkan TTL (DD-MM-YYYY):");
        String TTL=sc.next();
        System.out.print("Masukkan Jurusan:");
        String Jurusan=sc.next();
        Mahasiswa MHS=new Mahasiswa (nim,nama,TTL,Jurusan);
        System.out.println("--------------------");
        System.out.print("Masukkan kode_mk:");
        String kode_mk=sc.next();
        System.out.print("Masukkan nama_mk:");
        String nama_mk=sc.next();
        System.out.print("Masukkan sks:");
        int sks=sc.nextInt();
        Matkul MK=new Matkul (kode_mk,nama_mk,sks);
        System.out.println("--------------------");
        System.out.print("Masukkan nilai:");
        int nilai=sc.nextInt();
        char Nilai_akhir;
        if (nilai >= 80) {
            Nilai_akhir='A';
        } else if (nilai >= 70) {
             Nilai_akhir='B';
            
            
        }else if (nilai >=60) {
            Nilai_akhir='C';
    }else if (nilai >=50) {
        Nilai_akhir='D';
    }else {
         Nilai_akhir ='E';
    }
        Nilai Nilaiakhir=new Nilai(nim,kode_mk,Nilai_akhir);
     try {
      action.insertTableMahasiswa(MHS);
  } catch (SQLException ex) {
   ex.printStackTrace();
  }
      try {
      action.insertTableMatkul(MK);
  } catch (SQLException ex) {
   ex.printStackTrace();
  }
       try {
      action.insertTableNilai(Nilaiakhir);
  } catch (SQLException ex) {
   ex.printStackTrace();
  }
    }
    
}
