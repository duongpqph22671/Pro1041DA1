/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.KhuyenMai;
import QLKhuyenMai.KhuyenMaiService;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import view.FormKhuyenMai;

/**
 *
 * @author DELL
 */
public class FormKhuyenMai extends javax.swing.JPanel {

    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("Vi", "VN"));
    private final KhuyenMaiService data = new KhuyenMaiService();
    private List<KhuyenMai> khuyenMaiList;
    int index;

    public FormKhuyenMai() {
        initComponents();
        fillTable();
    }

    private void fillTable() {
        DefaultTableModel dtm = (DefaultTableModel) this.tblKhuyenMai.getModel();
        dtm.setRowCount(0);
        for (KhuyenMai km : data.getAll()) {
            Object[] rowData = {
                km.getId_CTKM_HoaDon(),
                km.getTenCTKM(),
                km.getSoLuong(),
                currencyFormat.format(km.getGiaTriGiam()),
                currencyFormat.format(km.getHoaDonToiThieu()),
                km.getNgayBatDau(),
                km.getNgayKetThuc(),
                km.getTrangThai() ? "CON HAN" : "HET HAN",};
            dtm.addRow(rowData);
        }
    }

    private KhuyenMai check() {
        String ten = txtTen.getText();
        int giaTriGiam = Integer.parseInt(txtGiaTriGiam.getText());
        Date ngayBatDau = txtNgayBatDau.getDate();
        Date ngayKetThuc = txtNgayKetThuc.getDate();
        int soLuong = Integer.parseInt(txtSoLuong.getText());
        float hoaDonToiThieu = Float.parseFloat(txt_hoaDonToiThieu.getText());
        KhuyenMai km = new KhuyenMai();
        km.setTenCTKM(ten);
        km.setGiaTriGiam(giaTriGiam);
        km.setSoLuong(soLuong);
        km.setNgayBatDau(ngayBatDau);
        km.setNgayKetThuc(ngayKetThuc);
        km.setHoaDonToiThieu(hoaDonToiThieu);
        return km;
    }

    private KhuyenMai checkUpdate() {

        int ma = Integer.parseInt(txtMa.getText());
        String ten = txtTen.getText();
        int giaTriGiam = Integer.parseInt(txtGiaTriGiam.getText());
        int soLuong = Integer.parseInt(txtSoLuong.getText());
        Date ngayBatDau = txtNgayBatDau.getDate();
        Date ngayKetThuc = txtNgayKetThuc.getDate();
        float hoaDonToiThieu = Float.parseFloat(txt_hoaDonToiThieu.getText());
        KhuyenMai km = new KhuyenMai();
        km.setSoLuong(soLuong);
        km.setId_CTKM_HoaDon(ma);
        km.setTenCTKM(ten);
        km.setGiaTriGiam(giaTriGiam);
        km.setNgayBatDau(ngayBatDau);
        km.setNgayKetThuc(ngayKetThuc);
        km.setHoaDonToiThieu(hoaDonToiThieu);

        return km;
    }

    void ShowError(String tieude, String noidung) {
        JOptionPane.showMessageDialog(this, noidung, tieude, JOptionPane.ERROR_MESSAGE);
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
        btnadd = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        txtMa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rdoConHan = new javax.swing.JRadioButton();
        txtTen = new javax.swing.JTextField();
        rdoHetHan = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhuyenMai = new javax.swing.JTable();
        txtGiaTriGiam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_hoaDonToiThieu = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));

        btnadd.setText("THEM");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnsua.setText("SUA");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("QUAN LY KHUYEN MAI");

        jLabel7.setText("NGAY BAT DAU");

        jLabel2.setText("MA");

        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        txtMa.setEditable(false);
        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });

        jLabel8.setText("TRANG THAI");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("TIM KIEM"));

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setText("TEN");

        buttonGroup1.add(rdoConHan);
        rdoConHan.setText("Con han");
        rdoConHan.setEnabled(false);

        buttonGroup1.add(rdoHetHan);
        rdoHetHan.setText("Het han");
        rdoHetHan.setEnabled(false);

        jLabel4.setText("GIA TRI GIAM");

        tblKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MA", "TEN", "SO LUONG", "GIA TRI GIAM", "Hoa Don Toi Thieu", "NGAY BAT DAU", "NGAY KET THUC", "TRANG THAI"
            }
        ));
        tblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhuyenMaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhuyenMai);

        jLabel5.setText("SO LUONG");

        jLabel9.setText("NGAY KET THUC");

        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        jLabel6.setText("Hoa Don Toi Thieu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGiaTriGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoConHan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoHetHan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnadd)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnsua)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnclear)))
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel9)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_hoaDonToiThieu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGiaTriGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_hoaDonToiThieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoHetHan)
                    .addComponent(rdoConHan)
                    .addComponent(jLabel8))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadd)
                            .addComponent(btnsua)
                            .addComponent(btnclear))
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String name = txtTen.getText().strip();
        String soLuong = txtSoLuong.getText().trim();
        String giaTriGiam = txtGiaTriGiam.getText().trim();
        String hoaDonToiThieu = txt_hoaDonToiThieu.getText().trim();
        Date ngayBatDau = txtNgayBatDau.getDate();
        Date ngayKetThuc = txtNgayKetThuc.getDate();
        if (ngayBatDau == null || ngayKetThuc == null) {
            ShowError("lỗi", "Ngày bắt đầu và ngày kết thúc không được để trống ");
            return;
        }
        if (ngayBatDau.before(new Date())) {
            ShowError("lỗi", "Ngày bắt đầu phải sau ngày hiện tại ");
            return;
        }
        if (ngayBatDau.after(ngayKetThuc)) {
            ShowError("lỗi", "Ngày bắt đầu phải trước ngày kết thúc ");
            return;
        }
     
        if (giaTriGiam.isEmpty()) {
            ShowError("lỗi", "không được bỏ trống giá trị ");
            return;
        }
        if (hoaDonToiThieu.isEmpty()) {
            ShowError("lỗi", "không được bỏ trống hóa đơn tối thiểu");
            return;
        }
        if (soLuong.isEmpty()) {
            ShowError("lỗi", "không được bỏ trống số lượng");
            return;
        }
        try {
            int checkSL = Integer.parseInt(soLuong);
            if (checkSL < 0) {
                ShowError("lỗi", "Số lượng lớn hơn 0");
                return;
            }
        } catch (Exception e) {
            ShowError("lỗi", "Số lượng là kiểu số");
            return;
        }

        try {
            int checkGiaTri = Integer.parseInt(giaTriGiam);
            if (checkGiaTri < 0) {
                ShowError("lỗi", "Giá trị giảm lớn hơn 0");
                return;
            }
        } catch (Exception e) {
            ShowError("lỗi", "Giá trị giảm là kiểu số");
            return;
        }

        try {
            int checkHoaDonToiThieu = Integer.parseInt(hoaDonToiThieu);
            if (checkHoaDonToiThieu < 0) {
                ShowError("lỗi", "Hóa đơn tối thiểu lớn hơn 0");
                return;
            }
        } catch (Exception e) {
            ShowError("lỗi", "Hóa đơn tối thiểu  là kiểu số");
            return;
        }
        if (name.isEmpty()) {
            ShowError("lỗi", "không được bỏ trống tên");
            return;
        }

        if (Integer.parseInt(hoaDonToiThieu) <= Integer.parseInt(giaTriGiam)) {
            JOptionPane.showMessageDialog(this, "Giá Trị Giảm Phải Bé Hơn Hóa Đơn Tối Thiểu");
            return;
        }

        KhuyenMai km = check();
        if (km == null) {
            return;
        }
        data.addKhuyenMai(km);
        fillTable();
        btnclearActionPerformed(evt);
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        int row = tblKhuyenMai.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chon dong can sua");
            return;
        }
        String name = txtTen.getText().strip();
        String soLuong = txtSoLuong.getText().trim();
        String giaTriGiam = txtGiaTriGiam.getText().trim();
        String hoaDonToiThieu = txt_hoaDonToiThieu.getText().trim();
        Date ngayBatDau = txtNgayBatDau.getDate();
        Date ngayKetThuc = txtNgayKetThuc.getDate();
        if (ngayBatDau == null || ngayKetThuc == null) {
            ShowError("lỗi", "Ngày bắt đầu và ngày kết thúc không được để trống ");
            return;
        }
        if (ngayBatDau.after(ngayKetThuc)) {
            ShowError("lỗi", "Ngày bắt đầu phải trước ngày kết thúc ");
            return;
        }
        if (giaTriGiam.isEmpty()) {
            ShowError("lỗi", "không được bỏ trống giá trị ");
            return;
        }
        if (hoaDonToiThieu.isEmpty()) {
            ShowError("lỗi", "không được bỏ trống hóa đơn tối thiểu");
            return;
        }
        if (soLuong.isEmpty()) {
            ShowError("lỗi", "không được bỏ trống số lượng");
            return;
        }
        try {
            int checkSL = Integer.parseInt(soLuong);
            if (checkSL < 0) {
                ShowError("lỗi", "Số lượng lớn hơn 0");
                return;
            }
        } catch (Exception e) {
            ShowError("lỗi", "Số lượng là kiểu số");
            return;
        }

        try {
            int checkGiaTri = Integer.parseInt(giaTriGiam);
            if (checkGiaTri < 0) {
                ShowError("lỗi", "Giá trị giảm lớn hơn 0");
                return;
            }
        } catch (Exception e) {
            ShowError("lỗi", "Giá trị giảm là kiểu số");
            return;
        }

        try {
            double checkHoaDonToiThieu = Double.parseDouble(hoaDonToiThieu);
            if (checkHoaDonToiThieu < 0) {
                ShowError("lỗi", "Hóa đơn tối thiểu lớn hơn 0");
                return;
            }
        } catch (Exception e) {
            ShowError("lỗi", "Hóa đơn tối thiểu  là kiểu số");
            return;
        }
        if (name.isEmpty()) {
            ShowError("lỗi", "không được bỏ trống tên");
            return;
        }

        if (Double.parseDouble(hoaDonToiThieu) <= Integer.parseInt(giaTriGiam)) {
            JOptionPane.showMessageDialog(this, "Giá Trị Giảm Phải Bé Hơn Hóa Đơn Tối Thiểu");
            return;
        }

        KhuyenMai km = checkUpdate();
        if (km == null) {
            return;
        }
        data.updateKhuyenMai(row, km);
        fillTable();
        btnclearActionPerformed(evt);
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtMa.setText("");
        txtTen.setText("");
        txtNgayBatDau.setDate(new Date());
        txtNgayKetThuc.setDate(new Date());
        txtSoLuong.setText("");
        txtGiaTriGiam.setText("");
        txt_hoaDonToiThieu.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        ArrayList<KhuyenMai> ds = data.search(txtTimKiem.getText());
        DefaultTableModel dtm = (DefaultTableModel) this.tblKhuyenMai.getModel();
        dtm.setRowCount(0);
        for (KhuyenMai km : ds) {
            Object[] rowData = {
                km.getId_CTKM_HoaDon(),
                km.getTenCTKM(),
                km.getSoLuong(),
                km.getGiaTriGiam(),
                km.getHoaDonToiThieu(),
                km.getNgayBatDau(),
                km.getNgayKetThuc(),
                km.getTrangThai() ? "CON HAN" : "HET HAN",};
            dtm.addRow(rowData);
        }
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void tblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhuyenMaiMouseClicked
        int row = tblKhuyenMai.getSelectedRow();

        //        KhuyenMai km = khuyenMaiList.get(row);
        String giaTriGiam = tblKhuyenMai.getValueAt(row, 3).toString().replaceAll("[^0-9]", "");
        String hoaDonToiThieu = tblKhuyenMai.getValueAt(row, 4).toString().replaceAll("[^0-9]", "");
        txtMa.setText(tblKhuyenMai.getValueAt(row, 0).toString());
        txtTen.setText(tblKhuyenMai.getValueAt(row, 1).toString());
        txtGiaTriGiam.setText(giaTriGiam);
        txtSoLuong.setText(tblKhuyenMai.getValueAt(row, 2).toString());
        txt_hoaDonToiThieu.setText(hoaDonToiThieu);
        Date ngayBatDau = (Date) tblKhuyenMai.getValueAt(row, 5);
        Date ngayKetThuc = (Date) tblKhuyenMai.getValueAt(row, 6);
        txtNgayBatDau.setDate(ngayBatDau);
        txtNgayKetThuc.setDate(ngayKetThuc);
        if (tblKhuyenMai.getValueAt(row, 7).equals("CON HAN")) {
            rdoConHan.setSelected(true);
        } else {
            rdoHetHan.setSelected(true);
        }

    }//GEN-LAST:event_tblKhuyenMaiMouseClicked

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed

    }//GEN-LAST:event_txtSoLuongActionPerformed

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
            java.util.logging.Logger.getLogger(FormKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKhuyenMai().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsua;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoConHan;
    private javax.swing.JRadioButton rdoHetHan;
    private javax.swing.JTable tblKhuyenMai;
    private javax.swing.JTextField txtGiaTriGiam;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txt_hoaDonToiThieu;
    // End of variables declaration//GEN-END:variables
}