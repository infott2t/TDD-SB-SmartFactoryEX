package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UrlController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/search0")
    public String search0() { return "search0"; }

    @GetMapping("/search1sit")
    public String search1sit(){return "search1sit";}

    @GetMapping("/search1stand")
    public String search1stand() { return "search1stand"; }

    @GetMapping("/search1move")
    public String search1move() {return "search1move"; }

    @GetMapping("/search1panel")
    public String search1panel() {return "search1panel"; }

    @GetMapping("/search2stand_make")
    public String search2stame_make() {return "search2stand_make"; }

    @GetMapping("/search2stand_food")
    public String search2stand_food() {return "search2stand_food"; }

    @GetMapping("/search2stand_food_kimchi")
    public String search2stand_food_kimchi() {return "search2stand_food_kimchi"; }

    @GetMapping("/plan/kimchi")
    public String plan_kimchi() {return "plan/kimchi"; }

    @GetMapping("/plan/kimchi2")
    public String plan_kimchi2() {return "plan/kimchi2"; }

    @GetMapping("/plan/kimchi3")
    public String plan_kimchi3() {return "plan/kimchi3"; }

    @GetMapping("/plan/kimchi4")
    public String plan_kimchi4() {return "plan/kimchi4"; }

}