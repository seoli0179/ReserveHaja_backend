package com.example.reservehaja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String indexPage(){
        return "index";
    }

    @GetMapping("/auth/login")
    public String loginPage(){
        return "/oauth2/login";
    }

    @GetMapping("/auth/join")
    public String joinPage(){
        return "/oauth2/join";
    }

    @GetMapping("/reserve")
    public String reserveIndexPage(){
        return "/reserve/index";
    }

    @GetMapping("/product")
    public String productIndexPage(){
        return "/product/index";
    }

    @GetMapping("/product/create")
    public String productCreatePage(){
        return "/product/create";
    }

    @GetMapping("/product/read")
    public String productReadPage(){
        return "/product/read";
    }

    @GetMapping("/product/update")
    public String productUpdatePage(){
        return "/product/update";
    }

    @GetMapping("/product/delete")
    public String productDeletePage(){
        return "/product/delete";
    }

}
