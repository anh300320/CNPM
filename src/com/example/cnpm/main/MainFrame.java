package com.example.cnpm.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.example.cnpm.main.frame.BaoCaoHoatDong;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnHotngChung;
	private JButton btnQunLHng;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void onListener() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnHotngChung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BaoCaoHoatDong reportFrame = new BaoCaoHoatDong();
				reportFrame.setVisible(true);
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("B\u00E0n giao");
		
		btnNewButton.setBounds(149, 109, 85, 21);
		contentPane.add(btnNewButton);
		
		btnHotngChung = new JButton("B\u00E1o c\u00E1o ho\u1EA1t \u0111\u1ED9ng");
		btnHotngChung.setBounds(376, 109, 292, 21);
		contentPane.add(btnHotngChung);
		
		btnNewButton_1 = new JButton("\u0110\u0103ng k\u00FD s\u1EED d\u1EE5ng NHV");
		
		btnNewButton_1.setBounds(77, 212, 219, 21);
		contentPane.add(btnNewButton_1);
		
		btnQunLHng = new JButton("Qu\u1EA3n l\u00FD h\u00E0ng th\u00E1ng");
		btnQunLHng.setBounds(402, 212, 266, 21);
		contentPane.add(btnQunLHng);
		
		onListener();
	}
}
