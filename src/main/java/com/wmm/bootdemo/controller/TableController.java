package com.wmm.bootdemo.controller;

import com.wmm.bootdemo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * author : wmm
 * date : 2022-05-26 17:53
 * description :
 */
@Controller
public class TableController {



    @GetMapping("/basic_table")
    public String basicTable(){
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamicTable(Model model){
        List<User> users = Arrays.asList(new User("wmm", "123456"),
                new User("xiaoming", "123456"),
                new User("xiaohong", "123456"));
        model.addAttribute("users",users);
        return "table/dynamic_table";
    }

    @GetMapping("/editable_table")
    public String ediTable(){
        return "table/editable_table";
    }


    @GetMapping("/responsive_table")
    public String responsiveTable(){
        return "table/responsive_table";
    }
}
