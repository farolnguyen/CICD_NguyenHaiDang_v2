package com.example.NguyenHaiDang2280600668demodocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("tenSinhVien", "Nguyễn Hải Đăng");
        model.addAttribute("maSinhVien", "2280600668");
        model.addAttribute("monHoc", "Công cụ & Môi trường Phát triển Phần mềm");
        model.addAttribute("bai", "Bài 1 — Dockerfile");
        return "index";
    }
}
