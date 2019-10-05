package com.gelihe.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping
    public String toDemoPage(Model model) {
        model.addAttribute("title", "首页");
        return "/index";
    }
}
