package com.example.cnpm.main.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.example.cnpm.main.dao.DAO;
import com.example.cnpm.main.util.TtCaNhan;

import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class ChonKhachHang extends JFrame {

	private JPanel contentPane;
	private JTextField txtTn;
	
	private int cmnd;
	
	List<TtCaNhan> listNguoiDangKi;
	private JTable table;

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
	  
		listNguoiDangKi = new ArrayList<>();
	  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(135, 11, 289, 19);
		contentPane.add(editorPane);
		
		txtTn = new JTextField();
		txtTn.setEditable(false);
		txtTn.setText("Tìm kiếm tên");
		txtTn.setBounds(10, 11, 115, 19);
		contentPane.add(txtTn);
		txtTn.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowId = table.getSelectedRow();
				setCmnd(listNguoiDangKi.get(rowId).getCmnd());
				setVisible(false);
			}
		});
		btnNewButton.setBounds(339, 229, 85, 21);
		contentPane.add(btnNewButton);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		DAO dao = new DAO();
		listNguoiDangKi = dao.getAll("tt_canhan", TtCaNhan.class);
		
		initTable();
	}

	public int getCmnd() {
		return cmnd;
	}

	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	
	void initTable() {
		
		String column[] = {"Số CMND", "Họ tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Địa chỉ"};
	    Vector<String> col = new Vector<>(Arrays.asList(column));
		Vector<Vector<String>> data = new Vector<Vector<String>>();
		for(TtCaNhan tt : listNguoiDangKi) {
			Vector<String> vt = new Vector<String>();
			vt.add(String.valueOf(tt.getCmnd()));
			vt.add(tt.getHoTen());
			vt.add(tt.getNgaySinh());
			vt.add(tt.getGioiTinh());
			vt.add(tt.getSdt());
			vt.add(tt.getDiaChi());
			data.add(vt);
		}
		
		table = new JTable(data, col);
		table.setBounds(10, 43, 414, 177);
		contentPane.add(table);
	}
}
