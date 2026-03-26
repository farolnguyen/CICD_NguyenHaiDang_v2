package com.example.NguyenHaiDang2280600668demodocker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sinh_vien")
public class SinhVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ho_ten", nullable = false)
    private String hoTen;

    @Column(name = "ma_sinh_vien", unique = true, nullable = false)
    private String maSinhVien;

    @Column(name = "lop")
    private String lop;

    @Column(name = "khoa")
    private String khoa;

    public SinhVien() {}

    public SinhVien(String hoTen, String maSinhVien, String lop, String khoa) {
        this.hoTen = hoTen;
        this.maSinhVien = maSinhVien;
        this.lop = lop;
        this.khoa = khoa;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public String getMaSinhVien() { return maSinhVien; }
    public void setMaSinhVien(String maSinhVien) { this.maSinhVien = maSinhVien; }

    public String getLop() { return lop; }
    public void setLop(String lop) { this.lop = lop; }

    public String getKhoa() { return khoa; }
    public void setKhoa(String khoa) { this.khoa = khoa; }
}
