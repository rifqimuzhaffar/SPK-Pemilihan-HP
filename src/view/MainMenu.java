/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connectionDB.koneksi;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    
    
    public MainMenu() {
        initComponents();
        setResizable(false);
        Chipset();
        RAM();
        datatable1();
        datatable2();
        datatable6();
    }
    
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    private DefaultTableModel tabmode1;
    private Statement statement;
    
    public double nilaiChipset(String nama)
    {
        double result = 0;
        try{
            String sqlf = "SELECT * FROM TABELKRITERIA WHERE KETERANGAN = '" + nama + "'";
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sqlf);
          
            while(hasil.next()){
                result = hasil.getInt("nilai");
            }
        }
        catch(Exception e){
            
        }
        return result;
    }
    
    public void Chipset(){
        try{
            c1.removeAllItems();
            String sqlf = "select * from tabelkriteria where kriteria in ('Chipset')";
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sqlf);
            while(hasil.next()){
                c1.addItem(hasil.getString("keterangan"));
            }
            hasil.last();
            int jumlahdata = hasil.getRow();
            hasil.first();
        }catch(Exception e){
        }
    }
    
    public void RAM(){
        try{
            c2.removeAllItems();
            String sqlr = "select * from tabelkriteria where kriteria in ('RAM')";
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sqlr);
            while(hasil.next()){
                c2.addItem(hasil.getString("keterangan"));
            }
            hasil.last();
            int jumlahdata = hasil.getRow();
            hasil.first();
        }catch(Exception e){
        }
    }
    
    protected void aktif(){
        tnamahp.setEnabled(true);
        c5.setEnabled(true);
        tnamahp.requestFocus();
    }
    
    protected void kosongkriteria(){
        idkriteria.setText("");
        kriteria.setSelectedIndex(0);
        keterangan.setText("");
        nilai.setSelectedIndex(0);
    }
    
    protected void kosongdatahp(){
        tnamahp.setText("");
        c1.setSelectedIndex(0);
        c2.setSelectedIndex(0);
        c3.setSelectedIndex(0);
        c4.setSelectedIndex(0);
        c5.setText("");
    }
    
    protected void datatable1(){
    Object [] Baris = {"NO","HANDPHONE","CHIPSET","RAM","MEMORY","BATTERY","HARGA"};
    tabmode = new DefaultTableModel(null, Baris);
    tabmode1 = new DefaultTableModel(null,Baris);
    tabelalternatif1.setModel(tabmode);
    tabelalternatif1.setModel(tabmode1);
    try {
    String sql = "Select * from tabelalternatif1";
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        int nos = 1;
        while (hasil.next()){
            String a = String.valueOf(nos);
            String b = hasil.getString("namahp");
            String c = hasil.getString("c1");
            String d = hasil.getString("c2");
            String e = hasil.getString("c3");
            String f = hasil.getString("c4");
            String g = hasil.getString("c5");
            String[] data={a,b,c,d,e,f,g};
            tabmode.addRow(data);
            tabmode1.addRow(data);
            nos++;
        }
    }catch (SQLException e){
        }
    }
    
    protected void datatable2(){
    Object [] Baris = {"NO","HANDPHONE","C1","C2","C3","C4","C5"};
    tabmode = new DefaultTableModel(null, Baris);
    tabelalternatif2.setModel(tabmode);
    
    try {
    String sql = "Select * from tebelalternatif2";
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        int nos = 1;
        while (hasil.next()){
            String a = String.valueOf(nos);
            String b = hasil.getString("namahp");
            String c = hasil.getString("c1");
            String d = hasil.getString("c2");
            String e = hasil.getString("c3");
            String f = hasil.getString("c4");
            String g = hasil.getString("c5");
            String[] data={a,b,c,d,e,f,g};
            tabmode.addRow(data);
            
            nos++;
        }
    }catch (SQLException e){
        }
    }
    
    protected void datatable6(){
    Object [] Baris = {"ID","KRITERA","KETERANGAN","NILAI"};
    tabmode = new DefaultTableModel(null, Baris);
    tabelkriteria.setModel(tabmode);            
    try {
    String sql = "Select * from tabelkriteria";
    
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        while (hasil.next()){
            String a = hasil.getString("id");
            String b = hasil.getString("kriteria");
            String c = hasil.getString("keterangan");
            String d = hasil.getString("nilai");
            
            String[] data={a,b,c,d};
            tabmode.addRow(data);
        }
    }catch (Exception e){
        }
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        penelutama = new javax.swing.JPanel();
        panelmenu = new javax.swing.JPanel();
        bkriteria = new javax.swing.JButton();
        bdatahp = new javax.swing.JButton();
        bhasil = new javax.swing.JButton();
        bhasil1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panelmain = new javax.swing.JPanel();
        panelkriteria = new javax.swing.JPanel();
        labelKodeSupplier7 = new javax.swing.JLabel();
        idkriteria = new javax.swing.JTextField();
        kriteria = new javax.swing.JComboBox<>();
        labelKodeSupplier8 = new javax.swing.JLabel();
        labelKodeSupplier9 = new javax.swing.JLabel();
        keterangan = new javax.swing.JTextField();
        nilai = new javax.swing.JComboBox<>();
        labelKodeSupplier10 = new javax.swing.JLabel();
        btnSimpan1 = new javax.swing.JButton();
        btnHapus1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelkriteria = new javax.swing.JTable();
        panelhp = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelalternatif1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelalternatif2 = new javax.swing.JTable();
        tnamahp = new javax.swing.JTextField();
        labelKodeSupplier1 = new javax.swing.JLabel();
        labelKodeSupplier2 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        c2 = new javax.swing.JComboBox<>();
        labelKodeSupplier3 = new javax.swing.JLabel();
        labelKodeSupplier4 = new javax.swing.JLabel();
        c3 = new javax.swing.JComboBox<>();
        c4 = new javax.swing.JComboBox<>();
        labelKodeSupplier5 = new javax.swing.JLabel();
        labelKodeSupplier6 = new javax.swing.JLabel();
        c5 = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        panelhasil = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelinfo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        penelutama.setBackground(new java.awt.Color(0, 177, 79));

        panelmenu.setBackground(new java.awt.Color(0, 177, 79));
        panelmenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        bkriteria.setBackground(new java.awt.Color(255, 255, 255));
        bkriteria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bkriteria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/iconplus.png"))); // NOI18N
        bkriteria.setText("DATA KRITERIA");
        bkriteria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bkriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkriteriaActionPerformed(evt);
            }
        });

        bdatahp.setBackground(new java.awt.Color(255, 255, 255));
        bdatahp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bdatahp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/handphone.png"))); // NOI18N
        bdatahp.setText("DATA HANDPHONE");
        bdatahp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bdatahp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdatahpActionPerformed(evt);
            }
        });

        bhasil.setBackground(new java.awt.Color(255, 255, 255));
        bhasil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bhasil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/hasil-transformed.png"))); // NOI18N
        bhasil.setText("HASIL");
        bhasil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bhasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhasilActionPerformed(evt);
            }
        });

        bhasil1.setBackground(new java.awt.Color(255, 255, 255));
        bhasil1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bhasil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/tentang-transformed.png"))); // NOI18N
        bhasil1.setText("INFO APLIKASI");
        bhasil1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bhasil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhasil1ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/logo ojol.jpeg"))); // NOI18N

        javax.swing.GroupLayout panelmenuLayout = new javax.swing.GroupLayout(panelmenu);
        panelmenu.setLayout(panelmenuLayout);
        panelmenuLayout.setHorizontalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bdatahp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bhasil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bkriteria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bhasil1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelmenuLayout.setVerticalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(bkriteria, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bdatahp, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bhasil1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        panelmain.setBackground(new java.awt.Color(0, 177, 79));
        panelmain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelmain.setLayout(new java.awt.CardLayout());

        panelkriteria.setBackground(new java.awt.Color(0, 177, 79));

        labelKodeSupplier7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelKodeSupplier7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelKodeSupplier7.setText("ID");
        labelKodeSupplier7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        kriteria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kriteria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chipset", "RAM" }));

        labelKodeSupplier8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelKodeSupplier8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelKodeSupplier8.setText("KRITERIA");
        labelKodeSupplier8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelKodeSupplier9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelKodeSupplier9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelKodeSupplier9.setText("KETERANGAN");
        labelKodeSupplier9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nilai.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nilai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        labelKodeSupplier10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelKodeSupplier10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelKodeSupplier10.setText("NILAI");
        labelKodeSupplier10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnSimpan1.setBackground(new java.awt.Color(255, 255, 255));
        btnSimpan1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSimpan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/save-30-w11.png"))); // NOI18N
        btnSimpan1.setText("Simpan");
        btnSimpan1.setContentAreaFilled(false);
        btnSimpan1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan1.setIconTextGap(0);
        btnSimpan1.setOpaque(true);
        btnSimpan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSimpan1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSimpan1MouseExited(evt);
            }
        });
        btnSimpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpan1ActionPerformed(evt);
            }
        });

        btnHapus1.setBackground(new java.awt.Color(255, 255, 255));
        btnHapus1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHapus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/delete-30-w11.png"))); // NOI18N
        btnHapus1.setText("Hapus");
        btnHapus1.setContentAreaFilled(false);
        btnHapus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus1.setIconTextGap(0);
        btnHapus1.setOpaque(true);
        btnHapus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapus1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapus1MouseExited(evt);
            }
        });
        btnHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus1ActionPerformed(evt);
            }
        });

        tabelkriteria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelkriteria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tabelkriteria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelkriteria.setRowHeight(30);
        tabelkriteria.setRowMargin(2);
        tabelkriteria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkriteriaMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tabelkriteria);

        javax.swing.GroupLayout panelkriteriaLayout = new javax.swing.GroupLayout(panelkriteria);
        panelkriteria.setLayout(panelkriteriaLayout);
        panelkriteriaLayout.setHorizontalGroup(
            panelkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkriteriaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(panelkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelkriteriaLayout.createSequentialGroup()
                        .addGroup(panelkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelKodeSupplier8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelKodeSupplier7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelKodeSupplier9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelKodeSupplier10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(keterangan, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idkriteria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kriteria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nilai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelkriteriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelkriteriaLayout.setVerticalGroup(
            panelkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkriteriaLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(panelkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeSupplier7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idkriteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeSupplier8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kriteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeSupplier9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeSupplier10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelkriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );

        panelmain.add(panelkriteria, "card2");

        panelhp.setBackground(new java.awt.Color(0, 177, 79));

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnClear.setText("Bersihkan");
        btnClear.setContentAreaFilled(false);
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.setOpaque(true);
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DATA PEKERJAAN");

        tabelalternatif1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelalternatif1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tabelalternatif1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelalternatif1.setRowHeight(30);
        tabelalternatif1.setRowMargin(2);
        tabelalternatif1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelalternatif1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabelalternatif1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tabelalternatif1);

        tabelalternatif2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelalternatif2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tabelalternatif2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelalternatif2.setRowHeight(30);
        tabelalternatif2.setRowMargin(2);
        tabelalternatif2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelalternatif2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelalternatif2);

        tnamahp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tnamahp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamahpActionPerformed(evt);
            }
        });

        labelKodeSupplier1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelKodeSupplier1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelKodeSupplier1.setText("Nama Handphone");
        labelKodeSupplier1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelKodeSupplier2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelKodeSupplier2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelKodeSupplier2.setText("Chipset");
        labelKodeSupplier2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        c1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        c2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        labelKodeSupplier3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelKodeSupplier3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelKodeSupplier3.setText("RAM");
        labelKodeSupplier3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelKodeSupplier4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelKodeSupplier4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelKodeSupplier4.setText("ROM/Memory");
        labelKodeSupplier4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        c3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        c3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "64 GB", "128 GB", "256 GB", "512 GB" }));

        c4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5000 mAh", "5600 mAh", "6000 mAh", "7000 mAh" }));

        labelKodeSupplier5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelKodeSupplier5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelKodeSupplier5.setText("Kapasitas Battery");
        labelKodeSupplier5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelKodeSupplier6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelKodeSupplier6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelKodeSupplier6.setText("Harga");
        labelKodeSupplier6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        c5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        c5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c5KeyTyped(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 255, 255));
        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/delete-30-w11.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setContentAreaFilled(false);
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.setIconTextGap(0);
        btnHapus.setOpaque(true);
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusMouseExited(evt);
            }
        });
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(255, 255, 255));
        btnUbah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/edit-30-w11.png"))); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.setContentAreaFilled(false);
        btnUbah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUbah.setIconTextGap(0);
        btnUbah.setOpaque(true);
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUbahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUbahMouseExited(evt);
            }
        });
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(255, 255, 255));
        btnSimpan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/save-30-w11.png"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.setContentAreaFilled(false);
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.setIconTextGap(0);
        btnSimpan.setOpaque(true);
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSimpanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSimpanMouseExited(evt);
            }
        });
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelhpLayout = new javax.swing.GroupLayout(panelhp);
        panelhp.setLayout(panelhpLayout);
        panelhpLayout.setHorizontalGroup(
            panelhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhpLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(44, 44, 44))
            .addGroup(panelhpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelhpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelhpLayout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelKodeSupplier1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelKodeSupplier2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelKodeSupplier3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelKodeSupplier4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelKodeSupplier5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelKodeSupplier6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 172, Short.MAX_VALUE)
                    .addComponent(c4, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tnamahp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c5))
                .addContainerGap())
        );
        panelhpLayout.setVerticalGroup(
            panelhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panelhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelhpLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelhpLayout.createSequentialGroup()
                        .addGroup(panelhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tnamahp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelKodeSupplier1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelKodeSupplier2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panelhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelKodeSupplier3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelKodeSupplier4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelKodeSupplier5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelhpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelKodeSupplier6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        panelmain.add(panelhp, "card3");

        panelhasil.setBackground(new java.awt.Color(0, 177, 79));

        jLabel3.setText("HASIL");

        javax.swing.GroupLayout panelhasilLayout = new javax.swing.GroupLayout(panelhasil);
        panelhasil.setLayout(panelhasilLayout);
        panelhasilLayout.setHorizontalGroup(
            panelhasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhasilLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 485, Short.MAX_VALUE))
        );
        panelhasilLayout.setVerticalGroup(
            panelhasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhasilLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 414, Short.MAX_VALUE))
        );

        panelmain.add(panelhasil, "card4");

        panelinfo.setBackground(new java.awt.Color(0, 177, 79));

        jLabel4.setText("INFO");

        javax.swing.GroupLayout panelinfoLayout = new javax.swing.GroupLayout(panelinfo);
        panelinfo.setLayout(panelinfoLayout);
        panelinfoLayout.setHorizontalGroup(
            panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinfoLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 485, Short.MAX_VALUE))
        );
        panelinfoLayout.setVerticalGroup(
            panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinfoLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 414, Short.MAX_VALUE))
        );

        panelmain.add(panelinfo, "card5");

        javax.swing.GroupLayout penelutamaLayout = new javax.swing.GroupLayout(penelutama);
        penelutama.setLayout(penelutamaLayout);
        penelutamaLayout.setHorizontalGroup(
            penelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penelutamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        penelutamaLayout.setVerticalGroup(
            penelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penelutamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(penelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(penelutama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(penelutama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bdatahpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdatahpActionPerformed
        // TODO add your handling code here:
        panelmain.removeAll();
        panelmain.repaint();
        panelmain.revalidate();
        //add panel
        panelmain.add(panelhp);
        panelmain.repaint();
        panelmain.revalidate();
    }//GEN-LAST:event_bdatahpActionPerformed

    private void bhasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhasilActionPerformed
        // TODO add your handling code here:
        panelmain.removeAll();
        panelmain.repaint();
        panelmain.revalidate();
        //add panel
        panelmain.add(panelhasil);
        panelmain.repaint();
        panelmain.revalidate();
    }//GEN-LAST:event_bhasilActionPerformed

    private void bkriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkriteriaActionPerformed
        // TODO add your handling code here:
        panelmain.removeAll();
        panelmain.repaint();
        panelmain.revalidate();
        //add panel
        panelmain.add(panelkriteria);
        panelmain.repaint();
        panelmain.revalidate();
    }//GEN-LAST:event_bkriteriaActionPerformed

    private void bhasil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhasil1ActionPerformed
        // TODO add your handling code here:
        panelmain.removeAll();
        panelmain.repaint();
        panelmain.revalidate();
        //add panel
        panelmain.add(panelinfo);
        panelmain.repaint();
        panelmain.revalidate();
    }//GEN-LAST:event_bhasil1ActionPerformed

    private void btnSimpan1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpan1MouseEntered
        btnSimpan1.setBackground(new Color(0,0,204));
        btnSimpan1.setForeground(Color.white);
    }//GEN-LAST:event_btnSimpan1MouseEntered

    private void btnSimpan1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpan1MouseExited
        btnSimpan1.setBackground(new Color(204,204,204));
        btnSimpan1.setForeground(Color.black);
    }//GEN-LAST:event_btnSimpan1MouseExited

    private void btnSimpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpan1ActionPerformed
        String sql = "insert into tabelkriteria values (?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, idkriteria.getText());
            stat.setString(2, kriteria.getSelectedItem().toString());
            stat.setString(3, keterangan.getText());
            stat.setString(4, nilai.getSelectedItem().toString());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosongkriteria();
            idkriteria.requestFocus();
            datatable6();
