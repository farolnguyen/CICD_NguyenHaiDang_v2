package com.example.NguyenHaiDang2280600668demodocker;

import com.example.NguyenHaiDang2280600668demodocker.model.SinhVien;
import com.example.NguyenHaiDang2280600668demodocker.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private SinhVienRepository sinhVienRepository;

    @Override
    public void run(String... args) {
        if (sinhVienRepository.count() == 0) {
            sinhVienRepository.save(new SinhVien("Nguyễn Hải Đăng",  "2280600668", "DHKTPM17A", "Khoa CNTT"));
            sinhVienRepository.save(new SinhVien("Võ Trường Huy",       "2280600001", "DHKTPM17A", "Khoa CNTT"));
            sinhVienRepository.save(new SinhVien("Bùi Bảo Hân",       "2280600002", "DHKTPM17B", "Khoa CNTT"));
            sinhVienRepository.save(new SinhVien("Trương Minh Nhiều",   "2280600003", "DHKTPM17A", "Khoa CNTT"));
            sinhVienRepository.save(new SinhVien("Nguyễn Xuân Minh",    "2280600004", "DHKTPM17B", "Khoa CNTT"));
        }
    }
}
