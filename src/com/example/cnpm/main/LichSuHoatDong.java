package com.example.cnpm.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import com.example.cnpm.main.util.HoatDong;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import javax.swing.JTable;
import javax.swing.JButton;

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
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    contentPane.setLayout(new BorderLayout(0, 0));
    setContentPane(contentPane);
    
    String column[] = {"stt", "Ten hoat dong", "Thoi gian bat dau", "thoi gian ket thuc", "ma thue", "muc dich"};
    Vector<String> col = new Vector<>(Arrays.asList(column));
    Vector<HoatDong> data = new Vector<HoatDong>(); 
    
    DAO dao = new DAO();
    
    List<HoatDong> lsHd = dao.getAll("lshoatdong", HoatDong.class);
    for(HoatDong hd : lsHd)
    	data.add(hd);
    
    table = new JTable(data, col);
    table.setBounds(30, 40, 200, 300);
    JScrollPane sp = new JScrollPane(table);
    contentPane.add(sp, BorderLayout.CENTER);
   
    
    JButton btnNewButton = new JButton("New button");
    contentPane.add(btnNewButton, BorderLayout.SOUTH);
    
    contentPane.setVisible(true);
  }

}
