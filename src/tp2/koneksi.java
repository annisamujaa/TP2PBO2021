/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Annisa Muja Ahidah
 */
public class koneksi {
    static Connection con;
    public static Connection getConnection(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp2pbo2021", "root", "");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
        }
        return con;
    }
}

