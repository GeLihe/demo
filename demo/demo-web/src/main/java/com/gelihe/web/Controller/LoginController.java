package com.gelihe.web.Controller;

import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping
    public String toPage(Model model) {
        return "/user/loginPage";
    }

    @RequestMapping(params = "action=submit")
    @ResponseBody
    public Object login(HttpServletRequest req) {
        return null;
    }

    @RequestMapping(params = "action=registerPage")
    public Object registerPage(HttpServletRequest req) {
        return "/user/registerPage";
    }

    @RequestMapping(params = "action=submit")
    @ResponseBody
    public Object register(HttpServletRequest req) {
        String email = String.valueOf(req.getAttribute("email"));
        String password = String.valueOf(req.getAttribute("password"));
        if(StrUtil.isBlank(email) || StrUtil.isBlank(password)){
            return "参数不能为空！";
        }


        return null;
    }

}
