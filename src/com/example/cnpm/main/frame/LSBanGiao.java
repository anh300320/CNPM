package com.example.cnpm.main.frame;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import com.example.cnpm.main.dao.DAO;
import com.example.cnpm.main.dao.RealTime;

public class LSBanGiao extends JFrame {

	/**
	 * 
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LSBanGiao frame = new LSBanGiao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private String mabangiao;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JEditorPane dtrpnNhpTm;
	private JTable table;
	private Vector<String[]> rowVt = new Vector<String[]>();
	private DefaultTableModel tableModel = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "Trạng thái", "Người thuê", "Thời gian bàn giao", "Thời gian trả", "Phí(VNĐ)"
			}
		);
	
	private void onListener() {
		dtrpnNhpTm.addCaretListener(new CaretListener() {

			@Override
			public void caretUpdate(CaretEvent e) {
				System.out.println("Texted");
				
			}
			
		}); 
		table.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				int ay = e.getY();
				if (ay%15 == 0 && ay != 0) {
					ay = ay/15 - 1;
				}
				ay = ay/15;
				int ax = e.getX();
				if (ax%153 == 0 && ax != 0) {
					ax = ax/153 - 1;
				}
				ax = ax/153;
				if (ax < 2) table.setCursor(new Cursor(Cursor.HAND_CURSOR));
				else table.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
		});
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				switch(table.getSelectedColumn()) {
				case 0: String[] s = rowVt.get(table.getSelectedRow());
						mabangiao = s[0];
						TTBanGiao ttBanGiao = new TTBanGiao(mabangiao);
						ttBanGiao.setVisible(true);
						break;
				case 1: System.out.println("Entering 2"); break;
				}
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			
		});
	}
	public LSBanGiao() {
		setTitle("Lịch sử bàn giao");
		init();
		onTableCreate();
		onListener();
	}
	
	public void onTableCreate() {
		DAO dao = new DAO();
		dao.SQL("select mabangiao, hoten, tg_bangiao, tg_tra, phi from lsbangiao l, tt_canhan t where l.cmnd = t.cmnd");
		String trangthai;
		while (dao.next()) {
			if (dao.getColumn("tg_tra").compareTo(RealTime.getCurrenTime()) < 0) trangthai = "Kết thúc";
			else trangthai = "Đang thuê";
			
			rowVt.add(new String[] {
					dao.getColumn("mabangiao"), 
					trangthai,
					dao.getColumn("hoten"), 
					dao.getColumn("tg_bangiao"),
					dao.getColumn("tg_tra"),
					dao.getColumn("phi") }
					);
			tableModel.addRow(rowVt.lastElement());
		}
		
	}
	
	public void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 113, 774, 343);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(tableModel);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("LỊCH SỬ BÀN GIAO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(295, 10, 257, 49);
		contentPane.add(lblNewLabel);
		
		dtrpnNhpTm = new JEditorPane();
		dtrpnNhpTm.setText("Nhập để tìm kiếm");
		dtrpnNhpTm.setFont(new Font("Tahoma", Font.ITALIC, 10));
		dtrpnNhpTm.setBounds(10, 84, 107, 19);
		contentPane.add(dtrpnNhpTm);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setText("Nhập để tìm kiếm");
		editorPane.setFont(new Font("Tahoma", Font.ITALIC, 10));
		editorPane.setBounds(140, 84, 107, 19);
		contentPane.add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setText("Nhập để tìm kiếm");
		editorPane_1.setFont(new Font("Tahoma", Font.ITALIC, 10));
		editorPane_1.setBounds(269, 84, 107, 19);
		contentPane.add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setText("Nhập để tìm kiếm");
		editorPane_2.setFont(new Font("Tahoma", Font.ITALIC, 10));
		editorPane_2.setBounds(657, 84, 107, 19);
		contentPane.add(editorPane_2);
		
		JLabel lblNewLabel_1 = new JLabel("Từ ");
		lblNewLabel_1.setBounds(386, 84, 28, 19);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1,2,3,4,5,6,7,8,9"}));
		comboBox.setBounds(410, 84, 40, 21);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022"}));
		comboBox_1.setBounds(460, 84, 53, 21);
		contentPane.add(comboBox_1);
		
		JLabel label = new JLabel("Từ ");
		label.setBounds(520, 82, 28, 19);
		contentPane.add(label);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"10"}));
		comboBox_2.setBounds(544, 82, 40, 21);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"2020"}));
		comboBox_3.setBounds(594, 82, 53, 21);
		contentPane.add(comboBox_3);
	}
	public String getMabangiao() {
		return mabangiao;
	}
}
