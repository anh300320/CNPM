package com.example.cnpm.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.example.cnpm.main.util.HoatDong;
import com.example.cnpm.main.util.TtCaNhan;

import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Choice;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ActivityReport extends JFrame {

	private JPanel contentPane;
	private JTextField txtTnHotng;
	private JTextField txtMcchHot;
	private JTextField txtThiGianBt;
	private JTextField txtThiGianKt;
	private JTextField txtaim;
	private JTextField txtCcQuyTrnh;
	private JEditorPane editorPane_1;
	private JEditorPane editorPane_2;
	private JEditorPane editorPane_3;
	private JEditorPane editorPane_4;
	private JEditorPane editorPane_6;
	private JButton btnTyChnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActivityReport frame = new ActivityReport();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ActivityReport() {
		setTitle("B\u00E1o c\u00E1o ho\u1EA1t \u0111\u1ED9ng t\u1ED5 d\u00E2n ph\u1ED1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTnHotng = new JTextField();
		txtTnHotng.setBackground(SystemColor.menu);
		txtTnHotng.setText("T\u00EAn ho\u1EA1t \u0111\u1ED9ng");
		Font fn = new Font("Arial",Font.PLAIN,13);
		txtTnHotng.setFont(fn);
		txtTnHotng.setBounds(10, 11, 182, 28);
		contentPane.add(txtTnHotng);
		txtTnHotng.setColumns(10);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(202, 11, 357, 28);
		editorPane.setFont(fn);
		contentPane.add(editorPane);
		
		txtMcchHot = new JTextField();
		txtMcchHot.setText("M\u1EE5c \u0111\u00EDch ho\u1EA1t \u0111\u1ED9ng");
		txtMcchHot.setFont(new Font("Arial", Font.PLAIN, 13));
		txtMcchHot.setColumns(10);
		txtMcchHot.setBackground(SystemColor.menu);
		txtMcchHot.setBounds(10, 50, 182, 28);
		contentPane.add(txtMcchHot);
		
		txtThiGianBt = new JTextField();
		txtThiGianBt.setText("Th\u1EDDi gian b\u1EAFt \u0111\u1EA7u");
		txtThiGianBt.setFont(new Font("Arial", Font.PLAIN, 13));
		txtThiGianBt.setColumns(10);
		txtThiGianBt.setBackground(SystemColor.menu);
		txtThiGianBt.setBounds(10, 89, 182, 28);
		contentPane.add(txtThiGianBt);
		
		txtThiGianKt = new JTextField();
		txtThiGianKt.setText("Th\u1EDDi gian k\u1EBFt th\u00FAc");
		txtThiGianKt.setFont(new Font("Arial", Font.PLAIN, 13));
		txtThiGianKt.setColumns(10);
		txtThiGianKt.setBackground(SystemColor.menu);
		txtThiGianKt.setBounds(10, 128, 182, 28);
		contentPane.add(txtThiGianKt);
		
		txtaim = new JTextField();
		txtaim.setText("\u0110\u1ECBa \u0111i\u1EC3m");
		txtaim.setFont(new Font("Arial", Font.PLAIN, 13));
		txtaim.setColumns(10);
		txtaim.setBackground(SystemColor.menu);
		txtaim.setBounds(10, 167, 182, 28);
		contentPane.add(txtaim);
		
		txtCcQuyTrnh = new JTextField();
		txtCcQuyTrnh.setText("C\u00E1c quy tr\u00ECnh ch\u00EDnh");
		txtCcQuyTrnh.setFont(new Font("Arial", Font.PLAIN, 13));
		txtCcQuyTrnh.setColumns(10);
		txtCcQuyTrnh.setBackground(SystemColor.menu);
		txtCcQuyTrnh.setBounds(10, 206, 549, 28);
		contentPane.add(txtCcQuyTrnh);
		
		editorPane_1 = new JEditorPane();
		editorPane_1.setFont(new Font("Arial", Font.PLAIN, 13));
		editorPane_1.setBounds(202, 50, 357, 28);
		contentPane.add(editorPane_1);
		
		editorPane_2 = new JEditorPane();
		editorPane_2.setFont(new Font("Arial", Font.PLAIN, 13));
		editorPane_2.setBounds(202, 89, 357, 28);
		contentPane.add(editorPane_2);
		
		editorPane_3 = new JEditorPane();
		editorPane_3.setFont(new Font("Arial", Font.PLAIN, 13));
		editorPane_3.setBounds(202, 128, 357, 28);
		contentPane.add(editorPane_3);
		
		editorPane_4 = new JEditorPane();
		editorPane_4.setFont(new Font("Arial", Font.PLAIN, 13));
		editorPane_4.setBounds(202, 167, 357, 28);
		contentPane.add(editorPane_4);
		
		editorPane_6 = new JEditorPane();
		editorPane_6.setFont(new Font("Arial", Font.PLAIN, 13));
		editorPane_6.setBounds(10, 245, 549, 71);
		contentPane.add(editorPane_6);
		//choice.;
		
		JButton btnNewButton = new JButton("Ho\u00E0n t\u1EA5t");
		btnNewButton.setBounds(377, 382, 182, 42);
		contentPane.add(btnNewButton);
		
		DAO dao = new DAO();
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String tenHoatDong = editorPane.getText();
				String mucDich = editorPane_1.getText();
				String tgBatDau = editorPane_2.getText();
				String tgKetThuc = editorPane_3.getText();
				HoatDong hd = new HoatDong(0, tenHoatDong, tgBatDau, tgKetThuc, -1, mucDich);
				dao.create("lshoatdong", hd, HoatDong.class);
			}
		});
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Bi\u00EAn b\u1EA3n b\u00E0n giao c\u01A1 s\u1EDF v\u1EADt ch\u1EA5t");
		chckbxNewCheckBox.setFont(fn);
		chckbxNewCheckBox.setBounds(10, 323, 224, 35);
		contentPane.add(chckbxNewCheckBox);
		chckbxNewCheckBox.addActionListener(new ActionListener() {    
      @Override
      public void actionPerformed(ActionEvent arg0)
      {
        btnTyChnh.setVisible(!btnTyChnh.isVisible());
      }
    });
		
		btnTyChnh = new JButton("T\u00F9y ch\u1EC9nh");
		btnTyChnh.setVisible(false);
		btnTyChnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DAO dao = new DAO();
				
				List<TtCaNhan> listTtCaNhan = dao.getAll("tt_canhan", TtCaNhan.class);
				
				System.out.println(listTtCaNhan.get(0).getHoTen());
			}
		});
		btnTyChnh.setBounds(244, 327, 102, 28);
		contentPane.add(btnTyChnh);
	}
}
