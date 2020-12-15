package com.example.cnpm.main.util;

import java.util.Vector;

public class HoatDong extends Vector<String>
{
  private int stt;
  private String tenHd;
  private String TgBatDau;
  private String TgKetThuc;
  private int maThue;
  private String mucDich;
  
  
  
  public HoatDong(int stt, String tenHd, String tgBatDau, String tgKetThuc, int maThue, String mucDich)
  {
    super();
    this.stt = stt;
    this.tenHd = tenHd;
    TgBatDau = tgBatDau;
    TgKetThuc = tgKetThuc;
    this.maThue = maThue;
    this.mucDich = mucDich;
    initVector();
  }
  
  private void initVector()
  {
    clear();
    add(Integer.toString(stt));
    add(tenHd);
    add(TgKetThuc);
    add(TgBatDau);
    add(Integer.toString(maThue));
    add(mucDich);
  }
  
  public int getStt()
  {
    return stt;
  }
  public void setStt(int stt)
  {
    this.stt = stt;
    initVector();
  }
  public String getTenHd()
  {
    return tenHd;
  }
  public void setTenHd(String tenHd)
  {
    this.tenHd = tenHd;
    initVector();
  }
  public String getTgBatDau()
  {
    return TgBatDau;
  }
  public void setTgBatDau(String tgBatDau)
  {
    TgBatDau = tgBatDau;
    initVector();
  }
  public String getTgKetThuc()
  {
    return TgKetThuc;
  }
  public void setTgKetThuc(String tgKetThuc)
  {
    TgKetThuc = tgKetThuc;
    initVector();
  }
  public int getMaThue()
  {
    return maThue;
  }
  public void setMaThue(int maThue)
  {
    this.maThue = maThue;
    initVector();
  }
  public String getMucDich()
  {
    return mucDich;
  }
  public void setMucDich(String mucDich)
  {
    this.mucDich = mucDich;
    initVector();
  }
  
  
}
