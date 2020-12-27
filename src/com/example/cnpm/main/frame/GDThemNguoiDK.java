package com.example.cnpm.main.frame;
import com.example.cnpm.main.dao.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.example.cnpm.main.util.NguoiDangKi;
import javax.swing.JComboBox;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author DELL
 */
public class GDThemNguoiDK extends JFrame implements ActionListener{
     private NguoiDangKi nguoiDk;
     
    /**
     * Creates new form GDThemNguoiDK
     */
    public GDThemNguoiDK() {
    	setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
        initComponents();
        setLocationRelativeTo(null);
        btnAdd.addActionListener(this);
        btnCancel.addActionListener(this);
        btnReset.addActionListener(this);
        nguoiDk=null;
        this.setTitle("Thêm người đăng ký");
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
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtBatDau = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Thêm mới người đăng kí");

        jLabel2.setText("Họ và tên :");

        jLabel3.setText("Địa chỉ:");

        jLabel4.setText("Số điện thoại :");

        jLabel5.setText("Số CMND :");

        jLabel6.setText("Ngày sinh:");

        btnAdd.setText("Add");

        btnCancel.setText("Cancel");

        btnReset.setText("Reset");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        
      
      
       
        JLabel lblNewLabel = new JLabel("Giới tính :");
        
        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ ", "Khác"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(53)
        			.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
        			.addGap(76)
        			.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
        			.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
        			.addGap(58))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(189, Short.MAX_VALUE)
        			.addComponent(jLabel1)
        			.addGap(180))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(44)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(jLabel4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        						.addComponent(jLabel6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
        					.addComponent(jLabel5, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
        				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
        			.addGap(37)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        					.addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
        					.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
        					.addComponent(txtPhoneNumber, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
        					.addComponent(txtCMND, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
        					.addComponent(txtBatDau, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE))
        				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
        			.addGap(72))
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
        			.addGap(36)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(37)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(txtPhoneNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(31)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(txtCMND, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(31)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(txtBatDau, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel)
        				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(51)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
        			.addGap(62))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(GDThemNguoiDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDThemNguoiDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDThemNguoiDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDThemNguoiDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDThemNguoiDK().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource().equals(btnAdd)){
         btnAddClick();
     }
     if(e.getSource().equals(btnCancel)){
         btnCancelClick();
     }
     if(e.getSource().equals(btnReset)){
         btnResetClick();
     }
    }
    public void btnAddClick(){
       nguoiDk = new NguoiDangKi();
        try{
        	String gender = String.valueOf(comboBox.getSelectedItem());
            nguoiDk.setName(txtName.getText());
            nguoiDk.setAddress(txtAddress.getText());
            nguoiDk.setPhoneNumber(txtPhoneNumber.getText());
            nguoiDk.setCMND(txtCMND.getText());
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
            if( new  DBContext().addNewMem(nguoiDk)){
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
            }else
                JOptionPane.showMessageDialog(rootPane, "Thêm thất bại!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void btnCancelClick(){
        new GDQuanLiNDK().setVisible(true);
        this.dispose();
    }
    public void btnResetClick(){
        txtName.setText("");
        txtPhoneNumber.setText("");
        txtCMND.setText("");
        txtAddress.setText("");
        txtBatDau.setText("");
 //       txtKetThuc.setText("");
 //       txtBienBan.setText("");
 //       txtMucdich.setText("");
 //       txtPhi.setText("");
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReset;
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
}