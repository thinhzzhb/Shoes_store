/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viewModel;

/**
 *
 * @author Admin
 */
public class GioHangViewModel {

    private String MaSP;
    private String TenSP;
    private String MauSac;
    private String KichCo;
    private int SoLuong;
    private Double DonGia;
    private Double GiamGia;
    private String HinhThucGiamGia;

    public GioHangViewModel() {
    }

    public GioHangViewModel(String MaSP, String TenSP, String MauSac, String KichCo, int SoLuong, Double DonGia, Double GiamGia, String HinhThucGiamGia) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.MauSac = MauSac;
        this.KichCo = KichCo;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
       
        this.GiamGia = GiamGia;
        this.HinhThucGiamGia = HinhThucGiamGia;
    }



    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    public Double getThanhTien() {
        return DonGia * SoLuong;
    }

    public Double getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(Double GiamGia) {
        this.GiamGia = GiamGia;
    }

    public String getHinhThucGiamGia() {
        return HinhThucGiamGia;
    }

    public void setHinhThucGiamGia(String HinhThucGiamGia) {
        this.HinhThucGiamGia = HinhThucGiamGia;
    }

    public Double khuyenMai() {
        return GiamGia * SoLuong;
    }

    public Double tongTien() {
        return DonGia * SoLuong - GiamGia * SoLuong;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public String getKichCo() {
        return KichCo;
    }

    public void setKichCo(String KichCo) {
        this.KichCo = KichCo;
    }

}
