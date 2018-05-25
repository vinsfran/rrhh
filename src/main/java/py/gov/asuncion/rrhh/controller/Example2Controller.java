/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.gov.asuncion.rrhh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author vinsfran
 */
@Controller
@RequestMapping("/example2")
public class Example2Controller {

    public static final String EXAMPLE2_VIEW = "example2";

    //localhost:8080/example2/request1?nm=JON
    //localhost:8080/example2/request1?nm=MIKEL
    @GetMapping("/request1")
    public ModelAndView request1(@RequestParam(name = "nm", required = false, defaultValue = "NULL") String name) {
        ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
        mav.addObject("nm_in_model", name);
        return mav;
    }

    //localhost:8080/example2/request2/JON
    //localhost:8080/example2/request2/MIKEL
    @GetMapping("/request2/{nm}")
    public ModelAndView request2(@PathVariable("nm") String name) {
        ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
        mav.addObject("nm_in_model", name);
        return mav;
    }
}
