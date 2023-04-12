package min.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value = "/mainPage.do")
    public ModelAndView mainPage(){
        ModelAndView mav = new ModelAndView("mav");
        mav.setViewName("main/main");
        return mav;
    }

}
