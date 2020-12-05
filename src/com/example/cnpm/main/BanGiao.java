package com.example.cnpm.main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JLabel;


public class BanGiao extends JFrame {
	
	private DAO dao = new DAO();
	//private TT_Khachang frameKhachang = new TT_Khachang();

	private Vector<String> loaiVt = new Vector<String>();
	private Vector<String> maloaiVt = new Vector<String>();
	
	private JPanel contentPane;
	private Vector<String[]> rowVt = new Vector<String[]>();		// Vector luu du lieu bang 
 	private DefaultTableModel tableMode = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "M\u00E3 lo\u1EA1i", "T\u00EAn lo\u1EA1i", "\u0110\u01A1n v\u1ECB", "S\u1ED1 l\u01B0\u1EE3ng", " Hi\u1EC7n tr\u1EA1ng"
			}
		);
	
	int stt = 1;
	private JTextField textField_2;
	private JTextField txtThngTinNgi;
	private JTextField txtLoi;
	private JTextField txtMLoi;
	private JTextField txtSLngThu;
	private JComboBox comboBox_1;
	private JButton button_2;
	private JComboBox comboBox;
	private JButton button;
	private JTable table;
	private JButton button_1;
	private JEditorPane editorPane_3;
	private JEditorPane editorPane;
	private JEditorPane editorPane_2;
	private JLabel newLabel;

	/**
	 * Launch the application.
	 * 
	 */
	void onActionListener() {
		
		
		
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String dovat = loaiVt.get(comboBox.getSelectedIndex());
				dao.SQL("SELECT maloai FROM dovat WHERE loai LIKE N'" + dovat + "'");
				maloaiVt.clear();
				while(dao.next()) {
					maloaiVt.add(dao.getColumn("maloai"));	
				}
				comboBox_1.setModel(new DefaultComboBoxModel(maloaiVt));
				
				String img_name = comboBox_1.getItemAt(0).toString().substring(0,3) + ".png";
				createImage(img_name);
			}
		});
		
		comboBox_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String img_name = comboBox_1.getSelectedItem().toString().substring(0,3) + ".png";
				createImage(img_name);
				
			}
		});
		
		button.addActionListener(new ActionListener() {							// Nút thêm 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String maloai = maloaiVt.get(comboBox_1.getSelectedIndex());
					String soluong = editorPane_3.getText();
					int i = Integer.parseInt(soluong);
					if (i <= 0) throw new NumberFormatException();
					dao.SQL("SELECT loai,donvi,soluong,hientrang FROM dovat WHERE maloai = '" + maloai + "'");	
					dao.next();
					if (!isExist(maloai, i, dao)) {
						
						int index = tableMode.getRowCount();
						rowVt.add(new String[] {
								"" + (index + 1), 
								maloai,
								dao.getColumn("loai"),
								dao.getColumn("donvi"),
								soluong,
								dao.getColumn("hientrang")
						});
						tableMode.addRow(rowVt.lastElement());
					}
				}catch (ArrayIndexOutOfBoundsException e1) {
					JOptionPane.showMessageDialog(null, "    H\u00E3y ch\u1ECDn \u0111\u1ED3 v\u1EADt tr\u01B0\u1EDBc !");
				}catch(NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "    S\u1ED1 l\u01B0\u1EE3ng kh\u00F4ng h\u1EE3p l\u1EC7 !");
				}catch(NullPointerException e3) {
					JOptionPane.showMessageDialog(null, "Kh\u00F4ng c\u00F2n \u0111\u1EE7 s\u1ED1 l\u01B0\u1EE3ng v\u1EEBa nh\u1EADp !");
				}
			}
		});
		
		button_1.addActionListener(new ActionListener() {						// Delete Button
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					
					int index = table.getSelectedRow();
					tableMode.removeRow(index);
					rowVt.remove(index);
					int size = rowVt.size();
					for (int i = index; i < size; i++) {
						tableMode.removeRow(index);
						String[] tmp = rowVt.get(i);
						tmp[0] = "" + (Integer.parseInt(tmp[0]) - 1);
					}
					for (int i = index; i < size; i++) {
						tableMode.addRow(rowVt.get(i));
					}
				
					
				} catch(ArrayIndexOutOfBoundsException e1) {
					
				}
				catch(NullPointerException e2) {
					
				}
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked");
				//frameKhachang.setVisible(true);
			}
		});
		
		/*frameKhachang.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				//if(frameKhachang.isCompletedInfor()) editorPane_2.setText(frameKhachang.getInfor());
				
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
			
			}
			
			
		});*/
	}
	
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

	/**
	 * Create the frame.
	 */
	public BanGiao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		Font fn = new Font("Arial",Font.PLAIN,13);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 466, 774, 163);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(tableMode);
		scrollPane.setViewportView(table);
		
		button = new JButton("Th\u00EAm");
		button.setBounds(189, 427, 174, 29);
		contentPane.add(button);
		
		button_1 = new JButton("Xo\u00E1");
		button_1.setBounds(446, 427, 175, 29);
		contentPane.add(button_1);
		
		
		dao.SQL("SELECT DISTINCT loai FROM dovat");
		while(dao.next()) {
			loaiVt.add(dao.getColumn("loai"));
			
		}
		comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setName("");
		comboBox.setFont(new Font("Arial", Font.PLAIN, 13));
		comboBox.setBounds(60, 76, 100, 35);
		comboBox.setModel(new DefaultComboBoxModel(loaiVt));
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("");
		comboBox_1.setName("");
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 13));
		comboBox_1.setBounds(253, 76, 77, 35);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"BAN01"}));
		contentPane.add(comboBox_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setText("M\u1EE5c \u0111\u00EDch s\u1EED d\u1EE5ng nh\u00E0 v\u0103n ho\u00E1");
		textField_2.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.menu);
		textField_2.setBounds(10, 20, 222, 35);
		contentPane.add(textField_2);
		
		txtThngTinNgi = new JTextField();
		txtThngTinNgi.setEditable(false);
		txtThngTinNgi.setText("  Th\u00F4ng tin ng\u01B0\u1EDDi thu\u00EA");
		txtThngTinNgi.setFont(new Font("Arial", Font.PLAIN, 13));
		txtThngTinNgi.setColumns(10);
		txtThngTinNgi.setBackground(SystemColor.menu);
		txtThngTinNgi.setBounds(527, 76, 147, 35);
		contentPane.add(txtThngTinNgi);
		
		button_2 = new JButton("Tu\u1EF3 ch\u1EC9nh");
		
		button_2.setBounds(684, 76, 102, 35);
		button_2.setFont(fn);
		contentPane.add(button_2);
		
		editorPane_2 = new JEditorPane();
		editorPane_2.setEditable(false);
		editorPane_2.setBounds(526, 124, 258, 150);
		contentPane.add(editorPane_2);
		
		editorPane_3 = new JEditorPane();
		editorPane_3.setBounds(446, 76, 40, 35);
		contentPane.add(editorPane_3);
		
		txtLoi = new JTextField();
		txtLoi.setEditable(false);
		txtLoi.setText(" Lo\u1EA1i");
		txtLoi.setFont(new Font("Arial", Font.PLAIN, 13));
		txtLoi.setColumns(10);
		txtLoi.setBackground(SystemColor.menu);
		txtLoi.setBounds(10, 76, 40, 35);
		contentPane.add(txtLoi);
		
		txtMLoi = new JTextField();
		txtMLoi.setEditable(false);
		txtMLoi.setText(" M\u00E3 lo\u1EA1i");
		txtMLoi.setFont(new Font("Arial", Font.PLAIN, 13));
		txtMLoi.setColumns(10);
		txtMLoi.setBackground(SystemColor.menu);
		txtMLoi.setBounds(170, 76, 60, 35);
		contentPane.add(txtMLoi);
		
		txtSLngThu = new JTextField();
		txtSLngThu.setEditable(false);
		txtSLngThu.setText(" S\u1ED1 l\u01B0\u1EE3ng thu\u00EA");
		txtSLngThu.setFont(new Font("Arial", Font.PLAIN, 13));
		txtSLngThu.setColumns(10);
		txtSLngThu.setBackground(SystemColor.menu);
		txtSLngThu.setBounds(340, 76, 96, 35);
		contentPane.add(txtSLngThu);
		
		editorPane = new JEditorPane();
		editorPane.setBounds(263, 20, 521, 35);
		contentPane.add(editorPane);
		
		newLabel = new JLabel("");
		newLabel.setBounds(10, 121, 475, 285);
		contentPane.add(newLabel);
		String img_name = comboBox_1.getItemAt(0).toString().substring(0,3) + ".png";
		createImage(img_name);
		
		onActionListener();
		
	}
	void createImage(String img_name) {
		Image img = new ImageIcon(this.getClass().getResource("/images/"+ img_name)).getImage();
		ImageIcon icon = new ImageIcon(img);
		int width = icon.getIconWidth();
		newLabel.setBounds(10 + (475 - width)/2, 121, 475, 285);
		newLabel.setIcon(icon);
	}
	
	private boolean isExist(String maloai, int number, DAO dao) {
		int soluong = Integer.parseInt(dao.getColumn("soluong"));
		if (number > soluong ) throw new NullPointerException();
		int size = rowVt.size();
		for (int i = 0; i < size; i++) {
			String[] tmp = rowVt.get(i);	
			if (maloai.equals(tmp[1])) {
				int sum = Integer.parseInt(tmp[4]) + number;
				if (sum > soluong) throw new NullPointerException();
				for (int j = i ; j < size; j++) {
					tableMode.removeRow(i);
				}
				tmp[4] = "" + sum;
				for (int j = i; j < size; j++) {
					tableMode.addRow(rowVt.get(j));
				}
				return true;
			}
			
		}
		return false;
	}
}