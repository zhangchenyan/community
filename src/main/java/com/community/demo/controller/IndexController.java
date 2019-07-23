package com.community.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
create 2019.7.23
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index()
    {
        return "index";
    }
/*    public String hello(@RequestParam(name= "name") String name, Model model)
    {
        model.addAttribute("name",name);
        return "index";
    }*/
}
