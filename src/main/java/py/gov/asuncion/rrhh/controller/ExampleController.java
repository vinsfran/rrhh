/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.gov.asuncion.rrhh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author vinsfran
 */
@Controller
@RequestMapping("/example")
public class ExampleController {
    
    public static final String EXAMPLE_VIEW = "example";

    //Primera forma
    @GetMapping("/exampleString")
    public String exampleString(Model model){
        model.addAttribute("name", "Vicente");
        return EXAMPLE_VIEW;
    }
    
    //Segunda Forma
    @GetMapping("/exampleMAV")
    public ModelAndView exampleMAV(){
        ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
        mav.addObject("name", "Jesus");
        return mav;
    }
}
