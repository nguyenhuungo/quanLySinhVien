/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa1;

/**
 *
 * @author Dell
 */
public class fr1 extends javax.swing.JFrame {

    /**
     * Creates new form fr1
     */
    public fr1() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        cboKhoaHoc = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tlbBangDiem = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDiemChuyenDe = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edusys -Tổng Hợp & Thoogs Kê");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("TỔNG HỢP THỐNG KÊ");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.setNextFocusableComponent(jLabel1);

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1990", "8", "1990-01-02", " 1990-04-27"},
                {"1991", "9", "1991-05-08", "1991-05-08"},
                {"1992", "4", "1992-02-15", "1992-09-15"},
                {"1993", "5", "1993-02-18", "1993-10-18"},
                {"1994", "4", "1994-01-05", "1994-11-12"},
                {"1995", "4", "1995-02-15", "1995-03-15"},
                {"1996", "5", "1996-05-08", "1996-07-14"},
                {"1997", "2", "1997-01-02", "1997-27-09"},
                {"1998", "1", "1998-02-18", "1998-02-18"},
                {"1999", "9", "1999-01-05", "2000-05-11"},
                {"2001", "7", "2001-05-08", "2001-05-08"},
                {"2002", "8", "2002-02-15", "2002-10-18"},
                {"2003", "4", "2003-02-18", "2003-11-12"},
                {"2004", "5", "2004-05-11", "2004-04-27"},
                {"2005", "1", "2005-05-11", "2005-04-27 "},
                {"2006", "3", "2006-08-07", "2006-09-15"},
                {"2007", "9", "2007-02-15", "2007-10-18"},
                {"2008", "6", "2008-09-22", "2008-09-22"},
                {"2009", "5", "2009-05-08", "2009-04-27"},
                {"3000", "5", "3000-05-11", "3000-05-11"},
                {"3001", "5", "3001-01-02", "3001-05-08"},
                {"3002", "8", "3002-01-05", "3002-01-05"},
                {"3003", "8", "3003-05-08", "3003-05-08"},
                {"3004.", "1", "3004-01-02", "3004-02-18"},
                {"3005", "2", "3005-02-15", "3005-10-18"},
                {"3006", "6", "3006-02-18", "3006-04-27"}
            },
            new String [] {
                "NĂM ", "SỐ NGƯỜI HỌC", "ĐẦU TIÊN", "SAU CÙNG"
            }
        ));
        tblNguoiHoc.setGridColor(new java.awt.Color(0, 0, 0));
        tblNguoiHoc.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jScrollPane1.setViewportView(tblNguoiHoc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("NGƯỜI HỌC ", jPanel1);

        cboKhoaHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRO02 (2018-01-10)" }));

        jLabel2.setText("KHÓA HỌC:");

        tlbBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"PH13274", "Chu Ngọc Thao", "8", "Gioi"},
                {"PH14605", "Nguyễn Duy Cương", "9", "Xuất sắc"},
                {"PH14667", "Trần Vỹ Khang", "9", "Xuất sắc"},
                {"PH14720", "Nguyễn Trung Hiếu", "8", "Gioi"},
                {"PH14731", "Nguyễn Thương Thương", "6", "Trung bình"},
                {"PH14764", "Lê Đức Nam", "5", "Trung bình"},
                {"PH14774", "Vũ Văn Lanh", "4", "Yếu"},
                {"PH14776", "Nguyễn Thế Phong", "8", "Gioi"},
                {"PH14778", "Phạm Quốc Huy", "8", "Khá"},
                {"PH14782", "Lê Đức Nam", "3", "Yếu"},
                {"PH14822", "Phan Đức Trọng", "8", "Gioi"},
                {"PH14825", "Nguyễn Hoàng Hải", "5", "Trung bình"},
                {"PH14892", "Trần Đức Long", "9", "Xuất sắc"},
                {"PH14896", "Dương Đức Cường", "4", "Yếu"},
                {"PH14918", "Đỗ Văn Dương", "8", "Gioi"},
                {"PH14973", "Đinh Đức Cảnh", "7", "Khá"},
                {"PH15034", "Phạm Trường Giang", "9", "Xuất sắc"},
                {"PH15053", "Viết Tiến Vương", "-1", "Chưa nhập"},
                {"PH15074", "Doãn Thanh Tú", "-1", "Chưa nhập"},
                {"PH15075", "Lê Ngọc Toàn", "-1", "Chưa nhập"},
                {"PH15080", "Nguyễn Hữu Ngọ", "-1", "Chưa nhập"},
                {"PH15102", "Phạm Thị Nga", "-1", "Chưa nhập"},
                {"PH15207", "Đặng Văn Tuấn", "-1", "Chưa nhập"},
                {"PH15717", "Lê Việt Hoàng", "-1", "Chưa nhập"},
                {"PH16158", "Lò Văn Phóng", "-1", "Chưa nhập"}
            },
            new String [] {
                "MÃ NH", "HỌ & TÊN", "ĐIỂM ", "XẾP LOẠI"
            }
        ));
        jScrollPane2.setViewportView(tlbBangDiem);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BẢNG ĐIỂM", jPanel3);

        tblDiemChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cơ sở dữ liệu SQL Server", "5", "-1", "-1", "-1"},
                {"Dự án với công nghệ Servlet/JSP", "6", "-1", "-1", "-1"},
                {"Dự án với công nghệ Spring MVC", "16", "-1", "9", "2.25"}
            },
            new String [] {
                "CHUYÊN ĐỀ", "TỔNG ĐIỂM HD", "CAO NHẤT", "THÁP NHẤT", "ĐIỂM TRUNG BÌNH"
            }
        ));
        jScrollPane3.setViewportView(tblDiemChuyenDe);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TỔNG HỢP ĐIỂM", jPanel4);

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cơ sở dữ liệu SQL Server", "1", "5", "500", "100", "100", "100"},
                {"Dự án với công nghệ Servlet/JSP", "1", "6", "1.800", "300", "300", "300"},
                {"Dự án với công nghệ Spring MVC", "1", "16", "4.800", "300", "300", "300"}
            },
            new String [] {
                "CHUYÊN ĐÈ ", "SỐ KHÓA", "SỐ HD", "DOANH THU", "HP CAO", "HP THẤP", "HP TRUNG BÌNH"
            }
        ));
        jScrollPane4.setViewportView(tblDoanhThu);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NĂM:");

        cboNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", " " }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(cboNam, 0, 544, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DOANH THU", jPanel5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(fr1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblDiemChuyenDe;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTable tlbBangDiem;
    // End of variables declaration//GEN-END:variables
}
