/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import com.models.KhuyenMai;
import com.repositories.IKhuyenMaiRepository;
import com.repositories.impl.KhuyenMaiRepository;
import com.services.IChiTietSPService;
import com.services.IKhuyenMaiService;
import com.services.impl.ChiTietSPService;
import com.services.impl.KhuyenMaiService;
import com.viewModel.ChiTietSPViewModel;
import com.viewModel.KhuyenMaiViewModel;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Admin
 */
public class Khuyen_Mai extends javax.swing.JPanel {
    DefaultTableModel defaultTableModel;
    DefaultTableModel defaultTableModel1;
    private IKhuyenMaiService khuyenmaiService;
    IChiTietSPService chiTietSPServices;
    

    /**
     * Creates new form San_Pham
     */
   

    public Khuyen_Mai() {
        initComponents();
        defaultTableModel = (DefaultTableModel) tblKhuyenMai.getModel();
        defaultTableModel1 = (DefaultTableModel) tblSPKM.getModel();
        khuyenmaiService = new KhuyenMaiService();
        chiTietSPServices = new ChiTietSPService();
        khuyenmaiService.UpdateTT();
        khuyenmaiService.UpdateTT2();
        LoadData();
        LoadDataSP();
       
    }
    
    void LoadData() {
        defaultTableModel.setRowCount(0);
        int stt = 1;
        for (KhuyenMaiViewModel x : khuyenmaiService.GetALL()) {
            defaultTableModel.addRow(new Object[]{
                stt,
                x.getTenKM(),
                x.getNgayBatDau(),
                x.getNgayKetThuc(),
                String.format("%.0f", x.getGiaTriGiam()) + " " + x.getHinhThucKM(),
                x.getTrangthai() == 0 ? "Còn hạn" : "Hết hạn"
            });
            stt++;
        }
    }

