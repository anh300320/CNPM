package com.example.cnpm.main.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChonKhachHang extends JFrame {
	
	String cmnd;

	private JPanel contentPane;
	private JTextField txtTn;
	private JTextField txtCmnd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChonKhachHang frame = new ChonKhachHang();
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
	public ChonKhachHang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(227, 56, 107, 19);
		contentPane.add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(227, 110, 107, 19);
		contentPane.add(editorPane_1);
		
		txtTn = new JTextField();
		txtTn.setText("T\u00EAn");
		txtTn.setBounds(53, 56, 96, 19);
		contentPane.add(txtTn);
		txtTn.setColumns(10);
		
		txtCmnd = new JTextField();
		txtCmnd.setText("CMND");
		txtCmnd.setColumns(10);
		txtCmnd.setBounds(53, 110, 96, 19);
		contentPane.add(txtCmnd);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmnd = editorPane.getText();
			}
		});
		btnNewButton.setBounds(144, 189, 85, 21);
		contentPane.add(btnNewButton);
	}
}
