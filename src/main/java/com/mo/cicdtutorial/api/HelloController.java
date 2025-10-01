package com.mo.cicdtutorial.api;

import com.mo.cicdtutorial.logic.MyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api/pub")
public class HelloController {

    private final MyService myService;

    public HelloController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping(path = "/greet")
    public @ResponseBody String greet() {
        return myService.greet();
    }

    @GetMapping(path = "/calculate/{number}")
    public @ResponseBody double calc(@PathVariable(name = "number") double num) {
        return myService.increaseNumbers(num);
    }
}
