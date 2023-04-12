package min.crud.web;

import min.crud.service.CrudService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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

    @RequestMapping(value = "/crudGetData.do")
    @ResponseBody
    public Map<String, Object> crudGetData() {
        Map<String, Object> result = new HashMap<String, Object>();
        int count = service.count();
        result.put("result", count);
        return result;
    }

}
