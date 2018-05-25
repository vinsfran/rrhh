/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.gov.asuncion.rrhh.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import py.gov.asuncion.rrhh.component.ExampleComponent;
import py.gov.asuncion.rrhh.model.Person;

/**
 *
 * @author vinsfran
 */
@Controller
@RequestMapping("/example")
public class ExampleController {

    public static final String EXAMPLE_VIEW = "example";

    @Autowired
    @Qualifier("exampleComponent")
    private ExampleComponent exampleComponent;
    
    //Primera forma
    @GetMapping("/exampleString")
    public String exampleString(Model model) {
        exampleComponent.sayHello();
        model.addAttribute("people", getPeople());
        return EXAMPLE_VIEW;
    }

    //Segunda Forma
    @GetMapping("/exampleMAV")
    public ModelAndView exampleMAV() {
        ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
        mav.addObject("people", getPeople());
        return mav;
    }

    private List<Person> getPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Vicente", 37));
        people.add(new Person("Carlos", 37));
        people.add(new Person("Fernando", 37));
        people.add(new Person("Jose", 37));
        people.add(new Person("Robert", 37));
        people.add(new Person("Cesar", 37));
        people.add(new Person("Rolo", 37));
        people.add(new Person("Gloria", 37));
        people.add(new Person("Judith", 37));
        people.add(new Person("Perla", 37));
        people.add(new Person("Arami", 37));
        return people;
    }
}
