package com.example.cnpm.main.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.example.cnpm.main.dao.DAO;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class TTBanGiao extends JFrame {
	
	private DAO dao = new DAO();
	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private Vector<String[]> rowVt = new Vector<String[]>();
	private DefaultTableModel tableModel = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			 "Tên đồ vật", "Mã loại", "Số lượng", "Trạng thái lúc thuê", "Trạng thái khi trả"
			}
		);

	private void onListener() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	
	private void onCreate(String mabangiao) {
		dao.SQL("select d.tenloai, t.* from dovat d, thongtin_bangiao_thue t where d.maloai = t.maloai and t.mabangiao = " + mabangiao);
		while (dao.next()) {
			
			rowVt.add(new String[] {
				dao.getColumn("tenloai"),
				dao.getColumn("maloai"),
				dao.getColumn("soluong"),
				dao.getColumn("trangthai_truoc"),
				dao.getColumn("trangthai_sau"),
				
			});
			tableModel.addRow(rowVt.lastElement());
		}
	}
	
	public TTBanGiao(String mabangiao) {
		setTitle("Danh sách thuê");
		init();
		onCreate(mabangiao);
		onListener();
	}
	
	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 53, 452, 270);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(tableModel);
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("OK");
		
		btnNewButton.setBounds(293, 390, 101, 32);
		contentPane.add(btnNewButton);
	}
}
