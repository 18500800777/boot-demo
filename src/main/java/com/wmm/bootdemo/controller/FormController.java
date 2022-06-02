package com.wmm.bootdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * author : wmm
 * date : 2022-05-27 13:56
 * description :
 */
@Controller
@Slf4j
public class FormController {


    @GetMapping("/form_layouts")
    public String basicTable(){
        // int i= 10/0;
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        return "form/form_layouts";
    }



    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile[] photos){
        log.info("上传的信息：email={},username={},headerImg={},photos={}",email,username,headerImg.getSize(),photos.length);
        return "index";
    }
}
