/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.gov.asuncion.rrhh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import py.gov.asuncion.rrhh.service.EjercicioService;

/**
 *
 * @author vinsfran
 */
@Controller
@RequestMapping("/ejercicio")
public class EjercicioController {

    public static final String EJERCICIO_VIEW = "ejercicio";

    @Autowired
    @Qualifier("ejercicioService")
    private EjercicioService ejercicioService;

    @GetMapping("/ejer1")
    public String ejer1(Model model) {
        return EJERCICIO_VIEW;
    }

    @GetMapping("/ejer2")
    public String ejer2(Model model) {
        ejercicioService.getMensaje();
        model.addAttribute("mensaje", "Cadena de caracteres");
        return EJERCICIO_VIEW;
    }
}
