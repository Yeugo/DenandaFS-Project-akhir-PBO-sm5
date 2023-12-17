/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.io.File;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ACER
 */
public class configdb_2110010228 {
    
    private String Database = "2110010228";
    private String jdbcurl = "jdbc:mysql://localhost:3306/"+Database;
    private String username = "root";
    private String password = "";
    
    public configdb_2110010228(){}
    
    public configdb_2110010228(String url, String username, String password){
        
        try {
            Driver mysqlDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);
            Connection koneksi = DriverManager.getConnection(url, username, password);
            System.out.println("Berhasil Dikoneksikan");
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
        }   
    }

    public Connection getKoneksi() throws SQLException{
        try {
            Driver mysqlDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);
            System.out.println("Berhasil Dikoneksikan");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
        return DriverManager.getConnection(this.jdbcurl, this.username, this.password);
    }
    
    public boolean dupikasiKey(String tabel, String primarykey, String isi){
        boolean hasil = false;
        try {
            Statement sts = getKoneksi().createStatement();
            ResultSet rs = sts.executeQuery("SELECT * FROM "+tabel+" WHERE "+primarykey+" = '"+isi+"'");
            hasil = rs.next();
        } catch (Exception e) {
            System.err.println(e.toString());
        }
        return hasil;
    }
    
    public String getFieldTabel(String[] Fieldnya){
        String hasil = "";
        int deteksi = Fieldnya.length-1;
        try {
            for (int i = 0; i < Fieldnya.length; i++) {
                if (i == deteksi){
                    hasil = hasil + Fieldnya[i];
                } else {
                    hasil = hasil + Fieldnya[i]+",";
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return "("+hasil+")";
    
    }
    
    public String getIsiTabel(String[] Isinya){
        String hasil = "";
        int deteksi = Isinya.length-1;
            try {
                for (int i = 0; i < Isinya.length; i++) {
                    if (i == deteksi) {
                        hasil = hasil+"'"+Isinya[i]+"'";
                    } else {
                        hasil = hasil+"'"+Isinya[i]+"',";
                    }
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            return "("+hasil+")";
    }
    
    public void simpanDBAuto(String NamaTabel, String[] FieldTabelnya, String[] IsiTabelnya){
        
        try {
            String SQL = "INSERT INTO "+NamaTabel+" "+getFieldTabel(FieldTabelnya)+" VALUES "+getIsiTabel(IsiTabelnya)+"";
            Statement save = getKoneksi().createStatement();
            save.executeUpdate(SQL);
            save.close();
            
            System.out.println("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    
    public String getEditFieldVAlue (String[] Field, String[] ValueField){
        String hasil = "";
        int deteksi = Field.length-1;
        try {
            for (int i = 0; i < Field.length; i++) {
            if (i == deteksi){
                hasil = hasil +Field[i]+"='"+ValueField[i]+"'";
            } else {
                hasil = hasil +Field[i]+"='"+ValueField[i]+"',";
            }
        }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return hasil;
    } 
    
    public void UbahDBAuto (String NamaTabel, String NamaPrimary, String IsiPrimary, String[]Field, String[] ValueField) {
        try {
            String SQLEdit = "UPDATE "+NamaTabel+" SET "+getEditFieldVAlue(Field, ValueField)+" WHERE "+NamaPrimary+"='"+IsiPrimary+"'";
            Statement perintah = getKoneksi().createStatement();
            perintah.executeUpdate(SQLEdit);
            perintah.close();
            getKoneksi().close();
            System.out.println("Data Berhasil Diubah");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void HapusDBAuto (String NamaTabel, String Primarynya, String IsiPrimary) {
        try {
            String SQLHapus = "DELETE FROM "+NamaTabel+" WHERE "+Primarynya+"='"+IsiPrimary+"'";
            Statement perintah = getKoneksi().createStatement();
            perintah.executeUpdate(SQLHapus);
            perintah.close();
            getKoneksi().close();
            System.out.println("Data Berhasil Dihapus");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void JudulJtable (JTable JTablenya, String[] Judulnya) {
        DefaultTableModel modelnya = new DefaultTableModel();
        try {
            JTablenya.setModel(modelnya);
            for (int i = 0; i < Judulnya.length; i++) {
                modelnya.addColumn(Judulnya[i]);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void LebarJtable (JTable JTablenya, int[] Lebarnya) {
        TableColumn kolom = new TableColumn();
        try {
            JTablenya.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
            for (int i = 0; i < Lebarnya.length; i++) {
                kolom = JTablenya.getColumnModel().getColumn(i);
                kolom.setPreferredWidth(Lebarnya[i]);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public Object[][] isiTable (String SQL, int jumlah) {
        Object[][] data = null;
        try {
            Statement st = getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(SQL);
            rs.last();
            int baris = rs.getRow();
            rs.beforeFirst();
            int j = 0;
            data = new Object[baris][jumlah];
            while (rs.next()) {
                for (int i = 0; i < jumlah; i++) {
                    data[j][i] = rs.getString(i+1);
                }
                j++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return data;
    }
    
    public void tampilTable (String Judul[], String SQL, JTable Table) {
        try {
            String title[] = Judul;
            int jum = title.length;
            Table.setModel(new DefaultTableModel(isiTable(SQL, jum), title));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public int jumlahRecord (String SQL) {
        int hasil = 0;
        int i = 0;
        try {
            Statement st = getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()){
                i++;
            }
            hasil = i++;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return hasil;
    }
    
    public void tampilLaporan (String laporanFile, String SQL){
        try {
            File file = new File(laporanFile);
            JasperDesign jasDes = JRXmlLoader.load(file);
            
            JRDesignQuery sqlQuery = new JRDesignQuery();
            sqlQuery.setText(SQL);
            jasDes.setQuery(sqlQuery);
            
            JasperReport JR = JasperCompileManager.compileReport(jasDes);
            JasperPrint JP = JasperFillManager.fillReport(JR, null, getKoneksi());
            JasperViewer.viewReport(JP);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    
    
    
}