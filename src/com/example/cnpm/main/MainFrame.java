package com.example.cnpm.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.example.cnpm.main.dao.DAO;
import com.example.cnpm.main.frame.BaoCaoHoatDong;
import com.example.cnpm.main.util.HoatDong;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JTable table;
	private JTextField textField;
	
	private JScrollPane scrollPane;
	

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
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
		setBounds(100, 100, 774, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 79, 128, 38);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(10, 128, 128, 38);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(10, 177, 128, 38);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(10, 226, 128, 38);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("\u0110\u0103ng xu\u1EA5t");
		btnNewButton_4.setBounds(639, 11, 89, 41);
		contentPane.add(btnNewButton_4);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(148, 63, 581, 323);
		contentPane.add(scrollPane);
		
		 String column[] = {"STT", "TÃªn hoáº¡t Ä‘á»™ng", "Thá»�i gian báº¯t Ä‘áº§u", "Thá»�i gian káº¿t thÃºc", "Má»¥c Ä‘Ã­ch"};
		    Vector<String> col = new Vector<>(Arrays.asList(column));
		    Vector<HoatDong> data = new Vector<HoatDong>(); 
		
		DAO dao = new DAO();
	    
	    List<HoatDong> lsHd = dao.getAll("lshoatdong", HoatDong.class);
	    for(HoatDong hd : lsHd)
	    	data.add(hd);
	    contentPane.setLayout(null);
	    
	    table = new JTable(data, col);
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(456, 12, 173, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		onListener();
	}
}
