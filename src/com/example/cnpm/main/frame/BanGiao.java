package com.example.cnpm.main.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class BanGiao extends JFrame {
	
	private ChonDoVat chonDoVat;

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JButton btnNewButton;
	private JButton button;
	private JTable table;
	private JTextField txtDanhSch;
	
	private Vector<String[]> rowVt = new Vector<String[]>();
	
	private DefaultTableModel tableModel = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Tên loại", "Số lượng"
			}
		);
	private JTextField txtThiGianTr;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField txtMcch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BanGiao frame = new BanGiao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void onListener() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				chonDoVat.setVisible(true);
				
			}
			
		});
		
		chonDoVat.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				textField_1.setText("= " + chonDoVat.getThanhTien());
				for (int i = 0; i < rowVt.size(); i++) {
					tableModel.removeRow(0);
				}
				rowVt = chonDoVat.getDSDoVat();
				for (String[] s: rowVt) {
					tableModel.addRow(s);
				}
				
			}
			
		});
	}

	/**
	 * Create the frame.
	 */
	public BanGiao() {
		chonDoVat = new ChonDoVat();
		
		setTitle("B\u00E0n giao");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 750, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnNewButton = new JButton("Tu\u1EF3 ch\u1EC9nh");
		
		button = new JButton("Tu\u1EF3 ch\u1EC9nh");
		
		JTextField txtBinBnBn = new JTextField();
		txtBinBnBn.setBorder(null);
		txtBinBnBn.setBackground(SystemColor.menu);
		txtBinBnBn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBinBnBn.setText("              BIÊN BẢN BÀN GIAO ĐỒ VẬT");
		txtBinBnBn.setColumns(10);
		
		table = new JTable();
		table.setModel(tableModel);
		
		scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		
		txtDanhSch = new JTextField();
		txtDanhSch.setText("Danh s\u00E1ch \u0111\u1ED3 b\u00E0n giao");
		txtDanhSch.setBackground(SystemColor.menu);
		txtDanhSch.setColumns(10);
		
		txtThiGianTr = new JTextField();
		txtThiGianTr.setText("Thời gian trả");
		txtThiGianTr.setColumns(10);
		txtThiGianTr.setBackground(SystemColor.menu);
		
		textField_1 = new JTextField();
		textField_1.setText("= 200.000");
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.menu);
		
		textField_2 = new JTextField();
		textField_2.setText("= 125.000");
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.menu);
		
		textField_3 = new JTextField();
		textField_3.setText(" +");
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.menu);
		
		textField_4 = new JTextField();
		textField_4.setText(" =");
		textField_4.setColumns(10);
		textField_4.setBackground(SystemColor.menu);
		
		JButton btnHonTt = new JButton("Hoàn tất");
		
		textField_6 = new JTextField();
		textField_6.setText("Danh sách đồ bàn giao");
		textField_6.setColumns(10);
		textField_6.setBackground(SystemColor.menu);
		
		txtMcch = new JTextField();
		txtMcch.setText("Mục đích");
		txtMcch.setColumns(10);
		txtMcch.setBackground(SystemColor.menu);
		
		JEditorPane editorPane = new JEditorPane();
		
		JEditorPane editorPane_1 = new JEditorPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtDanhSch, 163, 163, 163)
										.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(button)
											.addPreferredGap(ComponentPlacement.RELATED))
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(92)
											.addComponent(txtThiGianTr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(42)
											.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
											.addGap(144)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(editorPane_1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(editorPane)
										.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
									.addGap(19)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(txtBinBnBn, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
											.addComponent(txtMcch, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(10)
											.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))))
							.addGap(96))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnHonTt, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtMcch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtBinBnBn, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(editorPane, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton))
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(2)
									.addComponent(txtDanhSch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtThiGianTr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(editorPane_1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(64)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(2)
					.addComponent(btnHonTt)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
		onListener();
	}
}
