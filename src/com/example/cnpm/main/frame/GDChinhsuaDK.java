package com.example.cnpm.main.frame;

import com.example.cnpm.main.dao.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import com.example.cnpm.main.util.*;
import java.sql.Timestamp;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author DELL
 */
public class GDChinhsuaDK extends javax.swing.JFrame implements ActionListener{
     private NguoiDangKi nguoiDk;
     
    /**
     * Creates new form GDThemNguoiDK
     */
    public GDChinhsuaDK() {
        initComponents();
        setLocationRelativeTo(null);
        btnSave.addActionListener(this);
        btnCancel.addActionListener(this);
        nguoiDk=null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtBatDau = new javax.swing.JTextField();
        btnMucdich = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("CH\u1EC8NH S\u1EECA TH\u00D4NG TIN KH\u00C1CH H\u00C0NG");

        jLabel2.setText("H\u1ECD v\u00E0 t\u00EAn:");

        jLabel3.setText("\u0110\u1ECBa ch\u1EC9:");

        jLabel4.setText("S\u0110T:");

        jLabel5.setText("CMND:");

        jLabel6.setText("Ng\u00E0y sinh:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnMucdich.setText("Gi\u1EDBi t\u00EDnh:");
        
        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nam", "N\u1EEF"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(184)
        			.addComponent(jLabel1)
        			.addContainerGap(183, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(44)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(btnMucdich)
        					.addContainerGap())
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        								.addComponent(jLabel6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabel5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabel4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.RELATED))
        						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnSave, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(24)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtBatDau, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtCMND, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtPhoneNumber, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
        								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
        							.addGap(49, 140, Short.MAX_VALUE))
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
        							.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        							.addGap(75))))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        			.addGap(32)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(30)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addGap(30)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(txtPhoneNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4))
        			.addGap(29)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(txtCMND, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(36)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtBatDau, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel6))
        			.addGap(50)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnMucdich)
        				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
        			.addGap(19))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        
     
    }                                       

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        new GDQuanLiNDK(0).setVisible(true);
        this.dispose();
    }                                         

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
            java.util.logging.Logger.getLogger(GDChinhsuaDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDChinhsuaDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDChinhsuaDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDChinhsuaDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDChinhsuaDK().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource().equals(btnSave)){
          EditClick();
      }
     }
      public void EditClick(){
            nguoiDk = new NguoiDangKi();
        try{
        	String gender = String.valueOf(comboBox.getSelectedItem());
            nguoiDk.setName(txtName.getText());
            nguoiDk.setAddress(txtAddress.getText());
            nguoiDk.setPhoneNumber(txtPhoneNumber.getText());
            try {
            nguoiDk.setCMND(txtCMND.getText());}
            catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "CMND khong duoc bo trong !");
            }
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                  nguoiDk.setTimeUse(sdf.parse(txtBatDau.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Nhap sai cu phap! Dinh dang ngay: DD/MM/YYYY");
            }
           nguoiDk.setGioitinh(gender);
 //           try {
//                nguoiDk.setTimeEnd(sdf.parse(txtKetThuc.getText()));
//            } catch (Exception e) {
 //                JOptionPane.showMessageDialog(rootPane, "Nhap sai cu phap! Dinh dang ngay: YYYY/MM/DD ");
 //           }
 //           nguoiDk.setBienban(txtBienBan.getText());
  //          try {
  //               nguoiDk.setPhi(Integer.parseInt(txtPhi.getText()));
  //          } catch (Exception e) {
  //                JOptionPane.showMessageDialog(rootPane, "Phai la so!!");
  //          }           
  //          nguoiDk.setMucdich(txtMucdich.getText());
            if( new  DBContext().updateMem(nguoiDk)){
                JOptionPane.showMessageDialog(rootPane, "Sửa thành công!");
            }else
                JOptionPane.showMessageDialog(rootPane, "Sửa thất bại!");
        }catch(Exception e){
            e.printStackTrace();
        }
      }
    
   

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel btnMucdich;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBatDau;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private JComboBox comboBox;
    // End of variables declaration                   

    void setEditData(NguoiDangKi n) {
      txtName.setText(n.getName());
      txtAddress.setText(n.getAddress());
      txtPhoneNumber.setText(n.getPhoneNumber());
      txtCMND.setText(n.getCMND());
      txtBatDau.setText(n.getTimeUse()+"");
      comboBox.setSelectedItem(n.getGioitinh());
    //  txtKetThuc.setText(n.getTimeEnd()+"");
   //   txtPhi.setText(n.getPhi()+"");
   //   txtMucdich.setText(n.getMucdich());
   //   txtBienBan.setText(n.getBienban());
    }
   
}