package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichControllers {
    @GetMapping("/home")
   public String home(){
        return "home";
    }

    @PostMapping("/changehome")
    public String listCondiments(@RequestParam(name = "condiment") String condiment, Model model){
        model.addAttribute("condiment",condiment);
        return "ChangeHome";
    }
}
