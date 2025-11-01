package com.github.skskks1988.cleaning_app_backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    // フォーム表示
    @GetMapping("/form")
    public String showForm() {
        return "form"; // templates/form.html を返す
    }

    // 送信処理
    @PostMapping("/submit")
    public String submitForm(@RequestParam String testField, Model model) {
        model.addAttribute("inputText", testField); // HTMLに渡す値
        return "result"; // templates/result.html を返す
    }
}
