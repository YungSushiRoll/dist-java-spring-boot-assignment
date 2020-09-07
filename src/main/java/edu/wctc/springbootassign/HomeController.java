package edu.wctc.springbootassign;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("pageTitle", "How to Kickflip");
        return "index";
    }

    @RequestMapping("/home")
    public String fwd(Model model){
        model.addAttribute("pageTitle", "How to Kickflip");
        return "index";
    }

    @RequestMapping("/redirect/video")
    public String redirect(Model model){
        model.addAttribute("pageTitle","How to kickflip :: Video");
        return "/pages/video";
        //return "redirect:https://www.youtube.com/watch?v=Zebs7JZ2PW0&ab_channel=JonnyGiger";
    }
}
