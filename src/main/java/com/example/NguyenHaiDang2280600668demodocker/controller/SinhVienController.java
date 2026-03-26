package com.example.NguyenHaiDang2280600668demodocker.controller;

import com.example.NguyenHaiDang2280600668demodocker.model.SinhVien;
import com.example.NguyenHaiDang2280600668demodocker.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/sinhvien")
public class SinhVienController {

    @Autowired
    private SinhVienRepository sinhVienRepository;

    @GetMapping
    public String danhSach(Model model) {
        model.addAttribute("danhSach", sinhVienRepository.findAll());
        model.addAttribute("sinhVienMoi", new SinhVien());
        return "sinhvien";
    }

    @PostMapping("/them")
    public String themSinhVien(@ModelAttribute SinhVien sinhVien, RedirectAttributes ra) {
        if (sinhVienRepository.existsByMaSinhVien(sinhVien.getMaSinhVien())) {
            ra.addFlashAttribute("loi", "Mã sinh viên '" + sinhVien.getMaSinhVien() + "' đã tồn tại!");
        } else {
            sinhVienRepository.save(sinhVien);
            ra.addFlashAttribute("thanhCong", "Thêm sinh viên thành công!");
        }
        return "redirect:/sinhvien";
    }

    @GetMapping("/xoa/{id}")
    public String xoaSinhVien(@PathVariable Long id, RedirectAttributes ra) {
        sinhVienRepository.deleteById(id);
        ra.addFlashAttribute("thanhCong", "Đã xóa sinh viên!");
        return "redirect:/sinhvien";
    }
}
