package confg;

import java.sql.Connection;
import javax.swing.JOptionPane;

public class TestKoneksi {
    public static void main(String[] args) {
        Connection c = Database.koneksi();

        if (c != null) {
            JOptionPane.showMessageDialog(null, "Koneksi berhasil!");
        } else {
            JOptionPane.showMessageDialog(null, "Koneksi gagal!");
        }
    }
}