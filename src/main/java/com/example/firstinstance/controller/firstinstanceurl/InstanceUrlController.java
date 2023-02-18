package com.example.firstinstance.controller.firstinstanceurl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InstanceUrlController {

    @GetMapping("/administer/instanceurl")
    public String index(){
        //firstInstance index의 처음 위치.
        return "firstinstance/index";
    }


    @GetMapping("/admin")
    public String index2(){

        return "redirect:/administer/instanceurl";
    }



}