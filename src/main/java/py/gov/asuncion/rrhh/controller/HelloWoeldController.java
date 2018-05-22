package py.gov.asuncion.rrhh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/say")
public class HelloWoeldController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "helloworld";
    }

}
