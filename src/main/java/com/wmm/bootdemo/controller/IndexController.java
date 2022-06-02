package com.wmm.bootdemo.controller;

import com.wmm.bootdemo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * author : wmm
 * date : 2022-05-26 17:09
 * description : 首页
 */
@Controller
public class IndexController {

    /**
     * 登录页
     */
    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }



    /**
     * 登录成功跳转页
     */
    @PostMapping(value = "/login")
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUsername()) && StringUtils.hasLength(user.getPassword())){
            session.setAttribute("user",user);
            // 登录成功重定向到index
            return "redirect:index.html";
        }else {
            // 登录失败
            model.addAttribute("error","账号或密码错误");
            return "login";
        }
    }

    /**
     * 首页
     */
    @GetMapping(value = "/index.html")
    public String indexPage(HttpSession session,Model model){
        if(session.getAttribute("user") == null){
            model.addAttribute("error","请重新登录");
            return "login";
        }
        return "index";
    }
}