//            fasilitas();
//            ruangan();

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
    }//GEN-LAST:event_btnSimpan1ActionPerformed

    private void btnHapus1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapus1MouseEntered
        btnHapus1.setBackground(new Color(0,0,204));
        btnHapus1.setForeground(Color.white);
    }//GEN-LAST:event_btnHapus1MouseEntered

    private void btnHapus1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapus1MouseExited
        btnHapus1.setBackground(new Color(204,204,204));
        btnHapus1.setForeground(Color.black);
    }//GEN-LAST:event_btnHapus1MouseExited

    private void btnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus1ActionPerformed
        int ok = JOptionPane.showConfirmDialog(null,"hapus","Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql="delete from tabelkriteria where id='"+idkriteria.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                kosongkriteria();
                idkriteria.requestFocus();
                datatable6();
//                fasilitas();
//                ruangan();
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
            }
        }
    }//GEN-LAST:event_btnHapus1ActionPerformed

    private void tabelkriteriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkriteriaMouseClicked
        int bar = tabelkriteria.getSelectedRow();
        String a = tabmode.getValueAt (bar, 0).toString();
        String b = tabmode.getValueAt (bar, 1).toString();
        String c = tabmode.getValueAt (bar, 2).toString();
        String d = tabmode.getValueAt (bar, 3).toString();

        idkriteria.setText(a);
        kriteria.setSelectedItem(b);
        keterangan.setText(c);
        nilai.setSelectedItem(d);
    }//GEN-LAST:event_tabelkriteriaMouseClicked

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        btnClear.setBackground(new Color(0,0,204));
        btnClear.setForeground(Color.white);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        btnClear.setBackground(new Color(204,204,204));
        btnClear.setForeground(Color.black);
    }//GEN-LAST:event_btnClearMouseExited

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
//        kosong();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tabelalternatif1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelalternatif1MouseClicked
//        int bar = tabelalternatif1.getSelectedRow();
//        String a = tabmode1.getValueAt (bar, 0).toString();
//        String b = tabmode1.getValueAt (bar, 1).toString();
//        String c = tabmode1.getValueAt (bar, 2).toString();
//        String d = tabmode1.getValueAt (bar, 3).toString();
//        String e = tabmode1.getValueAt (bar, 4).toString();
//        String f = tabmode1.getValueAt (bar, 5).toString();
//        String g = tabmode1.getValueAt (bar, 6).toString();
//        String h = tabmode1.getValueAt (bar, 7).toString();
//
//        tnamapekerjaan.setText(c);
//        c1.setSelectedItem(d);
//        c2.setSelectedItem(e);
//        c3.setSelectedItem(f);
//        c4.setSelectedItem(g);
//        c5.setText(h);
//        try{
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            Date tanggal = dateFormat.parse(b);
//            tanggalmasuk.setDate(tanggal);
//        }catch(Exception ex){
//            JOptionPane.showMessageDialog(null, "Format tanggal salah: " + ex.getMessage());
//        }
    }//GEN-LAST:event_tabelalternatif1MouseClicked

    private void tabelalternatif1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelalternatif1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelalternatif1MouseEntered

    private void tabelalternatif2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelalternatif2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelalternatif2MouseClicked

    private void tnamahpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamahpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamahpActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void c5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5KeyTyped
        // TODO add your handling code here:
        char nomoraja = evt.getKeyChar();
        if (!(Character.isDigit(nomoraja) || nomoraja == KeyEvent.VK_BACK_SPACE || nomoraja == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_c5KeyTyped

    private void btnHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseEntered
        btnHapus.setBackground(new Color(0,0,204));
        btnHapus.setForeground(Color.white);
    }//GEN-LAST:event_btnHapusMouseEntered

    private void btnHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseExited
        btnHapus.setBackground(new Color(204,204,204));
        btnHapus.setForeground(Color.black);
    }//GEN-LAST:event_btnHapusMouseExited

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
//        int ok = JOptionPane.showConfirmDialog(null,"Hapus","Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
//        if (ok==0){
//            String sql = "DELETE from tabelalternatif1 WHERE namapekerjaan = '"+tnamapekerjaan.getText()+"' ";
//            String sql2 = "DELETE from tabelalternatif2 WHERE namapekerjaan = '"+tnamapekerjaan.getText()+"' ";
//            try {
//                PreparedStatement stat = conn.prepareStatement(sql);
//                PreparedStatement stats = conn.prepareStatement(sql2);
//                stat.executeUpdate();
//                stats.executeUpdate();
//
//                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
//                kosong();
//                tnamapekerjaan.requestFocus();
//                datatable1();
//                datatable2();
//                datatable3();
//            } catch (SQLException e){
//                JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
//            }
//        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseEntered
        btnUbah.setBackground(new Color(0,0,204));
        btnUbah.setForeground(Color.white);
    }//GEN-LAST:event_btnUbahMouseEntered

    private void btnUbahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseExited
        btnUbah.setBackground(new Color(204,204,204));
        btnUbah.setForeground(Color.black);
    }//GEN-LAST:event_btnUbahMouseExited

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
//        String tampilan = "yyyy-MM-dd";
//        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
//        String tanggal  = String.valueOf(fm.format(tanggalmasuk.getDate()));
//        try{
//            String sql = "UPDATE tabelalternatif1 SET tanggalmasuk=?, c1=?, c2=?, c3=?, c4=?, c5=? WHERE namapekerjaan = ?";
//            PreparedStatement stat = conn.prepareStatement(sql);
//            stat.setString(1, tanggal);
//            stat.setString(2, c1.getSelectedItem().toString());
//            stat.setString(3, c2.getSelectedItem().toString());
//            stat.setString(4, c3.getSelectedItem().toString());
//            stat.setString(5, c4.getSelectedItem().toString());
//            stat.setString(6, c5.getText());
//            stat.setString(7, tnamapekerjaan.getText());
//
//            String sql2 = "UPDATE tabelalternatif2 SET tanggalmasuk=?, c1=?, c2=?, c3 =?, c4=?, c5=? WHERE namapekerjaan = ?";
//            PreparedStatement stats = conn.prepareStatement(sql2);
//
//            String pilihc1;
//            double c1Double;
//            pilihc1 = String.valueOf(c1.getSelectedItem());
//            c1Double = nilaiFasilitas(String.valueOf(c1.getSelectedItem()));
//            //                if (pilihc1.equals ("Listrik & Penerangan")) {
//                //                    c1Double = 5;
//                //                }else if (pilihc1.equals ("Sistem Plumbing")){
//                //                    c1Double = 4;
//                //                }else if (pilihc1.equals ("Sistem Keamanan")){
//                //                    c1Double = 3;
//                //                }else if (pilihc1.equals ("Struktural Gedung")){
//                //                    c1Double = 2;
//                //                }else if (pilihc1.equals ("Sistem HVAC")){
//                //                    c1Double = 1;
//                //                }else {
//                //                    c1Double = 0;
//                //                }
//
//            String pilihc2;
//            double c2Double;
//            pilihc2 = String.valueOf(c2.getSelectedItem());
//            c2Double = nilaiFasilitas(String.valueOf(c2.getSelectedItem()));
//            //                if (pilihc2.equals ("R.PIMPINAN")) {
//                //                    c2Double = 5;
//                //                }else if (pilihc2.equals ("R.KARYAWAN")){
//                //                    c2Double = 4;
//                //                }else if (pilihc2.equals ("R.DOSEN")){
//                //                    c2Double = 3;
//                //                }else if (pilihc2.equals ("LABORATORIUM")){
//                //                    c2Double = 2;
//                //                }else if (pilihc2.equals ("R.KELAS")){
//                //                    c2Double = 1;
//                //                }else {
//                //                    c2Double = 0;
//                //                }
//
//            String pilihc3;
//            double c3Double;
//            pilihc3 = String.valueOf(c3.getSelectedItem());
//
//            if (pilihc3.equals ("Sangat Aman")) {
//                c3Double = 5;
//            }else if (pilihc3.equals ("Aman")){
//                c3Double = 4;
//            }else if (pilihc3.equals ("Cukup")){
//                c3Double = 3;
//            }else if (pilihc3.equals ("Berbahaya")){
//                c3Double = 2;
//            }else if (pilihc3.equals ("Sangat Berbahaya")){
//                c3Double = 1;
//            }else {
//                c3Double = 0;
//            }
//
//            String pilihc4;
//            double c4Double;
//            pilihc4 = String.valueOf(c4.getSelectedItem());
//
//            if (pilihc4.equals ("Sangat Penting")) {
//                c4Double = 5;
//            }else if (pilihc4.equals ("Penting")){
//                c4Double = 4;
//            }else if (pilihc4.equals ("Cukup")){
//                c4Double = 3;
//            }else if (pilihc4.equals ("Kurang Penting")){
//                c4Double = 2;
//            }else if (pilihc4.equals ("Tidak Penting")){
//                c4Double = 1;
//            }else {
//                c4Double = 0;
//            }
//
//            String nilai = c5.getText();
//
//            int c5Double;
//            int nilaikriteria = Integer.parseInt(nilai); // Mengubah nilai dari String ke tipe data int
//
//            if (nilaikriteria >= 0 && nilaikriteria < 200000) {
//                c5Double = 5;
//            } else if (nilaikriteria >= 200000 && nilaikriteria < 400000) {
//                c5Double = 4;
//            } else if (nilaikriteria >= 400000 && nilaikriteria < 600000) {
//                c5Double = 3;
//            } else if (nilaikriteria >= 600000 && nilaikriteria < 1000000) {
//                c5Double = 2;
//            } else if (nilaikriteria >= 1000000) {
//                c5Double = 1;
//            } else {
//                c5Double = 0; // Nilai default atau sesuai dengan kebutuhan Anda
//            }
//
//            stats.setString(1, tanggal);
//            stats.setString(2, String.valueOf(c1Double));
//            stats.setString(3, String.valueOf(c2Double));
//            stats.setString(4, String.valueOf(c3Double));
//            stats.setString(5, String.valueOf(c4Double));
//            stats.setString(6, String.valueOf(c5Double));
//            stats.setString(7, tnamapekerjaan.getText());
//
//            stat.executeUpdate();
//            stats.executeUpdate();
//            JOptionPane.showMessageDialog(null,"Data Berhasil diubah");
//            kosong();
//            tnamapekerjaan.requestFocus();
//            datatable1();
//            datatable2();
//        }catch (SQLException e){
//            JOptionPane.showMessageDialog(null, "Data Gagal Diubah"+e);
//        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnSimpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseEntered
        btnSimpan.setBackground(new Color(0,0,204));
        btnSimpan.setForeground(Color.white);
    }//GEN-LAST:event_btnSimpanMouseEntered

    private void btnSimpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseExited
        btnSimpan.setBackground(new Color(204,204,204));
        btnSimpan.setForeground(Color.black);
    }//GEN-LAST:event_btnSimpanMouseExited

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try{
            String sql1 = "insert into tabelalternatif1 values (?,?,?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql1);
            stat.setString(1, null);
            stat.setString(2, tnamahp.getText());
            stat.setString(3, c1.getSelectedItem().toString());
            stat.setString(4, c2.getSelectedItem().toString());
            stat.setString(5, c3.getSelectedItem().toString());
            stat.setString(6, c4.getSelectedItem().toString());
            stat.setString(7, c5.getText());

            stat.executeUpdate();


            String sql2 = "insert into tebelalternatif2 values (?,?,?,?,?,?,?)";
            String pilihc1;
            double c1Double;
            pilihc1 = String.valueOf(c1.getSelectedItem());
            c1Double = nilaiChipset(String.valueOf(c1.getSelectedItem()));

            String pilihc2;
            double c2Double;
            pilihc2 = String.valueOf(c2.getSelectedItem());
            c2Double = nilaiChipset(String.valueOf(c2.getSelectedItem()));

            String pilihc3;
            double c3Double;
            pilihc3 = String.valueOf(c3.getSelectedItem());
           
            if (pilihc3.equals ("512 GB")){
                c3Double = 4;
            }else if (pilihc3.equals ("256 GB")){
                c3Double = 3;
            }else if (pilihc3.equals ("128 GB")){
                c3Double = 2;
            }else if (pilihc3.equals ("64 GB")){
                c3Double = 1;
            }else {
                c3Double = 0;
            }

            String pilihc4;
            double c4Double;
            pilihc4 = String.valueOf(c4.getSelectedItem());
            
            if (pilihc4.equals ("7000 mAh")){
                c4Double = 4;
            }else if (pilihc4.equals ("6000 mAh")){
                c4Double = 3;
            }else if (pilihc4.equals ("5600 mAh")){
                c4Double = 2;
            }else if (pilihc4.equals ("5000 mAh")){
                c4Double = 1;
            }else {
                c4Double = 0;
            }

            String nilai = c5.getText();
            int c5Double;
            int nilaikriteria = Integer.parseInt(nilai);

            if (nilaikriteria >= 0 && nilaikriteria < 1500000) {
                c5Double = 4;
            } else if (nilaikriteria >= 1500000 && nilaikriteria < 2000000) {
                c5Double = 3;
            } else if (nilaikriteria >= 2000000 && nilaikriteria < 2500000) {
                c5Double = 2;
            } else if (nilaikriteria >= 2500000) {
                c5Double = 1;
            } else {
                c5Double = 0;
            }

            PreparedStatement stats = conn.prepareStatement(sql2);
            stats.setString(1, null);
            stats.setString(2, tnamahp.getText());
            stats.setString(3, String.valueOf(c1Double));
            stats.setString(4, String.valueOf(c2Double));
            stats.setString(5, String.valueOf(c3Double));
            stats.setString(6, String.valueOf(c4Double));
            stats.setString(7, String.valueOf(c5Double));

            stats.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosongdatahp();
            tnamahp.requestFocus();
            datatable1();
            datatable2();
//            datatable3();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bdatahp;
    private javax.swing.JButton bhasil;
    private javax.swing.JButton bhasil1;
    private javax.swing.JButton bkriteria;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHapus1;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnSimpan1;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JComboBox<String> c3;
    private javax.swing.JComboBox<String> c4;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField idkriteria;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField keterangan;
    private javax.swing.JComboBox<String> kriteria;
    private javax.swing.JLabel labelKodeSupplier1;
    private javax.swing.JLabel labelKodeSupplier10;
    private javax.swing.JLabel labelKodeSupplier2;
    private javax.swing.JLabel labelKodeSupplier3;
    private javax.swing.JLabel labelKodeSupplier4;
    private javax.swing.JLabel labelKodeSupplier5;
    private javax.swing.JLabel labelKodeSupplier6;
    private javax.swing.JLabel labelKodeSupplier7;
    private javax.swing.JLabel labelKodeSupplier8;
    private javax.swing.JLabel labelKodeSupplier9;
    private javax.swing.JComboBox<String> nilai;
    private javax.swing.JPanel panelhasil;
    private javax.swing.JPanel panelhp;
    private javax.swing.JPanel panelinfo;
    private javax.swing.JPanel panelkriteria;
    private javax.swing.JPanel panelmain;
    private javax.swing.JPanel panelmenu;
    private javax.swing.JPanel penelutama;
    private javax.swing.JTable tabelalternatif1;
    private javax.swing.JTable tabelalternatif2;
    private javax.swing.JTable tabelkriteria;
    private javax.swing.JTextField tnamahp;
    // End of variables declaration//GEN-END:variables
}
