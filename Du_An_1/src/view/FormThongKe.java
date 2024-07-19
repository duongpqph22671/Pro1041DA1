package view;

import Model.BanHangGioHang;
import Model.HoaDonModel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import Model.ThongKeSanPham;
import Service_ThongKe.QLThongKeSanPham;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class FormThongKe extends javax.swing.JPanel {

    private final QLThongKeSanPham data = new QLThongKeSanPham();
    DecimalFormat df = new DecimalFormat("###,###,###");
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
    public FormThongKe() {
        initComponents();
        fillTable();
    }

    void fillTable() {
        DefaultTableModel dtm = (DefaultTableModel) this.tblDoanhThuSP.getModel();
        dtm.setRowCount(0);
        for (ThongKeSanPham tksp : data.getAll()) {
            Object[] rowData = {
                tksp.getTenSP(),
                tksp.getSoLuong(),
                tksp.getTongTien()
            };
            dtm.addRow(rowData);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dcFrom = new com.toedter.calendar.JDateChooser();
        dcTo = new com.toedter.calendar.JDateChooser();
        btnTim = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblDoanhThu = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTongDonDaBan = new javax.swing.JLabel();
        lblTongSanPhamDaBan = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoanhThuSP = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("TIM KIEM"));

        jLabel1.setText("TU NGAY");

        jLabel2.setText("DEN");

        btnTim.setText("TIM");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addComponent(dcTo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dcFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnTim)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTim)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DOANH THU"));

        jLabel3.setText("DOANH THU");

        lblDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDoanhThu.setText("000000000");

        jLabel7.setText("TONG DON DA BAN");

        jLabel8.setText("SO LUONG SAN PHAM DA BAN");

        lblTongDonDaBan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTongDonDaBan.setText("000000000");

        lblTongSanPhamDaBan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTongSanPhamDaBan.setText("000000000");

        jButton1.setText("XUAT PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lblTongDonDaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTongSanPhamDaBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoanhThu)
                    .addComponent(lblTongSanPhamDaBan))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTongDonDaBan)
                    .addComponent(jButton1))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("DOANH THU SAN PHAM"));

        tblDoanhThuSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "TEN SAN PHAM", "SO LUONG DA BAN", "TONG TIEN"
            }
        ));
        jScrollPane2.setViewportView(tblDoanhThuSP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        Date startDate = dcFrom.getDate();
        Date endDate = dcTo.getDate();
        if (validateInput(startDate, endDate)) {
            ArrayList<ThongKeSanPham> ds = data.theoCBO(startDate, endDate);
            DefaultTableModel dtm = (DefaultTableModel) this.tblDoanhThuSP.getModel();
            dtm.setRowCount(0);
            for (ThongKeSanPham tksp : ds) {
                Object[] rowData = {
                    tksp.getTenSP(),
                    tksp.getSoLuong(),
                    tksp.getTongTien()
                };
                dtm.addRow(rowData);
            }

            int tongSoLuong = 0;
            for (int i = 0; i < tblDoanhThuSP.getRowCount(); i++) {
                int soLuong = Integer.parseInt(tblDoanhThuSP.getValueAt(i, 1).toString());
                tongSoLuong += soLuong;
            }
            lblTongSanPhamDaBan.setText("" + tongSoLuong);

            int tongDoanhThu = 0;
            for (int i = 0; i < tblDoanhThuSP.getRowCount(); i++) {
                double doanhThu = Double.parseDouble(tblDoanhThuSP.getValueAt(i, 2).toString());
                tongDoanhThu += doanhThu;
            }
            String formattedNumber = df.format(tongDoanhThu);
            lblDoanhThu.setText("" + formattedNumber + " VND");
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Date startDate = dcFrom.getDate();
        Date endDate = dcTo.getDate();
        if (validateInput(startDate, endDate)) {
            inHoaDon();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean validateInput(Date startDate, Date endDate) {
        // Kiểm tra rỗng
        if (startDate == null || endDate == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày bắt đầu và ngày kết thúc.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        Date currentDate = new Date();

        // Kiểm tra startDate phải lớn hơn ngày hiện tại
        if (startDate.after(currentDate)) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu phải bé hơn ngày hiện tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Kiểm tra endDate phải lớn hơn ngày hiện tại
        if (endDate.after(currentDate)) {
            JOptionPane.showMessageDialog(this, "Ngày kết thúc phải bé hơn ngày hiện tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (startDate.after(endDate)) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu phải trước ngày kết thúc ", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (startDate.equals(endDate)) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu phải trước ngày kết thúc ", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private void inHoaDon() {
        Date startDate = dcFrom.getDate();
        Date endDate = dcTo.getDate();
        String ngayBD = dateFormat.format(startDate);
        String ngayKT = dateFormat.format(endDate);
        ArrayList<ThongKeSanPham> list = data.theoCBO(startDate, endDate);
        String dsSP[] = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ThongKeSanPham tksp = list.get(i);
            dsSP[i] = tksp.getTenSP() + "        SL: " + tksp.getSoLuong() + "      TT: " + df.format(tksp.getTongTien());
        }
        String tongTien = lblDoanhThu.getText();
        String sl = lblTongSanPhamDaBan.getText();
        String ngayBD1 = dateFormat1.format(startDate);
        String ngayKT1 = dateFormat1.format(endDate);
        // Tạo hóa đơn PDF
        String pdfFileName = "ThongKeSPTheoNgay_" + ngayBD1 + "to" + ngayKT1 + ".pdf";
        taoHoaDonPDF(pdfFileName, ngayBD, ngayKT ,dsSP, tongTien, sl);
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + pdfFileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void taoHoaDonPDF(String fileName, String ngayBD, String ngayKT,
            String dsSP[], String tongTien, String slSP) {
        Document document = new Document();
        document.addLanguage(document.toString());
        try {
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();
            Paragraph title = new Paragraph("====================THONG KE SAN PHAM THEO NGAY====================");
            Paragraph light = new Paragraph("--------------------------------------------------------------------------------------------------");
            Paragraph titleNgay = new Paragraph("==NGAY==");
            Paragraph Ngaytao = new Paragraph("NGAY BAT DAU:              " + ngayBD);
            Paragraph NgayThanhToan = new Paragraph("NGAY KET THUC: " + ngayKT);
            Paragraph light1 = new Paragraph("-------------------------------------");
            Paragraph TitleSanPham = new Paragraph("==SAN PHAM DA BAN==");
            String TenSanPham = "";
            for (int i = 0; i < dsSP.length; i++) {
                TenSanPham = TenSanPham + dsSP[i] + "\n";
            }
            Paragraph SanPham = new Paragraph("SAN PHAM BAO GOM: \n" + TenSanPham);
            Paragraph sp = new Paragraph("SO LUONG DA BAN:   " + slSP);
            Paragraph tongTien3 = new Paragraph("TONG DOANH THU:   " + tongTien);
            document.add(title);
            document.add(light);
            document.add(titleNgay);
            document.add(Ngaytao);
            document.add(NgayThanhToan);
            document.add(light1);
            document.add(TitleSanPham);
            document.add(SanPham);
            document.add(light1);
            document.add(sp);
            document.add(tongTien3);
            document.close();
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTim;
    private com.toedter.calendar.JDateChooser dcFrom;
    private com.toedter.calendar.JDateChooser dcTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblTongDonDaBan;
    private javax.swing.JLabel lblTongSanPhamDaBan;
    private javax.swing.JTable tblDoanhThuSP;
    // End of variables declaration//GEN-END:variables
}