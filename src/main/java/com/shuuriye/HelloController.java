package com.shuuriye;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController
public class HelloController {

    //    @GetMapping("/hello")
//    //@RequestMapping(value ="/hello", method = RequestMethod.GET)
//    // @ResponseBody
//    public String showMessage() {
//        return "Hello , welocme to spring boot";
//    }
//    @GetMapping("/className")
//    public String showClassName() {
//        return "Hello , welocme CA214 CLASS";
//    }
    //@GetMapping("/")
    @RequestMapping(method=RequestMethod.GET)
    public String show(Model model) {
        model.addAttribute("name", "CA214 CLASS");
        model.addAttribute("text", "Jamhuriya university!");
        return "hello";
    }

}
