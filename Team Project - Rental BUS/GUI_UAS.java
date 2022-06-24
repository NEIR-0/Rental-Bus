/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class GUI_UAS extends javax.swing.JFrame {
    FullBus fb = new FullBus();
    
    DecimalFormat dc = new DecimalFormat();
    
    public GUI_UAS() {
        initComponents();
        
        Casal.addItem("Pilih");
        Casal.addItem("Jakarta");
        
        Ctujuan.addItem("Pilih");
        Ctujuan.addItem("Yogyakarta");
        Ctujuan.addItem("Bandung");
        Ctujuan.addItem("Malang");
        
        paket.addItem("Pilih");
        paket.addItem("2 Hari");
        paket.addItem("3 Hari");
        paket.addItem("5 Hari");
        paket.addItem("7 Hari");
        paket.addItem("10 Hari");
        
        codebus.addItem("Pilih");
        codebus.addItem("WEHA ONE");
        codebus.addItem("BIG BUS");
        codebus.addItem("BIG BUS BUSINESS");
        codebus.addItem("MEDIUM BUS");
        codebus.addItem("SHD/HDD");
        codebus.addItem("BUS HD");
        
        Plainnya.addItem("Pilih");
        Plainnya.addItem("Bank");
        Plainnya.addItem("OVO");
        Plainnya.addItem("Gopay");
        Plainnya.addItem("Shopeepay");
        Plainnya.addItem("Dana");
        
        nonaktif();
    }

    public void setcolor(JPanel p){
        p.setBackground(new Color (45, 66, 99));
    }
    
    public void resetcolor(JPanel pl){
        pl.setBackground(new Color (25,25,25));
    }    
    
    public void setcolormainKatalog(JPanel b){
        b.setBackground(new Color (6, 70, 99));
    }
    
    public void resetcolormainKatalog(JPanel bl){
        bl.setBackground(new Color (4, 28, 50));
    }
    
    public void setcolormakanan(JPanel m){
        m.setBackground(new Color (52, 179, 241));
    }
    
    public void resetcolormakanan(JPanel ml){
        ml.setBackground(new Color (140, 192, 222));
    }
    
    public void setcolorminuman(JPanel mi){
        mi.setBackground(new Color (27, 26, 23));
    }
    
    public void resetcolorminuman(JPanel mi1){
        mi1.setBackground(new Color (44, 51, 51));
    }
    
    public void setcolorobat(JPanel o){
        o.setBackground(new Color (221, 74, 72));
    }
    
    public void resetcolorobat(JPanel ol){
        ol.setBackground(new Color (223,120,97));
    }
    
    public void aktif(){
        Casal.setEnabled(true);
        Ctujuan.setEnabled(true);
        pergi.setEnabled(true);
        Ppergi.setEnabled(true);
        paket.setEnabled(true);
        codebus.setEnabled(true);
        Ttotalm.setText("0.0");
        Ttotalmi.setText("0.0");
        Ttotalo.setText("0.0");        
    }
    
    public void nonaktif(){
        TotalB.setEnabled(false);
        Ttotalm.setEnabled(false);
        Ttotalmi.setEnabled(false);
        Ttotalo.setEnabled(false);
        Htotal.setEnabled(false);
        Ctujuan.setEnabled(false);
        paket.setEnabled(false);
        codebus.setEnabled(false);
        pergi.setEnabled(false);
        Ppergi.setEnabled(false);
        Tjbeli.setEnabled(false);
        Nama.setEnabled(false);
        
        Tpmie.setEnabled(false);
        Tpmini.setEnabled(false);
        Tnpaket.setEnabled(false);
        Tngoreng.setEnabled(false);
        Ttotalm.setEnabled(false);
        Btm.setEnabled(false);
        
        Tamineral.setEnabled(false);
        Tgcoffe.setEnabled(false);
        Ttpucuk.setEnabled(false);
        Tpocari.setEnabled(false);
        Ttotalmi.setEnabled(false);
        Btmi.setEnabled(false);
        
        Ttangin.setEnabled(false);
        Tfcare.setEnabled(false);
        Tantimo.setEnabled(false);
        Tmkputih.setEnabled(false);
        Ttotalo.setEnabled(false);
        Bto.setEnabled(false);
        
        Plainnya.setSelectedItem("Pilih");
        Plainnya.setEnabled(false);
        cash.setEnabled(false);
        lainnya.setEnabled(false);
        Pesan.setEnabled(false);
        Booking.setEnabled(false);
        
        Tnama.setEnabled(false);
        Tpaket.setEnabled(false);
        Tkode.setEnabled(false);
    }
    
    public void bersih(){
        TotalB.setText("0.0");
        Ttotalm.setText("0.0");
        Ttotalmi.setText("0.0");
        Ttotalo.setText("0.0");
        Htotal.setText("0.0");
        Casal.setSelectedItem("Pilih");
        Ctujuan.setSelectedItem("Pilih");
        paket.setSelectedItem("Pilih");
        codebus.setEnabled(false);
        pergi.setEnabled(false);
        Ppergi.setEnabled(false);
        TotalB.setText("0.0");
        Tjbeli.setText("0");
        Tjbeli.setEnabled(false);
        Nama.setText("");
        Nama.setEnabled(false);
        
        Pmie.setSelected(false);
        Pmini.setSelected(false);
        Npaket.setSelected(false);
        Ngoreng.setSelected(false);
        Tpmie.setText("0");
        Tpmie.setEnabled(false);
        Tpmini.setText("0");
        Tpmini.setEnabled(false);
        Tnpaket.setText("0");
        Tnpaket.setEnabled(false);
        Tngoreng.setText("0");
        Tngoreng.setEnabled(false);
        Ttotalm.setText("0.0");
        Ttotalm.setEnabled(false);
        Btm.setEnabled(false);
        
        Amineral.setSelected(false);
        Gcoffe.setSelected(false);
        Tpucuk.setSelected(false);
        Pocari.setSelected(false);
        Tamineral.setText("0");
        Tamineral.setEnabled(false);
        Tgcoffe.setText("0");
        Tgcoffe.setEnabled(false);
        Ttpucuk.setText("0");
        Ttpucuk.setEnabled(false);
        Tpocari.setText("0");
        Tpocari.setEnabled(false);
        Ttotalmi.setText("0.0");
        Ttotalmi.setEnabled(false);
        Btmi.setEnabled(false);
        
        Tangin.setSelected(false);
        Fcare.setSelected(false);
        Antimo.setSelected(false);
        Mkputih.setSelected(false);
        Ttangin.setText("0");
        Ttangin.setEnabled(false);
        Tfcare.setText("0");
        Tfcare.setEnabled(false);
        Tantimo.setText("0");
        Tantimo.setEnabled(false);
        Tmkputih.setText("0");
        Tmkputih.setEnabled(false);
        Ttotalo.setText("0.0");
        Ttotalo.setEnabled(false);
        Bto.setEnabled(false);
        
        Plainnya.setEnabled(false);
        Booking.setEnabled(false);
        Pesan.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dradio = new javax.swing.ButtonGroup();
        CaraBayar = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        nav = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        Nhome = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Nabout = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Nrental = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Nshop = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        Nkatalog = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Nexit = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        rental = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        asal = new javax.swing.JLabel();
        Casal = new javax.swing.JComboBox<>();
        tujuan = new javax.swing.JLabel();
        Ctujuan = new javax.swing.JComboBox<>();
        tujuan1 = new javax.swing.JLabel();
        TotalB = new javax.swing.JTextField();
        detail = new javax.swing.JPanel();
        pergi = new javax.swing.JRadioButton();
        Ppergi = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        paket = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        codebus = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Tjbeli = new javax.swing.JTextField();
        snack = new javax.swing.JPanel();
        makanan = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Pmie = new javax.swing.JRadioButton();
        Pmini = new javax.swing.JRadioButton();
        Npaket = new javax.swing.JRadioButton();
        Ngoreng = new javax.swing.JRadioButton();
        Tpmie = new javax.swing.JTextField();
        Tpmini = new javax.swing.JTextField();
        Tnpaket = new javax.swing.JTextField();
        Tngoreng = new javax.swing.JTextField();
        Ttotalm = new javax.swing.JTextField();
        Btm = new javax.swing.JButton();
        obat = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Tangin = new javax.swing.JRadioButton();
        Fcare = new javax.swing.JRadioButton();
        Antimo = new javax.swing.JRadioButton();
        Mkputih = new javax.swing.JRadioButton();
        Ttangin = new javax.swing.JTextField();
        Tfcare = new javax.swing.JTextField();
        Tantimo = new javax.swing.JTextField();
        Tmkputih = new javax.swing.JTextField();
        Ttotalo = new javax.swing.JTextField();
        Bto = new javax.swing.JButton();
        minuman = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Amineral = new javax.swing.JRadioButton();
        Gcoffe = new javax.swing.JRadioButton();
        Tpucuk = new javax.swing.JRadioButton();
        Pocari = new javax.swing.JRadioButton();
        Tamineral = new javax.swing.JTextField();
        Tgcoffe = new javax.swing.JTextField();
        Ttpucuk = new javax.swing.JTextField();
        Tpocari = new javax.swing.JTextField();
        Ttotalmi = new javax.swing.JTextField();
        Btmi = new javax.swing.JButton();
        pembayaran = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cash = new javax.swing.JRadioButton();
        lainnya = new javax.swing.JRadioButton();
        Plainnya = new javax.swing.JComboBox<>();
        jumlah = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Htotal = new javax.swing.JTextField();
        Bersih = new javax.swing.JButton();
        Booking = new javax.swing.JButton();
        Pesan = new javax.swing.JButton();
        katalog = new javax.swing.JPanel();
        navKatalog = new javax.swing.JPanel();
        hd = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        medium = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        bustoilet = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        shd = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        weha = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        bigbus = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        mainKatalog = new javax.swing.JPanel();
        bus1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        bus2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        bus3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        bus4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        bus5 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        bus6 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        first = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        Shop = new javax.swing.JPanel();
        navshop = new javax.swing.JPanel();
        food = new javax.swing.JPanel();
        jLabel172 = new javax.swing.JLabel();
        drug = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        drink = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        mainshop = new javax.swing.JPanel();
        m = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        mi = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        o = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        About = new javax.swing.JPanel();
        footer = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel158 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel153 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel155 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel156 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel157 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel159 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel160 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        head = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel149 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel150 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel151 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        tiket = new javax.swing.JPanel();
        jLabel165 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel170 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        Tnama = new javax.swing.JTextField();
        Tpaket = new javax.swing.JTextField();
        Tkode = new javax.swing.JTextField();
        print = new javax.swing.JPanel();
        jLabel171 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(910, 638));
        setResizable(false);

        jPanel2.setBackground(java.awt.Color.blue);
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 600));

        nav.setBackground(new java.awt.Color(25, 25, 25));
        nav.setPreferredSize(new java.awt.Dimension(200, 600));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/nav.png"))); // NOI18N

        Nhome.setBackground(new java.awt.Color(25, 25, 25));
        Nhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NhomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NhomeMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("HOME");

        javax.swing.GroupLayout NhomeLayout = new javax.swing.GroupLayout(Nhome);
        Nhome.setLayout(NhomeLayout);
        NhomeLayout.setHorizontalGroup(
            NhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(NhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NhomeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        NhomeLayout.setVerticalGroup(
            NhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(NhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NhomeLayout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );

        Nabout.setBackground(new java.awt.Color(25, 25, 25));
        Nabout.setPreferredSize(new java.awt.Dimension(200, 60));
        Nabout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NaboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NaboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NaboutMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("ABOUT");

        javax.swing.GroupLayout NaboutLayout = new javax.swing.GroupLayout(Nabout);
        Nabout.setLayout(NaboutLayout);
        NaboutLayout.setHorizontalGroup(
            NaboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(NaboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NaboutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        NaboutLayout.setVerticalGroup(
            NaboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(NaboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NaboutLayout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );

        Nrental.setBackground(new java.awt.Color(25, 25, 25));
        Nrental.setPreferredSize(new java.awt.Dimension(200, 60));
        Nrental.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NrentalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NrentalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NrentalMouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("RENTAL");

        javax.swing.GroupLayout NrentalLayout = new javax.swing.GroupLayout(Nrental);
        Nrental.setLayout(NrentalLayout);
        NrentalLayout.setHorizontalGroup(
            NrentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(NrentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NrentalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        NrentalLayout.setVerticalGroup(
            NrentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(NrentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NrentalLayout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );

        Nshop.setBackground(new java.awt.Color(25, 25, 25));
        Nshop.setPreferredSize(new java.awt.Dimension(200, 74));
        Nshop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NshopMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NshopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NshopMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setText("SHOP");

        javax.swing.GroupLayout NshopLayout = new javax.swing.GroupLayout(Nshop);
        Nshop.setLayout(NshopLayout);
        NshopLayout.setHorizontalGroup(
            NshopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(NshopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NshopLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        NshopLayout.setVerticalGroup(
            NshopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(NshopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NshopLayout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addGap(0, 8, Short.MAX_VALUE)))
        );

        Nkatalog.setBackground(new java.awt.Color(25, 25, 25));
        Nkatalog.setPreferredSize(new java.awt.Dimension(200, 74));
        Nkatalog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NkatalogMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NkatalogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NkatalogMouseExited(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("KATALOG");

        javax.swing.GroupLayout NkatalogLayout = new javax.swing.GroupLayout(Nkatalog);
        Nkatalog.setLayout(NkatalogLayout);
        NkatalogLayout.setHorizontalGroup(
            NkatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(NkatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NkatalogLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        NkatalogLayout.setVerticalGroup(
            NkatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(NkatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NkatalogLayout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        Nexit.setBackground(new java.awt.Color(25, 25, 25));
        Nexit.setPreferredSize(new java.awt.Dimension(200, 74));
        Nexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NexitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NexitMouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel19.setForeground(java.awt.Color.white);
        jLabel19.setText("EXIT");

        javax.swing.GroupLayout NexitLayout = new javax.swing.GroupLayout(Nexit);
        Nexit.setLayout(NexitLayout);
        NexitLayout.setHorizontalGroup(
            NexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NexitLayout.createSequentialGroup()
                .addGap(0, 62, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(0, 63, Short.MAX_VALUE))
        );
        NexitLayout.setVerticalGroup(
            NexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NexitLayout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout navLayout = new javax.swing.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Nhome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Nabout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Nrental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Nshop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Nkatalog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Nexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(Nhome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Nabout, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Nrental, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Nshop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Nkatalog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Nexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        main.setPreferredSize(new java.awt.Dimension(700, 600));
        main.setLayout(new java.awt.CardLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/HOME.jpg"))); // NOI18N

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        main.add(home, "card3");

        rental.setBackground(new java.awt.Color(236, 219, 186));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Rental List :");

        asal.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        asal.setText("ASAL:");

        Casal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasalActionPerformed(evt);
            }
        });

        tujuan.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tujuan.setText("TUJUAN:");

        Ctujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtujuanActionPerformed(evt);
            }
        });

        tujuan1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tujuan1.setText("Total :");

        TotalB.setText("0.0");
        TotalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalBActionPerformed(evt);
            }
        });

        detail.setBackground(new java.awt.Color(236, 219, 186));
        detail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 75, 49)));
        detail.setPreferredSize(new java.awt.Dimension(652, 93));

        Dradio.add(pergi);
        pergi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pergi.setText("Hanya Pergi");
        pergi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pergiActionPerformed(evt);
            }
        });

        Dradio.add(Ppergi);
        Ppergi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ppergi.setText("Pulang - Pergi");
        Ppergi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PpergiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Detail :");

        paket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paketActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Paket       :");

        codebus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codebusActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Jenis Bus  :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nama      :");

        Nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NamaKeyPressed(evt);
            }
        });

        jLabel9.setText("Jumlah Beli :");

        Tjbeli.setText("0");
        Tjbeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TjbeliKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout detailLayout = new javax.swing.GroupLayout(detail);
        detail.setLayout(detailLayout);
        detailLayout.setHorizontalGroup(
            detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(detailLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pergi)
                            .addComponent(Ppergi))
                        .addGap(34, 34, 34)
                        .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codebus, 0, 150, Short.MAX_VALUE)
                            .addComponent(paket, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nama, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(Tjbeli))
                        .addGap(24, 24, 24))))
        );
        detailLayout.setVerticalGroup(
            detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pergi)
                    .addComponent(jLabel3)
                    .addComponent(paket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ppergi)
                    .addComponent(jLabel5)
                    .addComponent(codebus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Tjbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        snack.setBackground(new java.awt.Color(236, 219, 186));

        makanan.setBackground(new java.awt.Color(236, 219, 186));
        makanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 75, 49)));
        makanan.setPreferredSize(new java.awt.Dimension(200, 160));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Makanan :");

        Pmie.setText("Pop mie (mini)");
        Pmie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PmieActionPerformed(evt);
            }
        });

        Pmini.setText("Pop mie (original)");
        Pmini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PminiActionPerformed(evt);
            }
        });

        Npaket.setText("Nasi paket");
        Npaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NpaketActionPerformed(evt);
            }
        });

        Ngoreng.setText("Nasi goreng");
        Ngoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgorengActionPerformed(evt);
            }
        });

        Tpmie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tpmie.setText("0");
        Tpmie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TpmieKeyPressed(evt);
            }
        });

        Tpmini.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tpmini.setText("0");
        Tpmini.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TpminiKeyPressed(evt);
            }
        });

        Tnpaket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tnpaket.setText("0");
        Tnpaket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TnpaketKeyPressed(evt);
            }
        });

        Tngoreng.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tngoreng.setText("0");
        Tngoreng.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TngorengKeyPressed(evt);
            }
        });

        Ttotalm.setText("0.0");
        Ttotalm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtotalmActionPerformed(evt);
            }
        });

        Btm.setText("Total");
        Btm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout makananLayout = new javax.swing.GroupLayout(makanan);
        makanan.setLayout(makananLayout);
        makananLayout.setHorizontalGroup(
            makananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(makananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(makananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(makananLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(makananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pmie)
                            .addGroup(makananLayout.createSequentialGroup()
                                .addGroup(makananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Npaket)
                                    .addComponent(Ngoreng)
                                    .addComponent(Pmini))
                                .addGap(23, 23, 23)
                                .addGroup(makananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tpmini, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(makananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Tnpaket, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addComponent(Tpmie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Tngoreng, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))))
                    .addComponent(jLabel6))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, makananLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btm, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ttotalm, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        makananLayout.setVerticalGroup(
            makananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(makananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(makananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pmie)
                    .addComponent(Tpmie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(makananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pmini)
                    .addComponent(Tpmini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(makananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Npaket)
                    .addComponent(Tnpaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(makananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ngoreng)
                    .addComponent(Tngoreng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(makananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ttotalm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btm))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        obat.setBackground(new java.awt.Color(236, 219, 186));
        obat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 75, 49)));
        obat.setPreferredSize(new java.awt.Dimension(200, 160));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Obat - obatan :");

        Tangin.setText("Tolak angin");
        Tangin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanginActionPerformed(evt);
            }
        });

        Fcare.setText("Freshcare (original)");
        Fcare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FcareActionPerformed(evt);
            }
        });

        Antimo.setText("Antimo");
        Antimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AntimoActionPerformed(evt);
            }
        });

        Mkputih.setText("Minyak kayu putih");
        Mkputih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MkputihActionPerformed(evt);
            }
        });

        Ttangin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ttangin.setText("0");
        Ttangin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TtanginKeyPressed(evt);
            }
        });

        Tfcare.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tfcare.setText("0");
        Tfcare.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TfcareKeyPressed(evt);
            }
        });

        Tantimo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tantimo.setText("0");
        Tantimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TantimoKeyPressed(evt);
            }
        });

        Tmkputih.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tmkputih.setText("0");
        Tmkputih.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TmkputihKeyPressed(evt);
            }
        });

        Ttotalo.setText("0.0");

        Bto.setText("Total");
        Bto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout obatLayout = new javax.swing.GroupLayout(obat);
        obat.setLayout(obatLayout);
        obatLayout.setHorizontalGroup(
            obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(obatLayout.createSequentialGroup()
                        .addGroup(obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(obatLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(obatLayout.createSequentialGroup()
                                        .addGroup(obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Fcare)
                                            .addComponent(Antimo)
                                            .addComponent(Mkputih))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                        .addGroup(obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Tfcare, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Tantimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Tmkputih, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(obatLayout.createSequentialGroup()
                                        .addComponent(Tangin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ttangin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(21, 21, 21))
                    .addGroup(obatLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Bto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ttotalo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        obatLayout.setVerticalGroup(
            obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tangin)
                    .addComponent(Ttangin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fcare)
                    .addComponent(Tfcare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tantimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Antimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tmkputih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mkputih))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ttotalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        minuman.setBackground(new java.awt.Color(236, 219, 186));
        minuman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 75, 49)));
        minuman.setPreferredSize(new java.awt.Dimension(200, 160));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Minuman :");

        Amineral.setText("Air mineral");
        Amineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmineralActionPerformed(evt);
            }
        });

        Gcoffe.setText("Golda coffe");
        Gcoffe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GcoffeActionPerformed(evt);
            }
        });

        Tpucuk.setText("Teh pucuk");
        Tpucuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TpucukActionPerformed(evt);
            }
        });

        Pocari.setText("Pocari");
        Pocari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PocariActionPerformed(evt);
            }
        });

        Tamineral.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tamineral.setText("0");
        Tamineral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TamineralKeyPressed(evt);
            }
        });

        Tgcoffe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tgcoffe.setText("0");
        Tgcoffe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TgcoffeKeyPressed(evt);
            }
        });

        Ttpucuk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ttpucuk.setText("0");
        Ttpucuk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TtpucukKeyPressed(evt);
            }
        });

        Tpocari.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tpocari.setText("0");
        Tpocari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TpocariActionPerformed(evt);
            }
        });
        Tpocari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TpocariKeyPressed(evt);
            }
        });

        Ttotalmi.setText("0.0");

        Btmi.setText("Total");
        Btmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout minumanLayout = new javax.swing.GroupLayout(minuman);
        minuman.setLayout(minumanLayout);
        minumanLayout.setHorizontalGroup(
            minumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minumanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(minumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(minumanLayout.createSequentialGroup()
                        .addGroup(minumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(minumanLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(minumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, minumanLayout.createSequentialGroup()
                                        .addComponent(Amineral)
                                        .addGap(48, 48, 48)
                                        .addComponent(Tamineral, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, minumanLayout.createSequentialGroup()
                                        .addGroup(minumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Gcoffe)
                                            .addComponent(Tpucuk))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(minumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Ttpucuk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Tgcoffe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Tpocari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(minumanLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(minumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(minumanLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Btmi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ttotalmi, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(minumanLayout.createSequentialGroup()
                                .addComponent(Pocari)
                                .addGap(11, 124, Short.MAX_VALUE))))))
        );
        minumanLayout.setVerticalGroup(
            minumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minumanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(minumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amineral)
                    .addComponent(Tamineral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(minumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tgcoffe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gcoffe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(minumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ttpucuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tpucuk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(minumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tpocari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pocari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(minumanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ttotalmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btmi))
                .addContainerGap())
        );

        pembayaran.setBackground(new java.awt.Color(236, 219, 186));
        pembayaran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 75, 49)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Pembayaran :");

        CaraBayar.add(cash);
        cash.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cash.setText("Cash      :");
        cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashActionPerformed(evt);
            }
        });

        CaraBayar.add(lainnya);
        lainnya.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lainnya.setText("Lainnya  :");
        lainnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lainnyaActionPerformed(evt);
            }
        });

        Plainnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlainnyaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pembayaranLayout = new javax.swing.GroupLayout(pembayaran);
        pembayaran.setLayout(pembayaranLayout);
        pembayaranLayout.setHorizontalGroup(
            pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pembayaranLayout.createSequentialGroup()
                .addGroup(pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pembayaranLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(pembayaranLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lainnya)
                            .addComponent(cash))
                        .addGap(38, 38, 38)
                        .addComponent(Plainnya, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pembayaranLayout.setVerticalGroup(
            pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pembayaranLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cash)
                .addGap(9, 9, 9)
                .addGroup(pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lainnya)
                    .addComponent(Plainnya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jumlah.setBackground(new java.awt.Color(236, 219, 186));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Total :");

        Htotal.setText("0.0");
        Htotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HtotalActionPerformed(evt);
            }
        });

        Bersih.setText("Bersih");
        Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BersihActionPerformed(evt);
            }
        });

        Booking.setText("Booking");
        Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingActionPerformed(evt);
            }
        });

        Pesan.setText("Pesan");
        Pesan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jumlahLayout = new javax.swing.GroupLayout(jumlah);
        jumlah.setLayout(jumlahLayout);
        jumlahLayout.setHorizontalGroup(
            jumlahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jumlahLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(Htotal))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jumlahLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bersih)
                .addGap(18, 18, 18)
                .addComponent(Booking)
                .addGap(18, 18, 18)
                .addComponent(Pesan)
                .addGap(15, 15, 15))
        );
        jumlahLayout.setVerticalGroup(
            jumlahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jumlahLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jumlahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Htotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jumlahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bersih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Booking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pesan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout snackLayout = new javax.swing.GroupLayout(snack);
        snack.setLayout(snackLayout);
        snackLayout.setHorizontalGroup(
            snackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snackLayout.createSequentialGroup()
                .addGroup(snackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, snackLayout.createSequentialGroup()
                        .addComponent(pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, snackLayout.createSequentialGroup()
                        .addComponent(makanan, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(minuman, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(obat, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        snackLayout.setVerticalGroup(
            snackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snackLayout.createSequentialGroup()
                .addGroup(snackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(obat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(minuman, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(makanan, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(snackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rentalLayout = new javax.swing.GroupLayout(rental);
        rental.setLayout(rentalLayout);
        rentalLayout.setHorizontalGroup(
            rentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(rentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(rentalLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(tujuan1)
                        .addGap(18, 18, 18)
                        .addComponent(TotalB, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(snack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(detail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rentalLayout.createSequentialGroup()
                            .addComponent(asal)
                            .addGap(12, 12, 12)
                            .addComponent(Casal, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tujuan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Ctujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        rentalLayout.setVerticalGroup(
            rentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(asal)
                        .addComponent(tujuan))
                    .addComponent(Ctujuan)
                    .addComponent(Casal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(detail, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalB)
                    .addComponent(tujuan1))
                .addGap(18, 18, 18)
                .addComponent(snack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        main.add(rental, "card2");

        navKatalog.setPreferredSize(new java.awt.Dimension(156, 600));

        hd.setBackground(new java.awt.Color(4, 28, 50));
        hd.setPreferredSize(new java.awt.Dimension(156, 100));
        hd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hdMouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/hd kecil.png"))); // NOI18N

        javax.swing.GroupLayout hdLayout = new javax.swing.GroupLayout(hd);
        hd.setLayout(hdLayout);
        hdLayout.setHorizontalGroup(
            hdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hdLayout.setVerticalGroup(
            hdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        medium.setBackground(new java.awt.Color(4, 28, 50));
        medium.setPreferredSize(new java.awt.Dimension(156, 100));
        medium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mediumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mediumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mediumMouseExited(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/medium bus kecil.png"))); // NOI18N

        javax.swing.GroupLayout mediumLayout = new javax.swing.GroupLayout(medium);
        medium.setLayout(mediumLayout);
        mediumLayout.setHorizontalGroup(
            mediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mediumLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap())
        );
        mediumLayout.setVerticalGroup(
            mediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mediumLayout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        bustoilet.setBackground(new java.awt.Color(4, 28, 50));
        bustoilet.setPreferredSize(new java.awt.Dimension(156, 100));
        bustoilet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bustoiletMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bustoiletMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bustoiletMouseExited(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/bis bus business toilet kecil.png"))); // NOI18N

        javax.swing.GroupLayout bustoiletLayout = new javax.swing.GroupLayout(bustoilet);
        bustoilet.setLayout(bustoiletLayout);
        bustoiletLayout.setHorizontalGroup(
            bustoiletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bustoiletLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bustoiletLayout.setVerticalGroup(
            bustoiletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bustoiletLayout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        shd.setBackground(new java.awt.Color(4, 28, 50));
        shd.setPreferredSize(new java.awt.Dimension(156, 100));
        shd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shdMouseExited(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/shd kecil.png"))); // NOI18N

        javax.swing.GroupLayout shdLayout = new javax.swing.GroupLayout(shd);
        shd.setLayout(shdLayout);
        shdLayout.setHorizontalGroup(
            shdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shdLayout.createSequentialGroup()
                .addComponent(jLabel22)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        shdLayout.setVerticalGroup(
            shdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        weha.setBackground(new java.awt.Color(4, 28, 50));
        weha.setPreferredSize(new java.awt.Dimension(156, 100));
        weha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wehaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wehaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wehaMouseExited(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/weha kecil.png"))); // NOI18N

        javax.swing.GroupLayout wehaLayout = new javax.swing.GroupLayout(weha);
        weha.setLayout(wehaLayout);
        wehaLayout.setHorizontalGroup(
            wehaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wehaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        wehaLayout.setVerticalGroup(
            wehaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wehaLayout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bigbus.setBackground(new java.awt.Color(4, 28, 50));
        bigbus.setPreferredSize(new java.awt.Dimension(156, 100));
        bigbus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bigbusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bigbusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bigbusMouseExited(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/big bus kecil.png"))); // NOI18N

        javax.swing.GroupLayout bigbusLayout = new javax.swing.GroupLayout(bigbus);
        bigbus.setLayout(bigbusLayout);
        bigbusLayout.setHorizontalGroup(
            bigbusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigbusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bigbusLayout.setVerticalGroup(
            bigbusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bigbusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout navKatalogLayout = new javax.swing.GroupLayout(navKatalog);
        navKatalog.setLayout(navKatalogLayout);
        navKatalogLayout.setHorizontalGroup(
            navKatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navKatalogLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(navKatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bustoilet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bigbus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        navKatalogLayout.setVerticalGroup(
            navKatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navKatalogLayout.createSequentialGroup()
                .addComponent(hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(medium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bustoilet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(shd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(weha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bigbus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainKatalog.setBackground(new java.awt.Color(4, 28, 50));
        mainKatalog.setPreferredSize(new java.awt.Dimension(544, 600));
        mainKatalog.setLayout(new java.awt.CardLayout());

        bus1.setBackground(new java.awt.Color(6, 70, 99));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/hd gede.png"))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel31.setForeground(java.awt.Color.white);
        jLabel31.setText("BUS HD");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/cd.png"))); // NOI18N
        jLabel33.setText("CD/DVD/USB PLAYER");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/karaoke.png"))); // NOI18N
        jLabel35.setText("MIC/KARAOKE");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/ac.png"))); // NOI18N
        jLabel37.setText("AC");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("27 SEAT");

        javax.swing.GroupLayout bus1Layout = new javax.swing.GroupLayout(bus1);
        bus1.setLayout(bus1Layout);
        bus1Layout.setHorizontalGroup(
            bus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bus1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(bus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel31)
                    .addGroup(bus1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel38))
                    .addGroup(bus1Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel37)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        bus1Layout.setVerticalGroup(
            bus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bus1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel33)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        mainKatalog.add(bus1, "card2");

        bus2.setBackground(new java.awt.Color(6, 70, 99));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/medium bus gede.png"))); // NOI18N

        jLabel39.setFont(new java.awt.Font("Bookman Old Style", 1, 48)); // NOI18N
        jLabel39.setForeground(java.awt.Color.white);
        jLabel39.setText("MEDIUM BUS");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/lcd.png"))); // NOI18N
        jLabel41.setText("LCD");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/cd.png"))); // NOI18N
        jLabel43.setText("CD/DVD/USB PLAYER");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/karaoke.png"))); // NOI18N
        jLabel45.setText("MIC/KARAOKE");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/ac.png"))); // NOI18N
        jLabel47.setText("AC");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/belt.png"))); // NOI18N
        jLabel49.setText("FULL SAFETY BELT");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/wifi.png"))); // NOI18N
        jLabel40.setText("WIFI");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/gps.png"))); // NOI18N
        jLabel42.setText("GPS");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("35 SEAT");

        javax.swing.GroupLayout bus2Layout = new javax.swing.GroupLayout(bus2);
        bus2.setLayout(bus2Layout);
        bus2Layout.setHorizontalGroup(
            bus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bus2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bus2Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel42))
                    .addComponent(jLabel26)
                    .addComponent(jLabel39)
                    .addGroup(bus2Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel47))
                    .addGroup(bus2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel44)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        bus2Layout.setVerticalGroup(
            bus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bus2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel43)
                    .addComponent(jLabel45)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel40)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        mainKatalog.add(bus2, "card3");

        bus3.setBackground(new java.awt.Color(6, 70, 99));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/bis bus business toilet gede.png"))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel32.setForeground(java.awt.Color.white);
        jLabel32.setText("BIG BUS BUSINESS");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/lcd.png"))); // NOI18N
        jLabel34.setText("LCD");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/cd.png"))); // NOI18N
        jLabel36.setText("CD/DVD/USB PLAYER");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/karaoke.png"))); // NOI18N
        jLabel46.setText("MIC/KARAOKE");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/ac.png"))); // NOI18N
        jLabel48.setText("AC");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/belt.png"))); // NOI18N
        jLabel50.setText("FULL SAFETY BELT");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/wifi.png"))); // NOI18N
        jLabel51.setText("WIFI");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/gps.png"))); // NOI18N
        jLabel52.setText("GPS");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/toilet.png"))); // NOI18N
        jLabel53.setText("TOILET");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/water-dispenser.png"))); // NOI18N
        jLabel54.setText("DISPENSER");

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/dining-table.png"))); // NOI18N
        jLabel55.setText("DINNING TABLE");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("20 SEAT");

        javax.swing.GroupLayout bus3Layout = new javax.swing.GroupLayout(bus3);
        bus3.setLayout(bus3Layout);
        bus3Layout.setHorizontalGroup(
            bus3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bus3Layout.createSequentialGroup()
                .addGroup(bus3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bus3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel27))
                    .addGroup(bus3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(bus3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addGroup(bus3Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel48))
                            .addGroup(bus3Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel53))
                            .addGroup(bus3Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel55))))
                    .addGroup(bus3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel56)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        bus3Layout.setVerticalGroup(
            bus3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bus3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bus3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel36)
                    .addComponent(jLabel46)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bus3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bus3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        mainKatalog.add(bus3, "card4");

        bus4.setBackground(new java.awt.Color(6, 70, 99));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/shd gede.png"))); // NOI18N

        jLabel57.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel57.setForeground(java.awt.Color.white);
        jLabel57.setText("SHD/HDD");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/lcd.png"))); // NOI18N
        jLabel58.setText("LCD");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/cd.png"))); // NOI18N
        jLabel59.setText("CD/DVD/USB PLAYER");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/karaoke.png"))); // NOI18N
        jLabel60.setText("MIC/KARAOKE");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/ac.png"))); // NOI18N
        jLabel61.setText("AC");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/belt.png"))); // NOI18N
        jLabel62.setText("FULL SAFETY BELT");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/wifi.png"))); // NOI18N
        jLabel63.setText("WIFI");

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/gps.png"))); // NOI18N
        jLabel64.setText("GPS");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("48 SEAT / 59 SEAT");

        javax.swing.GroupLayout bus4Layout = new javax.swing.GroupLayout(bus4);
        bus4.setLayout(bus4Layout);
        bus4Layout.setHorizontalGroup(
            bus4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bus4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(bus4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel57)
                    .addGroup(bus4Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel61))
                    .addGroup(bus4Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel64))
                    .addComponent(jLabel65))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        bus4Layout.setVerticalGroup(
            bus4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bus4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bus4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bus4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel65)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        mainKatalog.add(bus4, "card5");

        bus5.setBackground(new java.awt.Color(6, 70, 99));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/weha-one.png"))); // NOI18N

        jLabel66.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel66.setForeground(java.awt.Color.white);
        jLabel66.setText("WEHA ONE");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/lcd.png"))); // NOI18N
        jLabel67.setText("LCD");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/cd.png"))); // NOI18N
        jLabel68.setText("CD/DVD/USB PLAYER");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/karaoke.png"))); // NOI18N
        jLabel69.setText("MIC/KARAOKE");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/ac.png"))); // NOI18N
        jLabel70.setText("AC");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/belt.png"))); // NOI18N
        jLabel71.setText("FULL SAFETY BELT");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/wifi.png"))); // NOI18N
        jLabel72.setText("WIFI");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/gps.png"))); // NOI18N
        jLabel73.setText("GPS");

        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/toilet.png"))); // NOI18N
        jLabel74.setText("TOILET");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/pantry.png"))); // NOI18N
        jLabel75.setText("PANTRY");

        jLabel76.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/refrigerator.png"))); // NOI18N
        jLabel76.setText("REFRIGERATOR");

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/leather-seat.png"))); // NOI18N
        jLabel77.setText("LETHER SEAT");

        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/welcome-drink.png"))); // NOI18N
        jLabel78.setText("WELCOME DRINK");

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/massage-chair.png"))); // NOI18N
        jLabel79.setText("SOFA");

        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("15 SEAT");

        javax.swing.GroupLayout bus5Layout = new javax.swing.GroupLayout(bus5);
        bus5.setLayout(bus5Layout);
        bus5Layout.setHorizontalGroup(
            bus5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bus5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(bus5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79)
                    .addComponent(jLabel29)
                    .addComponent(jLabel66)
                    .addGroup(bus5Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel70))
                    .addGroup(bus5Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel75))
                    .addGroup(bus5Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel78))
                    .addComponent(jLabel80))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        bus5Layout.setVerticalGroup(
            bus5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bus5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bus5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bus5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bus5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLabel77)
                    .addComponent(jLabel78))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel80)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        mainKatalog.add(bus5, "card6");

        bus6.setBackground(new java.awt.Color(6, 70, 99));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/big bus gede.png"))); // NOI18N

        jLabel81.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel81.setForeground(java.awt.Color.white);
        jLabel81.setText("BIG BUS");

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/lcd.png"))); // NOI18N
        jLabel82.setText("LCD");

        jLabel83.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/karaoke.png"))); // NOI18N
        jLabel83.setText("MIC/KARAOKE");

        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/cd.png"))); // NOI18N
        jLabel84.setText("CD/DVD/USB PLAYER");

        jLabel85.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/ac.png"))); // NOI18N
        jLabel85.setText("AC");

        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/belt.png"))); // NOI18N
        jLabel86.setText("FULL SAFETY BELT");

        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/wifi.png"))); // NOI18N
        jLabel87.setText("WIFI");

        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/gps.png"))); // NOI18N
        jLabel88.setText("GPS");

        jLabel89.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("47 SEAT / 59 SEAT");

        javax.swing.GroupLayout bus6Layout = new javax.swing.GroupLayout(bus6);
        bus6.setLayout(bus6Layout);
        bus6Layout.setHorizontalGroup(
            bus6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bus6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(bus6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bus6Layout.createSequentialGroup()
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel85))
                    .addComponent(jLabel30)
                    .addComponent(jLabel81)
                    .addGroup(bus6Layout.createSequentialGroup()
                        .addComponent(jLabel86)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel88))
                    .addComponent(jLabel89))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        bus6Layout.setVerticalGroup(
            bus6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bus6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bus6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jLabel83)
                    .addComponent(jLabel84)
                    .addComponent(jLabel85))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bus6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jLabel87)
                    .addComponent(jLabel88))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel89)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        mainKatalog.add(bus6, "card7");

        first.setBackground(new java.awt.Color(25, 25, 25));

        jLabel90.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        jLabel90.setForeground(java.awt.Color.white);
        jLabel90.setText("Pilih BUS !");

        jLabel166.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        jLabel166.setForeground(java.awt.Color.white);
        jLabel166.setText("<---------- ");

        javax.swing.GroupLayout firstLayout = new javax.swing.GroupLayout(first);
        first.setLayout(firstLayout);
        firstLayout.setHorizontalGroup(
            firstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firstLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(firstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel166, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(76, 76, 76))
        );
        firstLayout.setVerticalGroup(
            firstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel166)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        mainKatalog.add(first, "card8");

        javax.swing.GroupLayout katalogLayout = new javax.swing.GroupLayout(katalog);
        katalog.setLayout(katalogLayout);
        katalogLayout.setHorizontalGroup(
            katalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(katalogLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(navKatalog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainKatalog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        katalogLayout.setVerticalGroup(
            katalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(katalogLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(katalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navKatalog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainKatalog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        main.add(katalog, "card5");

        Shop.setBackground(new java.awt.Color(236, 219, 186));

        food.setBackground(new java.awt.Color(140, 192, 222));
        food.setPreferredSize(new java.awt.Dimension(233, 100));
        food.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                foodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                foodMouseExited(evt);
            }
        });

        jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/makanan.png"))); // NOI18N

        javax.swing.GroupLayout foodLayout = new javax.swing.GroupLayout(food);
        food.setLayout(foodLayout);
        foodLayout.setHorizontalGroup(
            foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
            .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(foodLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel172)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        foodLayout.setVerticalGroup(
            foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(foodLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel172)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        drug.setBackground(new java.awt.Color(223, 120, 97));
        drug.setPreferredSize(new java.awt.Dimension(233, 100));
        drug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drugMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                drugMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                drugMouseExited(evt);
            }
        });

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/obat.png"))); // NOI18N

        javax.swing.GroupLayout drugLayout = new javax.swing.GroupLayout(drug);
        drug.setLayout(drugLayout);
        drugLayout.setHorizontalGroup(
            drugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
            .addGroup(drugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(drugLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel92)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        drugLayout.setVerticalGroup(
            drugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(drugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(drugLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel92)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        drink.setBackground(new java.awt.Color(44, 51, 51));
        drink.setPreferredSize(new java.awt.Dimension(233, 100));
        drink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                drinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                drinkMouseExited(evt);
            }
        });

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/minuman.png"))); // NOI18N

        javax.swing.GroupLayout drinkLayout = new javax.swing.GroupLayout(drink);
        drink.setLayout(drinkLayout);
        drinkLayout.setHorizontalGroup(
            drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
            .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(drinkLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel91)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        drinkLayout.setVerticalGroup(
            drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(drinkLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel91)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout navshopLayout = new javax.swing.GroupLayout(navshop);
        navshop.setLayout(navshopLayout);
        navshopLayout.setHorizontalGroup(
            navshopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navshopLayout.createSequentialGroup()
                .addComponent(food, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(drink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(drug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        navshopLayout.setVerticalGroup(
            navshopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navshopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(navshopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(food, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drug, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        mainshop.setBackground(new java.awt.Color(236, 219, 186));
        mainshop.setLayout(new java.awt.CardLayout());

        m.setBackground(java.awt.Color.black);

        jLabel94.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel94.setText("Pop Mie Mini 35gr");

        jLabel95.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel95.setText("Rp. 7,000,00");

        jPanel31.setPreferredSize(new java.awt.Dimension(123, 123));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/popmini.png"))); // NOI18N

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel31Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel93)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel31Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel93)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94)
                            .addComponent(jLabel95))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel95)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel97.setText("Pop Mie Original 75gr");

        jLabel98.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel98.setText("Rp. 10,000,00");

        jPanel33.setPreferredSize(new java.awt.Dimension(123, 123));

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/pop.png"))); // NOI18N

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel33Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel96)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel33Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel96)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel97)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel98)
                        .addGap(59, 59, 59)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/nasi paket (1).png"))); // NOI18N

        jLabel100.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel100.setText("Nasi Paket Ayam");

        jLabel101.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel101.setText("Rp. 25,000,00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel101)
                    .addComponent(jLabel100)
                    .addComponent(jLabel99))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/nasi goreng (1).png"))); // NOI18N

        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel103.setText("Nasi Goreng ");

        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel104.setText("Rp. 25,000,00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel104)
                    .addComponent(jLabel103)
                    .addComponent(jLabel102))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel102)
                .addGap(18, 18, 18)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel104)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout mLayout = new javax.swing.GroupLayout(m);
        m.setLayout(mLayout);
        mLayout.setHorizontalGroup(
            mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        mLayout.setVerticalGroup(
            mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        mainshop.add(m, "card2");

        mi.setBackground(java.awt.Color.black);

        jPanel6.setPreferredSize(new java.awt.Dimension(203, 215));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel106.setText("Air Mineral 600ml");

        jLabel107.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel107.setText("Rp. 5,000,00");

        jPanel32.setPreferredSize(new java.awt.Dimension(168, 123));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/aqua.png"))); // NOI18N

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel32Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel105)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel32Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel105)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel107)
                    .addComponent(jLabel106))
                .addGap(65, 65, 65))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel107)
                .addGap(20, 20, 20))
        );

        jPanel7.setPreferredSize(new java.awt.Dimension(203, 215));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel109.setText("Teh Pucuk 350ml ");

        jLabel110.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel110.setText("Rp. 5,000,00");

        jPanel34.setPreferredSize(new java.awt.Dimension(168, 123));

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/pucuk.png"))); // NOI18N

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
            .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel34Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel111)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
            .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel34Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel111)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel110)
                    .addComponent(jLabel109))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel110)
                .addGap(30, 30, 30))
        );

        jPanel8.setPreferredSize(new java.awt.Dimension(203, 215));

        jLabel112.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel112.setText("Pocari Sweet 350ml");

        jLabel113.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel113.setText("Rp. 7,000,00");

        jPanel35.setPreferredSize(new java.awt.Dimension(168, 123));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/pocari.png"))); // NOI18N

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel35Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel114)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel35Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel114)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel113)
                    .addComponent(jLabel112))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel113)
                .addGap(24, 24, 24))
        );

        jPanel9.setPreferredSize(new java.awt.Dimension(203, 215));

        jLabel115.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel115.setText("Golda 200ml");

        jLabel116.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel116.setText("Rp. 5,000,00");

        jPanel36.setPreferredSize(new java.awt.Dimension(168, 123));

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/golda.png"))); // NOI18N

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
            .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel36Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel108)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
            .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel36Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel108)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel115)
                    .addComponent(jLabel116)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel116)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout miLayout = new javax.swing.GroupLayout(mi);
        mi.setLayout(miLayout);
        miLayout.setHorizontalGroup(
            miLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(miLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(miLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        miLayout.setVerticalGroup(
            miLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(miLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainshop.add(mi, "card3");

        o.setBackground(java.awt.Color.black);

        jPanel10.setPreferredSize(new java.awt.Dimension(203, 215));

        jLabel118.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel118.setText("Tolak Angin");

        jLabel119.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel119.setText("Rp. 3,000,00/pcs");

        jPanel37.setPreferredSize(new java.awt.Dimension(168, 123));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/to.png"))); // NOI18N

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
            .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel37Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel117)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
            .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel37Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel117)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel119)
                    .addComponent(jLabel118))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel119)
                .addGap(24, 24, 24))
        );

        jPanel11.setPreferredSize(new java.awt.Dimension(203, 215));

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/freshcare (1).png"))); // NOI18N

        jLabel121.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel121.setText("FreshCare Hot");

        jLabel122.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel122.setText("Rp. 12,000,00");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel122)
                    .addComponent(jLabel121)
                    .addComponent(jLabel120))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel120)
                .addGap(18, 18, 18)
                .addComponent(jLabel121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel122)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel12.setPreferredSize(new java.awt.Dimension(203, 215));

        jLabel129.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel129.setText("Antimo");

        jLabel130.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel130.setText("Rp. 2,000,00");

        jPanel38.setPreferredSize(new java.awt.Dimension(168, 123));

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/antimo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
            .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel38Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel123)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
            .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel38Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel123)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel130)
                    .addComponent(jLabel129))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel129)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel130)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel13.setPreferredSize(new java.awt.Dimension(203, 215));

        jLabel127.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel127.setText("Minyak Kayu Putih 200ml");

        jLabel128.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel128.setText("Rp. 38,000,00");

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/kayu putih (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel128)
                    .addComponent(jLabel127)
                    .addComponent(jLabel126))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel126)
                .addGap(18, 18, 18)
                .addComponent(jLabel127)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel128)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout oLayout = new javax.swing.GroupLayout(o);
        o.setLayout(oLayout);
        oLayout.setHorizontalGroup(
            oLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(oLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(oLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        oLayout.setVerticalGroup(
            oLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(oLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        mainshop.add(o, "card4");

        javax.swing.GroupLayout ShopLayout = new javax.swing.GroupLayout(Shop);
        Shop.setLayout(ShopLayout);
        ShopLayout.setHorizontalGroup(
            ShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navshop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainshop, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        ShopLayout.setVerticalGroup(
            ShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShopLayout.createSequentialGroup()
                .addComponent(mainshop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(navshop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        main.add(Shop, "card6");

        footer.setBackground(new java.awt.Color(0, 0, 0));
        footer.setPreferredSize(new java.awt.Dimension(700, 214));

        jLabel125.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel125.setForeground(java.awt.Color.white);
        jLabel125.setText("INFORMASI");

        jLabel131.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel131.setForeground(java.awt.Color.white);
        jLabel131.setText("Unduh Aplikasi");

        jLabel132.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel132.setForeground(java.awt.Color.white);
        jLabel132.setText("PEMBAYARAN");

        jLabel133.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel133.setForeground(java.awt.Color.white);
        jLabel133.setText("JL. Anggrek Rosliana No. 40B ");

        jLabel138.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel138.setForeground(java.awt.Color.white);
        jLabel138.setText("Hotline:");

        jLabel139.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel139.setForeground(java.awt.Color.white);
        jLabel139.setText("Reservasi +62 89606812454");

        jLabel140.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel140.setForeground(java.awt.Color.white);
        jLabel140.setText("Tentang Kami");

        jLabel141.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel141.setForeground(java.awt.Color.white);
        jLabel141.setText("Cara Pemesanan");

        jLabel142.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel142.setForeground(java.awt.Color.white);
        jLabel142.setText("Info Pembayaran");

        jLabel143.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel143.setForeground(java.awt.Color.white);
        jLabel143.setText("Syarat & Ketentuan");

        jLabel144.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel144.setForeground(java.awt.Color.white);
        jLabel144.setText("Kebijakan Privasi");

        jPanel15.setPreferredSize(new java.awt.Dimension(100, 2));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel16.setPreferredSize(new java.awt.Dimension(100, 2));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel21.setPreferredSize(new java.awt.Dimension(100, 56));

        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/about.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel158)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel158)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel22.setPreferredSize(new java.awt.Dimension(57, 30));

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/bca.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel152)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel152)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel23.setPreferredSize(new java.awt.Dimension(57, 30));

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/bni.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel154)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel154)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/gopay.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel153)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel153)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel25.setPreferredSize(new java.awt.Dimension(57, 30));

        jLabel155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/ovo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel155)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel155)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/shopeepay.jpg"))); // NOI18N
        jLabel156.setToolTipText("");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel156)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel156)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel27.setPreferredSize(new java.awt.Dimension(57, 30));

        jLabel157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/dana.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel157)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel157)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel28.setPreferredSize(new java.awt.Dimension(100, 2));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/app.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel159)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel159)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/fb.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel29Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel160)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel29Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel160)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/instagram.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel30Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel161)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel30Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel161)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel162.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel162.setForeground(java.awt.Color.white);
        jLabel162.setText("WindBreaker_Travel");

        jLabel163.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel163.setForeground(java.awt.Color.white);
        jLabel163.setText("WindBreaker_Travel");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel138)
                        .addComponent(jLabel139)
                        .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                    .addGroup(footerLayout.createSequentialGroup()
                        .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel162)
                            .addComponent(jLabel163))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel144)
                    .addComponent(jLabel125)
                    .addComponent(jLabel140)
                    .addComponent(jLabel141)
                    .addComponent(jLabel142)
                    .addComponent(jLabel143)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(footerLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel132)
                    .addGroup(footerLayout.createSequentialGroup()
                        .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(footerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel133))
                    .addGroup(footerLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(footerLayout.createSequentialGroup()
                                .addComponent(jLabel131)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(footerLayout.createSequentialGroup()
                                    .addComponent(jLabel138)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel139)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(footerLayout.createSequentialGroup()
                                            .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(footerLayout.createSequentialGroup()
                                            .addComponent(jLabel162)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel163))))
                                .addGroup(footerLayout.createSequentialGroup()
                                    .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel132)
                                        .addComponent(jLabel125))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(22, 22, 22)
                                    .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(footerLayout.createSequentialGroup()
                                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(footerLayout.createSequentialGroup()
                                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(footerLayout.createSequentialGroup()
                                            .addComponent(jLabel140)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel141)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel142)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel143)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel144))))))))
                .addGap(17, 17, Short.MAX_VALUE))
        );

        head.setBackground(java.awt.Color.white);
        head.setPreferredSize(new java.awt.Dimension(700, 386));

        jLabel124.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel124.setText("Mengapa Harus Memilih Bus Wind Breaker Ini Untuk Perjalanan Anda?");

        jPanel17.setPreferredSize(new java.awt.Dimension(113, 112));

        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/garansi.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel149)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel149)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel18.setPreferredSize(new java.awt.Dimension(113, 112));

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/best price.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel134)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel134)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/operator.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel150)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel150)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel20.setPreferredSize(new java.awt.Dimension(113, 112));

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/pelayanan.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel151)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel151)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel135.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel135.setText("Secure Online Transaction");

        jLabel136.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel136.setText("Guaranteed");

        jLabel137.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel137.setText("Wind Breaker Best Price ");

        jLabel145.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel145.setText("Guaranteed");

        jLabel146.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel146.setText("Safe and Easy Online");

        jLabel147.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel147.setText("Payment");

        jLabel148.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel148.setText("24/7 Customer Service");

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headLayout.createSequentialGroup()
                        .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel135)
                            .addGroup(headLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel136))
                            .addGroup(headLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel137)
                            .addGroup(headLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel145)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel147))
                            .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel146, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(39, 39, 39)
                        .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel124))
                .addGap(29, 29, 29))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel124)
                .addGap(47, 47, 47)
                .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headLayout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel135)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel136))
                    .addGroup(headLayout.createSequentialGroup()
                        .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headLayout.createSequentialGroup()
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel146))
                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(headLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel148)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel147))
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel137)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel145)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AboutLayout = new javax.swing.GroupLayout(About);
        About.setLayout(AboutLayout);
        AboutLayout.setHorizontalGroup(
            AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );
        AboutLayout.setVerticalGroup(
            AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutLayout.createSequentialGroup()
                .addComponent(head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        main.add(About, "card7");

        jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/tiket.jpg"))); // NOI18N

        jPanel43.setBackground(java.awt.Color.white);
        jPanel43.setPreferredSize(new java.awt.Dimension(194, 244));

        jPanel44.setBackground(java.awt.Color.white);
        jPanel44.setPreferredSize(new java.awt.Dimension(150, 150));

        jLabel170.setBackground(java.awt.Color.white);
        jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/foto/claim.png"))); // NOI18N

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel44Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel170)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
            .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel44Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel170)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel167.setText("Nama          :");

        jLabel168.setText("Paket           :");

        jLabel169.setText("Kode Bus    :");

        Tkode.setToolTipText("");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel168)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tpaket, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel167)
                        .addGap(18, 18, 18)
                        .addComponent(Tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel169)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tkode, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(Tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tpaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel168)))
                    .addComponent(jLabel167))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel169))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        print.setBackground(new java.awt.Color(25, 25, 25));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });

        jLabel171.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel171.setForeground(java.awt.Color.white);
        jLabel171.setText("PRINT");

        javax.swing.GroupLayout printLayout = new javax.swing.GroupLayout(print);
        print.setLayout(printLayout);
        printLayout.setHorizontalGroup(
            printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel171)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        printLayout.setVerticalGroup(
            printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tiketLayout = new javax.swing.GroupLayout(tiket);
        tiket.setLayout(tiketLayout);
        tiketLayout.setHorizontalGroup(
            tiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tiketLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(tiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tiketLayout.createSequentialGroup()
                        .addComponent(jLabel165)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        tiketLayout.setVerticalGroup(
            tiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tiketLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(tiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel165, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        main.add(tiket, "card8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashActionPerformed
        if (cash.isSelected()){
            Plainnya.setEnabled(false);
            Plainnya.setSelectedItem("Pilih");
            Pesan.setEnabled(true);
        }
        else{
            Pesan.setEnabled(false);
        }
        
    }//GEN-LAST:event_cashActionPerformed

    private void lainnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lainnyaActionPerformed
        Plainnya.setEnabled(true);
        Plainnya.setSelectedItem("Pilih");
        Pesan.setEnabled(false);
        
    }//GEN-LAST:event_lainnyaActionPerformed

    private void PminiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PminiActionPerformed
        if (Pmini.isSelected()){
            String b = Pmini.getText();
            fb.setMakanan(b);
            fb.getMakanan();
            fb.SeleksiMakanan();
            Tpmini.setEnabled(true);
            Btm.setEnabled(true); 
            Tpmini.requestFocus();
        }
        else{
            Ttotalm.setText("0.0");
            Tpmini.setText("0");
            Tpmini.setEnabled(false);
            fb.PMReset();
        }
    }//GEN-LAST:event_PminiActionPerformed

    private void NkatalogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NkatalogMouseEntered
        setcolor(Nkatalog);
    }//GEN-LAST:event_NkatalogMouseEntered

    private void NkatalogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NkatalogMouseExited
        resetcolor(Nkatalog);
    }//GEN-LAST:event_NkatalogMouseExited

    private void NhomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhomeMouseEntered
        setcolor(Nhome);
    }//GEN-LAST:event_NhomeMouseEntered

    private void NhomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhomeMouseExited
        resetcolor(Nhome);
    }//GEN-LAST:event_NhomeMouseExited

    private void NaboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NaboutMouseEntered
        setcolor(Nabout);
    }//GEN-LAST:event_NaboutMouseEntered

    private void NaboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NaboutMouseExited
        resetcolor(Nabout);
    }//GEN-LAST:event_NaboutMouseExited

    private void NrentalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NrentalMouseEntered
        setcolor(Nrental);
    }//GEN-LAST:event_NrentalMouseEntered

    private void NrentalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NrentalMouseExited
        resetcolor(Nrental);
    }//GEN-LAST:event_NrentalMouseExited

    private void NshopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NshopMouseEntered
        setcolor(Nshop);
    }//GEN-LAST:event_NshopMouseEntered

    private void NshopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NshopMouseExited
        resetcolor(Nshop);
    }//GEN-LAST:event_NshopMouseExited

    private void NhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhomeMouseClicked
        main.removeAll();
        main.repaint();
        main.revalidate();

        main.add(home);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_NhomeMouseClicked

    private void NrentalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NrentalMouseClicked
        main.removeAll();
        main.repaint();
        main.revalidate();

        main.add(rental);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_NrentalMouseClicked

    private void TtotalmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtotalmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtotalmActionPerformed

    private void TotalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalBActionPerformed


    }//GEN-LAST:event_TotalBActionPerformed

    private void HtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HtotalActionPerformed

    private void paketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paketActionPerformed
        fb.setLama(paket.getSelectedItem().toString());
        fb.setpaket(paket.getSelectedItem().toString());
        Tpaket.setText(fb.getpaket());
        codebus.setEnabled(true);
        codebus.setSelectedItem("Pilih");
        TotalB.setText("0.0");
        Tjbeli.setText("0");
        Tjbeli.setEnabled(false);
        Nama.setText("");
        Nama.setEnabled(false);
    }//GEN-LAST:event_paketActionPerformed

    private void CasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasalActionPerformed
        fb.setAsal(Casal.getSelectedItem().toString());
        Tjbeli.setText("0");
        Tjbeli.setEnabled(false);
        Nama.setText("");
        Nama.setEnabled(false);
        Ctujuan.setSelectedItem("Pilih");
        Ctujuan.setEnabled(true);
        pergi.setEnabled(false);
        Ppergi.setEnabled(false);
        paket.setEnabled(false);
        codebus.setEnabled(false);
        cash.setEnabled(false);
        lainnya.setEnabled(false);
        CaraBayar.clearSelection();
        Booking.setEnabled(true);
    }//GEN-LAST:event_CasalActionPerformed

    private void codebusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codebusActionPerformed
        fb.setKodebus(codebus.getSelectedItem().toString());
        fb.settkode(codebus.getSelectedItem().toString());
        Tkode.setText(fb.gettkode());
        fb.setSeleksiBtotal1();
        Tjbeli.setText("0");
        Tjbeli.setEnabled(false);
        Nama.setEnabled(true);
        Nama.requestFocus();
    }//GEN-LAST:event_codebusActionPerformed

    private void pergiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pergiActionPerformed
        if (pergi.isSelected()){
            String b = pergi.getText();
            fb.setPergi(b);
            fb.getPergi();
            TotalB.setText(fb.getPergi());
        }
        else{
            TotalB.setText("0.0");
        }
        
        codebus.setEnabled(true);
        codebus.setSelectedItem("Pilih");
        paket.setEnabled(false);
        paket.setSelectedItem("Pilih");
        Tjbeli.setText("0");
        Tjbeli.setEnabled(false);
        Nama.setText("");
        Nama.setEnabled(false);
    }//GEN-LAST:event_pergiActionPerformed

    private void CtujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtujuanActionPerformed
        fb.setTujuan(Ctujuan.getSelectedItem().toString());
        pergi.setEnabled(true);
        Ppergi.setEnabled(true);
        Dradio.clearSelection();
        Tjbeli.setText("0");
        Tjbeli.setEnabled(false);
        Nama.setText("");
        Nama.setEnabled(false);
        codebus.setEnabled(false);
        paket.setEnabled(false);
        
    }//GEN-LAST:event_CtujuanActionPerformed

    private void PpergiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PpergiActionPerformed
        if (Ppergi.isSelected()){
            String b = Ppergi.getText();
            fb.setPergi(b);
            fb.getPergi();
            TotalB.setText(fb.getPergi());
        }
        else{
            TotalB.setText("0.0");
            
        }
        
        paket.setEnabled(true);
        paket.setSelectedItem("Pilih");
        codebus.setEnabled(false);
        TotalB.setText("0.0");
        Tjbeli.setText("0");
        Tjbeli.setEnabled(false);
        Nama.setText("");
        Nama.setEnabled(false);
    }//GEN-LAST:event_PpergiActionPerformed

    private void BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BersihActionPerformed
        bersih();
        fb.MReset();
        fb.MiReset();
        fb.OReset();
        fb.TBReset();

    }//GEN-LAST:event_BersihActionPerformed

    private void NexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NexitMouseEntered
        setcolor(Nexit);
    }//GEN-LAST:event_NexitMouseEntered

    private void NexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NexitMouseExited
        resetcolor(Nexit);
    }//GEN-LAST:event_NexitMouseExited

    private void NexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NexitMouseClicked
        int tutup;
        
        tutup = JOptionPane.showConfirmDialog(null, "Terima Kasih atas Kunjungannya", "konfirmasi", JOptionPane.YES_NO_OPTION);
        if (tutup==JOptionPane.YES_NO_OPTION){
            dispose();
        }
        
        else{
            return;
        }
    }//GEN-LAST:event_NexitMouseClicked

    private void PmieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PmieActionPerformed
        if (Pmie.isSelected()){
            String b = Pmie.getText();
            fb.setMakanan(b);
            fb.getMakanan();
            fb.SeleksiMakanan();
            Tpmie.setEnabled(true);
            Btm.setEnabled(true);
            Tpmie.requestFocus();
        }
        else{
            Ttotalm.setText("0.0");
            Tpmie.setText("0");
            Tpmie.setEnabled(false);
            fb.POReset();
        }
        
    }//GEN-LAST:event_PmieActionPerformed

    private void TpmieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TpmieKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fb.setJHm1(Integer.parseInt(Tpmie.getText()));
            fb.getTotal1();
            Btm.requestFocus();
        }
        else{
            Ttotalm.setText("0.0");
        }
    }//GEN-LAST:event_TpmieKeyPressed

    private void TpminiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TpminiKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fb.setJHm2(Integer.parseInt(Tpmini.getText()));
            fb.getTotal2();
            Btm.requestFocus();
        }
        else{
            Ttotalm.setText("0.0");
        }
    }//GEN-LAST:event_TpminiKeyPressed

    private void NpaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NpaketActionPerformed
        if (Npaket.isSelected()){
            String b = Npaket.getText();
            fb.setMakanan(b);
            fb.getMakanan();
            fb.SeleksiMakanan();
            Tnpaket.setEnabled(true);
            Btm.setEnabled(true);
            Tnpaket.requestFocus();
        }
        else{
            Ttotalm.setText("0.0");
            Tnpaket.setText("0");
            Tnpaket.setEnabled(false);
            fb.NPReset();
        }
    }//GEN-LAST:event_NpaketActionPerformed

    private void TnpaketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TnpaketKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fb.setJHm3(Integer.parseInt(Tnpaket.getText()));
            fb.getTotal3();
            Btm.requestFocus();
        }
        else{
            Ttotalm.setText("0.0");
        }
    }//GEN-LAST:event_TnpaketKeyPressed

    private void NgorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgorengActionPerformed
        if (Ngoreng.isSelected()){
            String b = Ngoreng.getText();
            fb.setMakanan(b);
            fb.getMakanan();
            fb.SeleksiMakanan();
            Tngoreng.setEnabled(true);
            Btm.setEnabled(true);
            Tngoreng.requestFocus();
        }
        else{
            Ttotalm.setText("0.0");
            Tngoreng.setText("0");
            Tngoreng.setEnabled(false);
            fb.NGReset();
        }
    }//GEN-LAST:event_NgorengActionPerformed

    private void TngorengKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TngorengKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fb.setJHm4(Integer.parseInt(Tngoreng.getText()));
            fb.getTotal4();
            Btm.requestFocus();
       }
        else{
            Ttotalm.setText("0.0");
        }
    }//GEN-LAST:event_TngorengKeyPressed

    private void AmineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmineralActionPerformed
        if (Amineral.isSelected()){
            String b = Amineral.getText();
            fb.setMinuman(b);
            fb.getMinuman();
            fb.SeleksiMinuman();
            Tamineral.setEnabled(true);
            Btmi.setEnabled(true);
            Tamineral.requestFocus();
        }
        else{
            Ttotalmi.setText("0.0");
            Tamineral.setText("0");
            Tamineral.setEnabled(false);
            fb.AMReset();
        }
    }//GEN-LAST:event_AmineralActionPerformed

    private void BtmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmiActionPerformed
        Ttotalmi.setText(dc.format(fb.getTotalMi()));
        Htotal.setText(dc.format(fb.getHtotal()));
        Htotal.setText(dc.format(fb.getTotalM()));
        Htotal.setText(dc.format(fb.getTotalMi()));
        Htotal.setText(dc.format(fb.getTotalO()));
        Htotal.setText(dc.format(fb.getTotalSemua()));
        Booking.setEnabled(true);
    }//GEN-LAST:event_BtmiActionPerformed

    private void TamineralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamineralKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fb.setJHmi1(Integer.parseInt(Tamineral.getText()));
            fb.getTotalmi1();
            Btmi.requestFocus();
        }
        else{
            Ttotalmi.setText("0.0");
        }
    }//GEN-LAST:event_TamineralKeyPressed

    private void TgcoffeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TgcoffeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fb.setJHmi2(Integer.parseInt(Tgcoffe.getText()));
            fb.getTotalmi2();
            Btmi.requestFocus();
        }
        else{
            Ttotalmi.setText("0.0");
        }
    }//GEN-LAST:event_TgcoffeKeyPressed

    private void GcoffeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GcoffeActionPerformed
        if (Gcoffe.isSelected()){
            String b = Gcoffe.getText();
            fb.setMinuman(b);
            fb.getMinuman();
            fb.SeleksiMinuman();
            Tgcoffe.setEnabled(true);
            Btmi.setEnabled(true);
            Tgcoffe.requestFocus();
        }
        else{
            Ttotalmi.setText("0.0");
            Tgcoffe.setText("0");
            Tgcoffe.setEnabled(false);
            fb.GFReset();
        }
    }//GEN-LAST:event_GcoffeActionPerformed

    private void TpucukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TpucukActionPerformed
        if (Tpucuk.isSelected()){
            String b = Tpucuk.getText();
            fb.setMinuman(b);
            fb.getMinuman();
            fb.SeleksiMinuman();
            Ttpucuk.setEnabled(true);
            Btmi.setEnabled(true);
            Ttpucuk.requestFocus();
        }
        else{
            Ttotalmi.setText("0.0");
            Ttpucuk.setText("0");
            Ttpucuk.setEnabled(false);
            fb.TPReset();
        }
    }//GEN-LAST:event_TpucukActionPerformed

    private void TtpucukKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TtpucukKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fb.setJHmi3(Integer.parseInt(Ttpucuk.getText()));
            fb.getTotalmi3();
            Btmi.requestFocus();
        }
        else{
            Ttotalmi.setText("0.0");
        }
    }//GEN-LAST:event_TtpucukKeyPressed

    private void BtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmActionPerformed
        Ttotalm.setText(dc.format(fb.getTotalM()));
        Htotal.setText(dc.format(fb.getHtotal()));
        Htotal.setText(dc.format(fb.getTotalM()));
        Htotal.setText(dc.format(fb.getTotalMi()));
        Htotal.setText(dc.format(fb.getTotalO()));
        Htotal.setText(dc.format(fb.getTotalSemua()));
        Booking.setEnabled(true);
    }//GEN-LAST:event_BtmActionPerformed

    private void PocariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PocariActionPerformed
        if (Pocari.isSelected()){
            String b = Pocari.getText();
            fb.setMinuman(b);
            fb.getMinuman();
            fb.SeleksiMinuman();
            Tpocari.setEnabled(true);
            Btmi.setEnabled(true);
            Tpocari.requestFocus();
        }
        else{
            Ttotalmi.setText("0.0");
            Tpocari.setText("0");
            Tpocari.setEnabled(false);
            fb.PSReset();
        }
    }//GEN-LAST:event_PocariActionPerformed

    private void TpocariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TpocariKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fb.setJHmi4(Integer.parseInt(Tpocari.getText()));
            fb.getTotalmi4();
            Btmi.requestFocus();
        }
        else{
            Ttotalmi.setText("0.0");
        }
    }//GEN-LAST:event_TpocariKeyPressed

    private void TpocariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TpocariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TpocariActionPerformed

    private void TanginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TanginActionPerformed
        if (Tangin.isSelected()){
            String b = Tangin.getText();
            fb.setObat(b);
            fb.getObat();
            fb.SeleksiObat();
            Ttangin.setEnabled(true);
            Bto.setEnabled(true);
            Ttangin.requestFocus();
        }
        else{
            Ttotalo.setText("0.0");
            Ttangin.setText("0");
            Ttangin.setEnabled(false);
            fb.FOReset();
        }
    }//GEN-LAST:event_TanginActionPerformed

    private void FcareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FcareActionPerformed
        if (Fcare.isSelected()){
            String b = Fcare.getText();
            fb.setObat(b);
            fb.getObat();
            fb.SeleksiObat();
            Tfcare.setEnabled(true);
            Bto.setEnabled(true);
            Tfcare.requestFocus();
        }
        else{
            Ttotalo.setText("0.0");
            Tfcare.setText("0");
            Tfcare.setEnabled(false);
            fb.FOReset();
        }
    }//GEN-LAST:event_FcareActionPerformed

    private void AntimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AntimoActionPerformed
        if (Antimo.isSelected()){
            String b = Antimo.getText();
            fb.setObat(b);
            fb.getObat();
            fb.SeleksiObat();
            Tantimo.setEnabled(true);
            Bto.setEnabled(true);
            Tantimo.requestFocus();
        }
        else{
            Ttotalo.setText("0.0");
            Tantimo.setText("0");
            Tantimo.setEnabled(false);
            fb.ANReset();
        }
    }//GEN-LAST:event_AntimoActionPerformed

    private void MkputihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MkputihActionPerformed
        if (Mkputih.isSelected()){
            String b = Mkputih.getText();
            fb.setObat(b);
            fb.getObat();
            fb.SeleksiObat();
            Tmkputih.setEnabled(true);
            Bto.setEnabled(true);
            Tmkputih.requestFocus();
        }
        else{
            Ttotalo.setText("0.0");
            Tmkputih.setText("0");
            Tmkputih.setEnabled(false);
            fb.MPReset();
        }
    }//GEN-LAST:event_MkputihActionPerformed

    private void TtanginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TtanginKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fb.setJHmo1(Integer.parseInt(Ttangin.getText()));
            fb.getTotalo1();
            Bto.requestFocus();
            
        }
        else{
            Ttotalo.setText("0.0");
        }
    }//GEN-LAST:event_TtanginKeyPressed

    private void TfcareKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TfcareKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fb.setJHmo2(Integer.parseInt(Tfcare.getText()));
            fb.getTotalo2();
            Bto.requestFocus();
        }
        else{
            Ttotalo.setText("0.0");
        }
    }//GEN-LAST:event_TfcareKeyPressed

    private void TantimoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TantimoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fb.setJHmo3(Integer.parseInt(Tantimo.getText()));
            fb.getTotalo3();
            Bto.requestFocus();
        }
        else{
            Ttotalo.setText("0.0");
        }
    }//GEN-LAST:event_TantimoKeyPressed

    private void TmkputihKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TmkputihKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fb.setJHmo4(Integer.parseInt(Tmkputih.getText()));
            fb.getTotalo4();
            Bto.requestFocus();
        }
        else{
            Ttotalo.setText("0.0");
        }
    }//GEN-LAST:event_TmkputihKeyPressed

    private void BtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoActionPerformed
        Ttotalo.setText(dc.format(fb.getTotalO()));
        Htotal.setText(dc.format(fb.getHtotal()));
        Htotal.setText(dc.format(fb.getTotalM()));
        Htotal.setText(dc.format(fb.getTotalMi()));
        Htotal.setText(dc.format(fb.getTotalO()));
        Htotal.setText(dc.format(fb.getTotalSemua()));
        Booking.setEnabled(true);
    }//GEN-LAST:event_BtoActionPerformed

    private void TjbeliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TjbeliKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fb.setJbeli(Integer.parseInt(Tjbeli.getText()));
            TotalB.setText(dc.format(fb.getHtotal()));
            Htotal.setText(dc.format(fb.getHtotal()));
            
        }
        else{
            TotalB.setText("0.0");
        }
    }//GEN-LAST:event_TjbeliKeyPressed

    private void BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingActionPerformed
        Htotal.setText(dc.format(fb.getHtotal()));
        Htotal.setText(dc.format(fb.getTotalM()));
        Htotal.setText(dc.format(fb.getTotalMi()));
        Htotal.setText(dc.format(fb.getTotalO()));
        Htotal.setText(dc.format(fb.getTotalSemua()));
        cash.setEnabled(true);
        lainnya.setEnabled(true);
        CaraBayar.clearSelection();
    }//GEN-LAST:event_BookingActionPerformed

    private void PesanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesanMouseClicked
        main.removeAll();
        main.repaint();
        main.revalidate();

        main.add(tiket);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_PesanMouseClicked

    private void NkatalogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NkatalogMouseClicked
        main.removeAll();
        mainKatalog.removeAll();
        main.repaint();
        main.revalidate();

        main.add(katalog);
        mainKatalog.add(first);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_NkatalogMouseClicked

    private void hdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hdMouseExited
        resetcolormainKatalog(hd);
    }//GEN-LAST:event_hdMouseExited

    private void hdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hdMouseEntered
        setcolormainKatalog(hd);
    }//GEN-LAST:event_hdMouseEntered

    private void hdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hdMouseClicked
        mainKatalog.removeAll();
        mainKatalog.repaint();
        mainKatalog.revalidate();

        mainKatalog.add(bus1);
        mainKatalog.repaint();
        mainKatalog.revalidate();
    }//GEN-LAST:event_hdMouseClicked

    private void mediumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mediumMouseClicked
        mainKatalog.removeAll();
        mainKatalog.repaint();
        mainKatalog.revalidate();

        mainKatalog.add(bus2);
        mainKatalog.repaint();
        mainKatalog.revalidate();
    }//GEN-LAST:event_mediumMouseClicked

    private void mediumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mediumMouseEntered
        setcolormainKatalog(medium);
    }//GEN-LAST:event_mediumMouseEntered

    private void mediumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mediumMouseExited
        resetcolormainKatalog(medium);
    }//GEN-LAST:event_mediumMouseExited

    private void bustoiletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bustoiletMouseClicked
        mainKatalog.removeAll();
        mainKatalog.repaint();
        mainKatalog.revalidate();

        mainKatalog.add(bus3);
        mainKatalog.repaint();
        mainKatalog.revalidate();
    }//GEN-LAST:event_bustoiletMouseClicked

    private void bustoiletMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bustoiletMouseEntered
        setcolormainKatalog(bustoilet);
    }//GEN-LAST:event_bustoiletMouseEntered

    private void bustoiletMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bustoiletMouseExited
        resetcolormainKatalog(bustoilet);
    }//GEN-LAST:event_bustoiletMouseExited

    private void shdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shdMouseClicked
        mainKatalog.removeAll();
        mainKatalog.repaint();
        mainKatalog.revalidate();

        mainKatalog.add(bus4);
        mainKatalog.repaint();
        mainKatalog.revalidate();
    }//GEN-LAST:event_shdMouseClicked

    private void shdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shdMouseEntered
        setcolormainKatalog(shd);
    }//GEN-LAST:event_shdMouseEntered

    private void shdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shdMouseExited
        resetcolormainKatalog(shd);
    }//GEN-LAST:event_shdMouseExited

    private void wehaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wehaMouseClicked
        mainKatalog.removeAll();
        mainKatalog.repaint();
        mainKatalog.revalidate();

        mainKatalog.add(bus5);
        mainKatalog.repaint();
        mainKatalog.revalidate();
    }//GEN-LAST:event_wehaMouseClicked

    private void wehaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wehaMouseEntered
        setcolormainKatalog(weha);
    }//GEN-LAST:event_wehaMouseEntered

    private void wehaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wehaMouseExited
        resetcolormainKatalog(weha);
    }//GEN-LAST:event_wehaMouseExited

    private void bigbusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bigbusMouseClicked
        mainKatalog.removeAll();
        mainKatalog.repaint();
        mainKatalog.revalidate();

        mainKatalog.add(bus6);
        mainKatalog.repaint();
        mainKatalog.revalidate();
    }//GEN-LAST:event_bigbusMouseClicked

    private void bigbusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bigbusMouseEntered
        setcolormainKatalog(bigbus);
    }//GEN-LAST:event_bigbusMouseEntered

    private void bigbusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bigbusMouseExited
        resetcolormainKatalog(bigbus);
    }//GEN-LAST:event_bigbusMouseExited

    private void NshopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NshopMouseClicked
        main.removeAll();
        main.repaint();
        main.revalidate();

        main.add(Shop);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_NshopMouseClicked

    private void foodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodMouseClicked
        mainshop.removeAll();
        mainshop.repaint();
        mainshop.revalidate();

        mainshop.add(m);
        mainshop.repaint();
        mainshop.revalidate();
    }//GEN-LAST:event_foodMouseClicked

    private void drinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinkMouseClicked
        mainshop.removeAll();
        mainshop.repaint();
        mainshop.revalidate();

        mainshop.add(mi);
        mainshop.repaint();
        mainshop.revalidate();
    }//GEN-LAST:event_drinkMouseClicked

    private void drugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drugMouseClicked
        mainshop.removeAll();
        mainshop.repaint();
        mainshop.revalidate();

        mainshop.add(o);
        mainshop.repaint();
        mainshop.revalidate();
    }//GEN-LAST:event_drugMouseClicked

    private void NaboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NaboutMouseClicked
        main.removeAll();
        main.repaint();
        main.revalidate();

        main.add(About);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_NaboutMouseClicked

    private void NamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NamaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fb.setNama(Nama.getText());
            Tnama.setText(fb.getNama());
            Tjbeli.setEnabled(true);
            Tjbeli.requestFocus();
            
        }
        else{
            TotalB.setText("0.0");
        }
    }//GEN-LAST:event_NamaKeyPressed

    private void PlainnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlainnyaActionPerformed
        Pesan.setEnabled(true);
    }//GEN-LAST:event_PlainnyaActionPerformed

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        main.removeAll();
        main.repaint();
        main.revalidate();

        main.add(home);
        main.repaint();
        main.revalidate();
    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        setcolor(print);
    }//GEN-LAST:event_printMouseEntered

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        resetcolor(print);
    }//GEN-LAST:event_printMouseExited

    private void drinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinkMouseEntered
        setcolorminuman(drink);
    }//GEN-LAST:event_drinkMouseEntered

    private void drinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinkMouseExited
        resetcolorminuman(drink);
    }//GEN-LAST:event_drinkMouseExited

    private void drugMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drugMouseEntered
        setcolorobat(drug);
    }//GEN-LAST:event_drugMouseEntered

    private void drugMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drugMouseExited
        resetcolorobat(drug);
    }//GEN-LAST:event_drugMouseExited

    private void foodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodMouseEntered
        setcolormakanan(food);
    }//GEN-LAST:event_foodMouseEntered

    private void foodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodMouseExited
        resetcolormakanan(food);
    }//GEN-LAST:event_foodMouseExited

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
            java.util.logging.Logger.getLogger(GUI_UAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_UAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_UAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_UAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_UAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel About;
    private javax.swing.JRadioButton Amineral;
    private javax.swing.JRadioButton Antimo;
    private javax.swing.JButton Bersih;
    private javax.swing.JButton Booking;
    private javax.swing.JButton Btm;
    private javax.swing.JButton Btmi;
    private javax.swing.JButton Bto;
    private javax.swing.ButtonGroup CaraBayar;
    private javax.swing.JComboBox<String> Casal;
    private javax.swing.JComboBox<String> Ctujuan;
    private javax.swing.ButtonGroup Dradio;
    private javax.swing.JRadioButton Fcare;
    private javax.swing.JRadioButton Gcoffe;
    private javax.swing.JTextField Htotal;
    private javax.swing.JRadioButton Mkputih;
    private javax.swing.JPanel Nabout;
    private javax.swing.JTextField Nama;
    private javax.swing.JPanel Nexit;
    private javax.swing.JRadioButton Ngoreng;
    private javax.swing.JPanel Nhome;
    private javax.swing.JPanel Nkatalog;
    private javax.swing.JRadioButton Npaket;
    private javax.swing.JPanel Nrental;
    private javax.swing.JPanel Nshop;
    private javax.swing.JButton Pesan;
    private javax.swing.JComboBox<String> Plainnya;
    private javax.swing.JRadioButton Pmie;
    private javax.swing.JRadioButton Pmini;
    private javax.swing.JRadioButton Pocari;
    private javax.swing.JRadioButton Ppergi;
    private javax.swing.JPanel Shop;
    private javax.swing.JTextField Tamineral;
    private javax.swing.JRadioButton Tangin;
    private javax.swing.JTextField Tantimo;
    private javax.swing.JTextField Tfcare;
    private javax.swing.JTextField Tgcoffe;
    private javax.swing.JTextField Tjbeli;
    private javax.swing.JTextField Tkode;
    private javax.swing.JTextField Tmkputih;
    private javax.swing.JTextField Tnama;
    private javax.swing.JTextField Tngoreng;
    private javax.swing.JTextField Tnpaket;
    private javax.swing.JTextField TotalB;
    private javax.swing.JTextField Tpaket;
    private javax.swing.JTextField Tpmie;
    private javax.swing.JTextField Tpmini;
    private javax.swing.JTextField Tpocari;
    private javax.swing.JRadioButton Tpucuk;
    private javax.swing.JTextField Ttangin;
    private javax.swing.JTextField Ttotalm;
    private javax.swing.JTextField Ttotalmi;
    private javax.swing.JTextField Ttotalo;
    private javax.swing.JTextField Ttpucuk;
    private javax.swing.JLabel asal;
    private javax.swing.JPanel bigbus;
    private javax.swing.JPanel bus1;
    private javax.swing.JPanel bus2;
    private javax.swing.JPanel bus3;
    private javax.swing.JPanel bus4;
    private javax.swing.JPanel bus5;
    private javax.swing.JPanel bus6;
    private javax.swing.JPanel bustoilet;
    private javax.swing.JRadioButton cash;
    private javax.swing.JComboBox<String> codebus;
    private javax.swing.JPanel detail;
    private javax.swing.JPanel drink;
    private javax.swing.JPanel drug;
    private javax.swing.JPanel first;
    private javax.swing.JPanel food;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel hd;
    private javax.swing.JPanel head;
    private javax.swing.JPanel home;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jumlah;
    private javax.swing.JPanel katalog;
    private javax.swing.JRadioButton lainnya;
    private javax.swing.JPanel m;
    private javax.swing.JPanel main;
    private javax.swing.JPanel mainKatalog;
    private javax.swing.JPanel mainshop;
    private javax.swing.JPanel makanan;
    private javax.swing.JPanel medium;
    private javax.swing.JPanel mi;
    private javax.swing.JPanel minuman;
    private javax.swing.JPanel nav;
    private javax.swing.JPanel navKatalog;
    private javax.swing.JPanel navshop;
    private javax.swing.JPanel o;
    private javax.swing.JPanel obat;
    private javax.swing.JComboBox<String> paket;
    private javax.swing.JPanel pembayaran;
    private javax.swing.JRadioButton pergi;
    private javax.swing.JPanel print;
    private javax.swing.JPanel rental;
    private javax.swing.JPanel shd;
    private javax.swing.JPanel snack;
    private javax.swing.JPanel tiket;
    private javax.swing.JLabel tujuan;
    private javax.swing.JLabel tujuan1;
    private javax.swing.JPanel weha;
    // End of variables declaration//GEN-END:variables
}
