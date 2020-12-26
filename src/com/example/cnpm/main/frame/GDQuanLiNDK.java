/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dangkysd.DBContext;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.NguoiDangKi;

/**
 *
 * @author DELL
 */
public class GDQuanLiNDK extends javax.swing.JFrame  implements ActionListener{
    DefaultTableModel tableModel;
    ArrayList<NguoiDangKi> NList = DBContext.selectQuery();
       /**
     * Creates new form GDQuanLiNDK
     */private int selectIndex1;
    public GDQuanLiNDK() {
        initComponents();
        btnChinhsua.addActionListener(this);
        btnFind.addActionListener(this);
        btnThem.addActionListener(this);
        btnHuydk.addActionListener(this);
        tableModel = (DefaultTableModel) jTable1.getModel();
        showMem();
        setLocationRelativeTo(null);
        this.setTitle("Giao diện chính ");
    }
    private void showMem(){
       
        tableModel.setRowCount(0);
        for(NguoiDangKi ndk : NList){
        tableModel.addRow(new Object[]{ndk.getName(),ndk.getAddress(),ndk.getPhoneNumber()
        ,ndk.getCMND(),ndk.getTimeUse(),ndk.getTimeEnd(),ndk.getPhi(),ndk.getMucdich(),ndk.getBienban()});
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

        jLabel1 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnChinhsua = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnHuydk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("VNI-Lithos", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("QUaûn Lí Ñaêng Kí Söû Duïng Nhaø Vaên Hoùa");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnChinhsua.setText("Chỉnh sửa");
        btnChinhsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhsuaActionPerformed(evt);
            }
        });

        btnFind.setText("Tìm kiếm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnHuydk.setText("Hủy đăng kí");
        btnHuydk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuydkActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Họ và tên", "Địa chỉ", "SĐT", "CMND", "Bắt đầu", "Kết thúc", "Phí", "Mục đích", "Tên hoạt động", "Mã thuế"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnHome.setText("Trang chính");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnChinhsua)
                        .addGap(77, 77, 77)
                        .addComponent(btnHome)
                        .addGap(81, 81, 81)
                        .addComponent(btnFind)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnHuydk)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnChinhsua)
                    .addComponent(btnFind)
                    .addComponent(btnHuydk)
                    .addComponent(btnHome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnHuydkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuydkActionPerformed
         int selectedindex = jTable1.getSelectedRow();
           if(selectedindex == -1){
            JOptionPane.showMessageDialog(rootPane,"Please choose a line!");
           }
           else if(NList.size()==0){
                JOptionPane.showMessageDialog(rootPane,"Không có thông tin!");
           } else{
                int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to delete this item?");
                if(selectedindex >=0){
                    NguoiDangKi ndk= NList.get(selectedindex);
                   
                if(option ==0){
               DBContext.delete(ndk.getCMND());
                NList.remove(selectedindex); }
                showMem();
           }
           }     
           
    }//GEN-LAST:event_btnHuydkActionPerformed

    private void btnChinhsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhsuaActionPerformed
        // TODO add your handling code here:
            /*  int select = jTable1.getSelectedRow();
            if (select == -1) {
                JOptionPane.showMessageDialog(rootPane, "Xin vui lòng chọn dòng cần sửa: ");
            } else {
                 NguoiDangKi ndk= NList.get(select);
               DBContext.UpdateMem(ndk);
                jTable1.setModel(tableModel);
              JOptionPane.showMessageDialog(rootPane, "Cập nhật xong");
            }
        */
            selectIndex1 =jTable1.getSelectedRow();
            if(NList.size()==0){
                JOptionPane.showMessageDialog(rootPane, "Không có thông tin! Vui lòng thêm thông tin!");
            }
            else if(selectIndex1 == -1){
                 JOptionPane.showMessageDialog(rootPane, "Xin vui lòng chọn dòng cần sửa: ");
            } else{ 
                if(selectIndex1 >=0){
                    NguoiDangKi ndk= NList.get(selectIndex1);
                    GDChinhsuaDK edit = new GDChinhsuaDK();
                    edit.setEditData(NList.get(selectIndex1));
                    DBContext.delete(ndk.getCMND());
                    NList.remove(selectIndex1);
                    edit.actionPerformed(evt);                  
                      edit.setVisible(true);
                      }
                showMem();
              
             
 
            }
    }//GEN-LAST:event_btnChinhsuaActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
       
        String input = JOptionPane.showInputDialog(this,"Enter name to search:");
        if(input != null && input.length() > 0) {
            NList = DBContext.findByname(input);
            
           tableModel.setRowCount(0);
        NList.forEach( (ndk)-> {
        tableModel.addRow(new Object[]{ndk.getName(),ndk.getAddress(),ndk.getPhoneNumber()
        ,ndk.getCMND(),ndk.getTimeUse(),ndk.getTimeEnd(),ndk.getPhi(),ndk.getMucdich(),ndk.getBienban()});}
        );}
           else {
            showMem();
        }    
    
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
         new GDQuanLiNDK().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed
     
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
            java.util.logging.Logger.getLogger(GDQuanLiNDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDQuanLiNDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDQuanLiNDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDQuanLiNDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDQuanLiNDK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChinhsua;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHuydk;
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource().equals(btnThem)){
          btnThemClick();
      }
      
  //    else if (e.getSource().equals((btnChinhsua))){
 //         btnChinhsuaClick();
    //  }
    }
    public void btnThemClick(){
        new GDThemNguoiDK().setVisible(true);
        this.dispose();
    }
  
    public void btnChinhsuaClick(){
        new GDChinhsuaDK().setVisible(true);
        this.dispose();
    }
}
