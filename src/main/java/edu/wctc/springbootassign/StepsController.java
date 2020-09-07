package edu.wctc.springbootassign;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/steps")
public class StepsController {

    @RequestMapping("/step-1")
    public String getStep1(Model model){
        model.addAttribute("pageTitle","How to Kickflip :: STEP 1");
        return "pages/step1";
    }

    @RequestMapping("/step-2")
    public String getStep2(Model model){
        model.addAttribute("pageTitle","How to Kickflip :: STEP 2");
        return "pages/step2";
    }

    @RequestMapping("/step-3")
    public String getStep3(Model model){
        model.addAttribute("pageTitle","How to Kickflip :: STEP 3");
        return "pages/step3";
    }


}
