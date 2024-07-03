package aplikasijualrumah;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TotalFrame extends JFrame {
    private JLabel lblHargaRumah;
    private JLabel lblHargaTambahan;
    private JLabel lblTotalHarga;
    private JLabel lblTipePembayaran;
    private JLabel lblMetodeBank;
    private JLabel lblJumlahCicilan;
    private JLabel lblCicilanPerbulan; // Label baru untuk Cicilan Perbulan
    private JComboBox<String> cbTipePembayaran;
    private JComboBox<String> cbMetodeBank;
    private JComboBox<Integer> cbJumlahCicilan;
    private JButton btnHitungTotal;
    private JTextField tfHargaRumah;
    private JTextField tfHargaTambahan;
    private JTextField tfTotalHarga;
    private JTextField tfCicilanPerbulan; // TextField baru untuk Cicilan Perbulan

    private static final int BIAYA_ADMIN = 5000;

    public TotalFrame(String hargaRumah, int hargaTambahan) {
        setTitle("Total Pembayaran");
        setSize(450, 450); // Ukuran diperbesar untuk menampung komponen tambahan
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        lblHargaRumah = new JLabel("Harga Rumah:");
        lblHargaTambahan = new JLabel("Harga Tambahan:");
        lblTotalHarga = new JLabel("Total Harga:");
        lblTipePembayaran = new JLabel("Tipe Pembayaran:");
        lblMetodeBank = new JLabel("Metode Pembayaran Bank:");
        lblJumlahCicilan = new JLabel("Jumlah Cicilan (Bulan):");
        lblCicilanPerbulan = new JLabel("Cicilan Perbulan:"); // Label baru untuk Cicilan Perbulan
        
        cbTipePembayaran = new JComboBox<>(new String[] {
            "Lunas (Tanpa Bunga)",
            "Kredit (Bunga 5%)"
        });
        cbMetodeBank = new JComboBox<>(new String[] {
            "Pembayaran BCA",
            "Pembayaran Mandiri",
            "Pembayaran BRI",
            "Pembayaran BTN",
            "Pembayaran BSI"
        });
        
        cbJumlahCicilan = new JComboBox<>(new Integer[] { 6, 12, 24, 36, 48, 60 });

        btnHitungTotal = new JButton("Hitung Total");
        tfHargaRumah = new JTextField(hargaRumah);
        tfHargaTambahan = new JTextField("Rp." + hargaTambahan);
        tfTotalHarga = new JTextField();
        tfCicilanPerbulan = new JTextField(); // TextField baru untuk Cicilan Perbulan

        tfHargaRumah.setEditable(false);
        tfHargaTambahan.setEditable(false);
        tfTotalHarga.setEditable(false);
        tfCicilanPerbulan.setEditable(false); // Membuat TextField Cicilan Perbulan tidak dapat diedit

        setLayout(null);

        lblHargaRumah.setBounds(20, 20, 100, 30);
        tfHargaRumah.setBounds(150, 20, 150, 30);
        lblHargaTambahan.setBounds(20, 60, 120, 30);
        tfHargaTambahan.setBounds(150, 60, 150, 30);
        lblTipePembayaran.setBounds(20, 100, 120, 30);
        cbTipePembayaran.setBounds(150, 100, 220, 30);
        lblMetodeBank.setBounds(20, 140, 180, 30);
        cbMetodeBank.setBounds(210, 140, 160, 30);
        lblJumlahCicilan.setBounds(20, 180, 150, 30);
        cbJumlahCicilan.setBounds(210, 180, 100, 30);
        lblCicilanPerbulan.setBounds(20, 220, 120, 30); // Posisi label Cicilan Perbulan
        tfCicilanPerbulan.setBounds(150, 220, 150, 30); // Posisi TextField Cicilan Perbulan
        lblTotalHarga.setBounds(20, 260, 100, 30); // Posisi label Total Harga
        tfTotalHarga.setBounds(150, 260, 150, 30); // Posisi TextField Total Harga
        btnHitungTotal.setBounds(150, 300, 150, 30); // Posisi tombol Hitung Total

        add(lblHargaRumah);
        add(tfHargaRumah);
        add(lblHargaTambahan);
        add(tfHargaTambahan);
        add(lblTipePembayaran);
        add(cbTipePembayaran);
        add(lblMetodeBank);
        add(cbMetodeBank);
        add(lblJumlahCicilan);
        add(cbJumlahCicilan);
        add(lblCicilanPerbulan); // Menambahkan label Cicilan Perbulan
        add(tfCicilanPerbulan); // Menambahkan TextField Cicilan Perbulan
        add(lblTotalHarga);
        add(tfTotalHarga);
        add(btnHitungTotal);

        btnHitungTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungTotal();
            }
        });
        
        // Tambahkan ActionListener untuk memperbarui CicilanPerbulan saat tipe pembayaran diubah
        cbTipePembayaran.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Jika pembayarannya lunas, isi TextField Cicilan Perbulan dengan "-"
                if (cbTipePembayaran.getSelectedItem().equals("Lunas (Tanpa Bunga)")) {
                    tfCicilanPerbulan.setText("-");
                    lblJumlahCicilan.setVisible(false);
                    cbJumlahCicilan.setVisible(false);
                } else {
                    lblJumlahCicilan.setVisible(true);
                    cbJumlahCicilan.setVisible(true);
                    tfCicilanPerbulan.setText(""); // Kosongkan TextField saat beralih ke kredit
                }
            }
        });

        // Pastikan Cicilan Perbulan disetel sesuai pilihan awal
        if (cbTipePembayaran.getSelectedItem().equals("Lunas (Tanpa Bunga)")) {
            tfCicilanPerbulan.setText("-");
            lblJumlahCicilan.setVisible(false);
            cbJumlahCicilan.setVisible(false);
        } else {
            lblJumlahCicilan.setVisible(true);
            cbJumlahCicilan.setVisible(true);
        }
    }

    private void hitungTotal() {
        String hargaRumahStr = tfHargaRumah.getText().replace("Rp.", "").replace(".", "").trim();
        int hargaRumah = Integer.parseInt(hargaRumahStr);

        String hargaTambahanStr = tfHargaTambahan.getText().replace("Rp.", "").replace(".", "").trim();
        int hargaTambahan = Integer.parseInt(hargaTambahanStr);

        int totalHarga = hargaRumah + hargaTambahan;
        String tipePembayaran = cbTipePembayaran.getSelectedItem().toString();
        double cicilanPerBulan = 0.0;

        if (tipePembayaran.equals("Kredit (Bunga 5%)")) {
            totalHarga += totalHarga * 0.05;
        }

        totalHarga += BIAYA_ADMIN;

        if (tipePembayaran.equals("Kredit (Bunga 5%)")) {
            int jumlahCicilan = (int) cbJumlahCicilan.getSelectedItem();
            cicilanPerBulan = (double) totalHarga / jumlahCicilan;
        }

        tfTotalHarga.setText("Rp." + String.format("%,d", totalHarga));

        if (tipePembayaran.equals("Kredit (Bunga 5%)")) {
            tfCicilanPerbulan.setText("Rp." + String.format("%,.2f", cicilanPerBulan));
        } else {
            tfCicilanPerbulan.setText("-"); // Isi dengan strip jika pembayarannya lunas
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TotalFrame("Rp.150.000.000", 20000000).setVisible(true);
            }
        });
    }
}
