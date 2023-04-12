package min.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {

    @RequestMapping(value = "/loginPage.do")
    public ModelAndView loginPage(){
        ModelAndView mav = new ModelAndView("mav");
        mav.setViewName("security/login");
        return mav;
    }

}