    void LoadDataSP() {
        defaultTableModel1.setRowCount(0);
        for (ChiTietSPViewModel x : chiTietSPServices.GetAll()) {
            defaultTableModel1.addRow(new Object[]{
                false,
                x.getMa(),
                x.getTen()
            });
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtKM = new javax.swing.JTextField();
        txtMucGiam = new javax.swing.JTextField();
        txtNgayBD = new javax.swing.JTextField();
        txtNgayKT = new javax.swing.JTextField();
        rdoVND = new javax.swing.JRadioButton();
        rdoPhanTram = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSPKM = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cbbHang = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKhuyenMai = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        timKiem = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1124, 666));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1124, 666));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(814, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý khuyến mãi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Tạo khuyến mãi"));

        jLabel2.setText("Tên KM");

        jLabel3.setText("Mức giảm(%)");

        jLabel4.setText("Ngày bắt đầu");

        jLabel5.setText("Ngày kết thúc");

        jLabel6.setText("Hình thức thanh toán");

        rdoVND.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rdoVND);
        rdoVND.setSelected(true);
        rdoVND.setText("VNĐ");
        rdoVND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoVNDActionPerformed(evt);
            }
        });

        rdoPhanTram.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rdoPhanTram);
        rdoPhanTram.setText("%");

        btnThem.setText("Lưu");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");

        jButton4.setText("Mới");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(rdoVND)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(rdoPhanTram, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMucGiam)
                            .addComponent(txtKM)
                            .addComponent(txtNgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(txtNgayBD))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtMucGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoVND)
                        .addComponent(rdoPhanTram)))
                .addGap(47, 47, 47)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Sản phẩm áp dụng"));

        tblSPKM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Select", "Mã sản phẩm", "Tên sản phẩm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSPKM);

        jLabel7.setText("Hãng");

        cbbHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbHangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(cbbHang, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbbHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách khuyến mãi"));

        tblKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên khuyến mãi", "Ngày bắt đầu", "Ngày kết thúc", "Giá trị giảm", "Trạng thái"
            }
        ));
        tblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhuyenMaiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblKhuyenMai);

        jLabel8.setText("Tìm kiếm");

        timKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                timKiemCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1124, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbbHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbHangMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbbHangMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        Pattern p = Pattern.compile("^[0-9]+$");
        try {
            if (txtKM.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên khuyến mãi");
                return;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            if (txtKM.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn ngày bắt đầu");
                return;
            }
        } catch (Exception e) {
        }
        try {
            if (txtKM.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn ngày kết thúc");
                return;
            }
        } catch (Exception e) {
        }
        try {
            if (!rdoVND.isSelected() && !rdoPhanTram.isSelected()) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn hình thức giảm giá");
                return;
            }
        } catch (Exception e) {
        }

        try {
            if (txtMucGiam.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập giá trị giảm");
                return;
            }
        } catch (Exception e) {
        }

        try {
            Integer.valueOf(txtMucGiam.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá trị giảm phải là số!");
            return;
        }

        
        if (p.matcher(txtKM.getText()).find() == true) {
            JOptionPane.showMessageDialog(this, "Tên không được nhập số");
            return;
        }
        if (txtKM.getText().length() > 50) {
            JOptionPane.showMessageDialog(this, "Tên không được quá 50 kí tự");
            return;
        }
        if (khuyenmaiService.checktrung(txtKM.getText()) != null) {
            JOptionPane.showMessageDialog(this, "Tên khuyến mãi đã tồn tại");
            return;
        }
        
             if (rdoPhanTram.isSelected()) {
            if (Integer.parseInt(txtMucGiam.getText().trim()) >= 100) {
                JOptionPane.showMessageDialog(this, "Giá trị khuyến mãi phải nhỏ hơn 100% !!!");
                return;
            }
        }
             
                 if (Integer.parseInt(txtMucGiam.getText().trim()) < 0) {
                JOptionPane.showMessageDialog(this, "Giá trị khuyến mãi không được phép âm");
                return;
            }
                 if (Integer.parseInt(txtMucGiam.getText().trim()) == 0) {
                JOptionPane.showMessageDialog(this, "Bạn phải nhập giá trị khuyến mãi lớn hơn 0");
                return;
            }
        
        IKhuyenMaiRepository repository = new KhuyenMaiRepository();
        List<KhuyenMai> lst = repository.GetAll();
        long time = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(time);

        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?", "Add", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            KhuyenMaiViewModel km = new KhuyenMaiViewModel();
            km.setTenKM(txtKM.getText());
            km.setTenKM(txtNgayBD.getText());
            km.setTenKM(txtNgayKT.getText());
            if (rdoVND.isSelected()) {
                km.setHinhThucKM("VND");
            } else if (rdoPhanTram.isSelected()) {
                km.setHinhThucKM("%");
            }
            km.setGiaTriGiam(Double.parseDouble(txtMucGiam.getText()));
            khuyenmaiService.Add(km);
            LoadData();
            if (date.before(chiTietSPServices.checkngay(lst.get(lst.size() - 1).getID()))) {
                JOptionPane.showMessageDialog(this, "khuyến mãi chưa đến ngày áp dụng vui lòng xem và chọn khuyến mãi khác");
                return;
            }
            for (int i = 0; i < tblSPKM.getRowCount(); i++) {
                boolean ischeckbox = (boolean) tblSPKM.getValueAt(i, 0);
                if (ischeckbox) {
                    System.out.println(tblSPKM.getValueAt(i, 1));
                    chiTietSPServices.Update(lst.get(lst.size() - 1).getID(), tblSPKM.getValueAt(i, 1).toString());
                }
            }
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void tblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhuyenMaiMouseClicked
        // TODO add your handling code here:
        int r = tblKhuyenMai.getSelectedRow();
            txtKM.setText((String) tblKhuyenMai.getValueAt(r, 1));
//            txt_giatrgiam.setText((String) tb_khuyenmai.getValueAt(r, 4));
            txtNgayBD.setText((String) tblKhuyenMai.getValueAt(r, 2));
            txtNgayKT.setText((String) tblKhuyenMai.getValueAt(r, 3));
            String hinhthuc = tblKhuyenMai.getValueAt(r, 4).toString();
            String giatri = tblKhuyenMai.getValueAt(r, 4).toString();
            if (hinhthuc.contains("%")) {
                rdoPhanTram.setSelected(true);
            } else if (hinhthuc.contains("VND")) {
                rdoVND.setSelected(true);
            }
            if (giatri.contains("%")) {
                int index = giatri.indexOf("%");
                txtMucGiam.setText(giatri.substring(0, index).trim());
            } else if (giatri.contains("VND")) {
                int index = giatri.indexOf("VND");
                txtMucGiam.setText(giatri.substring(0, index).trim());
            }
    }//GEN-LAST:event_tblKhuyenMaiMouseClicked

    private void rdoVNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoVNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoVNDActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        txtKM.setText("");
        txtMucGiam.setText("");
        txtNgayBD.setText("");
        txtNgayKT.setText("");
        buttonGroup1.clearSelection();
        timKiem.setText("");
        khuyenmaiService.UpdateTT();
        khuyenmaiService.UpdateTT2();
        LoadData();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void timKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_timKiemCaretUpdate
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        int stt = 1;
        for (KhuyenMaiViewModel x : khuyenmaiService.GetOnebyten("%" + timKiem.getText() + "%")) {
            defaultTableModel.addRow(new Object[]{
                stt,
                x.getTenKM(),
                x.getNgayBatDau(),
                x.getNgayKetThuc(),
                String.format("%.0f", x.getGiaTriGiam()) + " " + x.getHinhThucKM(),
                x.getTrangthai() == 0 ? "Còn hạn" : "Hết hạn"
            });
            stt++;
        }
    }//GEN-LAST:event_timKiemCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbHang;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdoPhanTram;
    private javax.swing.JRadioButton rdoVND;
    private javax.swing.JTable tblKhuyenMai;
    private javax.swing.JTable tblSPKM;
    private javax.swing.JTextField timKiem;
    private javax.swing.JTextField txtKM;
    private javax.swing.JTextField txtMucGiam;
    private javax.swing.JTextField txtNgayBD;
    private javax.swing.JTextField txtNgayKT;
    // End of variables declaration//GEN-END:variables

}
