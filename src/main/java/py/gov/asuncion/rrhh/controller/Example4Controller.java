/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.gov.asuncion.rrhh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author vinsfran
 */
@Controller
@RequestMapping("/example4")
public class Example4Controller {

    public static final String ERROR_VIEW_404 = "404";
    public static final String ERROR_VIEW_500 = "500";

    @GetMapping("/404")
    public String error404() {
        return ERROR_VIEW_404;
    }

    @GetMapping("/500")
    public String error500() {
        return ERROR_VIEW_500;
    }

}
