package min.crud.web;

import min.crud.service.CrudService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class CrudController {

    @Resource(name = "crudService")
    private CrudService service;

    @RequestMapping(value = "/crudPage.do")
    public ModelAndView crudPage(){
        ModelAndView mav = new ModelAndView("mav");
        mav.setViewName("crud/crud");
        return mav;
    }

    @GetMapping(value = "/crudGet.do")
    public ModelAndView crudGet(){
        ModelAndView mav = new ModelAndView("mav");
        int count = service.count();
        return mav;
    }

/*
    @GetMapping

    @PostMapping

    @PutMapping

    @DeleteMapping
*/

}
