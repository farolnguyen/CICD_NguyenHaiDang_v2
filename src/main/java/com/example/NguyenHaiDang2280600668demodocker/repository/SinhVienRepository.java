package com.example.NguyenHaiDang2280600668demodocker.repository;

import com.example.NguyenHaiDang2280600668demodocker.model.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Long> {
    boolean existsByMaSinhVien(String maSinhVien);
}
