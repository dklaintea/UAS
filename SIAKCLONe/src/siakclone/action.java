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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class action {
 private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
 private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/siakuas";
 private static final String DB_USER = "root";
 private static final String DB_PASSWORD = "";
 public static void insertTableMahasiswa(Mahasiswa MHS) throws SQLException {
  Connection connection = null;
  Statement statement = null;
  int count = 0;
  
  String insertTableSQL = "INSERT INTO Mahasiswa"
    + "(nim, nama, TTL, Jurusan) " + "VALUES"
    + "('"+MHS.getNim()+"','"+MHS.getNama()+"','"+MHS.getTTL()+"','"+MHS.getJurusan()+"')";
 
  try {
   connection = getDatabaseConnection();
   statement = connection.createStatement();
   //System.out.println(insertTableSQL);
   statement.executeUpdate(insertTableSQL);
   count = statement.getUpdateCount();
 
   System.out.println(count +" Record telah berhasil di masukkan ke tabel Mahasiswa!");
 
  } catch (SQLException e) {
 
   System.out.println(e.getMessage());
 
  } finally {
 
   if (statement != null) {
    statement.close();
   }
 
   if (connection != null) {
    connection.close();
   }
 
  }
 }
 public static void insertTableMatkul(Matkul MK) throws SQLException {
  Connection connection = null;
  Statement statement = null;
  int count = 0;
  
  String insertTableSQL = "INSERT INTO Matkul"
    + "(kode_mk, nama_mk, sks) " + "VALUES"
    + "('"+MK.getKode_mk()+"','"+MK.getNama_mk()+"','"+MK.getSks()+"')";
 
  try {
   connection = getDatabaseConnection();
   statement = connection.createStatement();
   //System.out.println(insertTableSQL);
   statement.executeUpdate(insertTableSQL);
   count = statement.getUpdateCount();
 
   //System.out.println(count +" Record telah berhasil di masukkan ke tabel TBL_USER!");
 
  } catch (SQLException e) {
 
   System.out.println(e.getMessage());
 
  } finally {
 
   if (statement != null) {
    statement.close();
   }
 
   if (connection != null) {
    connection.close();
   }
 
  }
 }
  public static void insertTableNilai(Nilai NIL) throws SQLException {
  Connection connection = null;
  Statement statement = null;
  int count = 0;
  
  String insertTableSQL = "INSERT INTO Nilai"
    + "(nim, kode_mk, nilai) " + "VALUES"
    + "('"+NIL.getNim()+"','"+NIL.getKode_mk()+"','"+NIL.getNilai()+"')";
 
  try {
   connection = getDatabaseConnection();
   statement = connection.createStatement();
   //System.out.println(insertTableSQL);
   statement.executeUpdate(insertTableSQL);
   count = statement.getUpdateCount();
 
   //System.out.println(count +" Record telah berhasil di masukkan ke tabel TBL_USER!");
 
  } catch (SQLException e) {
 
   System.out.println(e.getMessage());
 
  } finally {
 
   if (statement != null) {
    statement.close();
   }
 
   if (connection != null) {
    connection.close();
   }
 
  }
 }
 public static Connection getDatabaseConnection() {
  Connection connection = null;

  try {

   Class.forName(DB_DRIVER);

  } catch (ClassNotFoundException e) {

   System.out.println(e.getMessage());

  }

  try {

   connection = DriverManager.getConnection(DB_CONNECTION, DB_USER,
     DB_PASSWORD);
   return connection;

  } catch (SQLException e) {

   System.out.println(e.getMessage());

  }

  return connection;
 }
}
