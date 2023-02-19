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
        //firstInstance index의 처음 위치.
        return "firstinstance/index";
    }

    // 개발중, 테스트용 url연결 만듬.
   /*
    @GetMapping("/")
    public String index3(){

        return "redirect:/administer/instanceurl";
    }
*/
}