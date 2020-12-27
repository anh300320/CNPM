package com.example.cnpm.main.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import com.example.cnpm.main.dao.DAO;
import com.example.cnpm.main.util.HoatDong;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;

public class LichSuHoatDong extends JFrame
{

  private JPanel contentPane;
  private JTable table;

  /**
   * Launch the application.
   */
  public static void main(String[] args)
  {
    EventQueue.invokeLater(new Runnable() {
      public void run()
      {
        try
        {
          LichSuHoatDong frame = new LichSuHoatDong();
          frame.setVisible(true);
        }
        catch (Exception e)
        {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public LichSuHoatDong()
  {
    setTitle("L\u1ECBch s\u1EED ho\u1EA1t \u0111\u1ED9ng");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setBounds(100, 100, 691, 438);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    
    String column[] = {"STT", "Tên hoạt động", "Thời gian bắt đầu", "Thời gian kết thúc", "Mục đích"};
    Vector<String> col = new Vector<>(Arrays.asList(column));
    Vector<HoatDong> data = new Vector<HoatDong>(); 
    
    DAO dao = new DAO();
    
    List<HoatDong> lsHd = dao.getAll("lshoatdong", HoatDong.class);
    for(HoatDong hd : lsHd)
    	data.add(hd);
    contentPane.setLayout(null);
    
    table = new JTable(data, col);
    table.setBounds(30, 40, 200, 300);
    JScrollPane sp = new JScrollPane(table);
    sp.setBounds(10, 90, 667, 311);
    contentPane.add(sp);
    
    JTextField txtQunLLch = new JTextField();
    txtQunLLch.setFont(new Font("Tahoma", Font.PLAIN, 12));
    txtQunLLch.setBorder(null);
    txtQunLLch.setBackground(SystemColor.menu);
    txtQunLLch.setText("QUẢN LÝ LỊCH SỬ HOẠT ĐỘNG");
    txtQunLLch.setBounds(232, 23, 225, 28);
    contentPane.add(txtQunLLch);
    txtQunLLch.setColumns(10);
    
    contentPane.setVisible(true);
  }

}
