package ui;

import javax.swing.*;
import java.awt.*;

public class UserFrame extends JFrame {

    public UserFrame() {
        // Mengatur properti dasar frame (jendela)
        setTitle("Manajemen Pengguna");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // Menggunakan BorderLayout untuk menata panel utama
        setLocationRelativeTo(null); // Menempatkan jendela di tengah layar

        // Panel untuk input Nama, Username, dan Password
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2, 10, 10)); // Layout grid 3 baris, 2 kolom
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50)); // Menambahkan ruang (padding)

        JLabel namaLabel = new JLabel("Nama");
        JTextField namaField = new JTextField();
        JLabel usernameLabel = new JLabel("Username");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField(); // JPasswordField untuk menyembunyikan karakter

        inputPanel.add(namaLabel);
        inputPanel.add(namaField);
        inputPanel.add(usernameLabel);
        inputPanel.add(usernameField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);

        // Panel untuk tombol-tombol
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5)); // Layout flow untuk menengahkan tombol

        JButton saveButton = new JButton("Save");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");
        JButton cancelButton = new JButton("Cancel");

        buttonPanel.add(saveButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(cancelButton);

        // Panel untuk tabel
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20)); // Padding tabel

        JTable userTable = new JTable(); // Komponen tabel
        JScrollPane scrollPane = new JScrollPane(userTable); // Tambahkan scroll agar tabel bisa digulir
        tablePanel.add(scrollPane, BorderLayout.CENTER);

        // Menambahkan semua panel ke frame utama
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(tablePanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // Menjalankan frame di Event Dispatch Thread untuk keamanan thread Swing
        SwingUtilities.invokeLater(() -> {
            new UserFrame().setVisible(true);
        });
    }
}