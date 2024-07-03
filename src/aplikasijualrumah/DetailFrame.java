package aplikasijualrumah;

import javax.swing.*;
import java.awt.*;

public class DetailFrame extends JFrame {
    private JLabel labelDetail;
    
    public DetailFrame(String tipeRumah, String deskripsi, String imagePath) {
        setTitle("Detail Rumah");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Menempatkan frame di tengah layar
        
        // Panel utama untuk menampung gambar
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        
        // Buat label untuk gambar
        labelDetail = new JLabel();
        
        if (imagePath != null) {
            ImageIcon originalIcon = new ImageIcon(getClass().getResource(imagePath));
            Image image = originalIcon.getImage();
            
            // Dapatkan ukuran asli dari gambar
            int originalWidth = originalIcon.getIconWidth();
            int originalHeight = originalIcon.getIconHeight();
            
            // Mengatur ukuran frame berdasarkan ukuran gambar asli
            setSize(originalWidth + 50, originalHeight + 50); // Tambah margin untuk frame

            // Menetapkan icon asli ke labelDetail
            labelDetail.setIcon(originalIcon);
            labelDetail.setPreferredSize(new Dimension(originalWidth, originalHeight)); // Ukuran preferensi untuk gambar
            
            // Tambahkan labelDetail ke dalam JScrollPane
            JScrollPane imageScrollPane = new JScrollPane(labelDetail);
            imageScrollPane.setPreferredSize(new Dimension(originalWidth, originalHeight));
            imageScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            imageScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            
            // Tambahkan JScrollPane ke panel utama
            mainPanel.add(imageScrollPane, BorderLayout.CENTER);
        } else {
            labelDetail.setText("Gambar tidak tersedia.");
            mainPanel.add(labelDetail, BorderLayout.CENTER);
            setSize(400, 300); // Setel ukuran default jika gambar tidak tersedia
        }

        // Tambahkan panel utama ke frame
        getContentPane().add(mainPanel, BorderLayout.CENTER);
    }
}
