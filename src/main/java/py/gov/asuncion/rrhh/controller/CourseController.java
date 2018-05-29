/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.gov.asuncion.rrhh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import py.gov.asuncion.rrhh.entity.Course;
import py.gov.asuncion.rrhh.service.CourseService;

/**
 *
 * @author vinsfran
 */
@Controller
@RequestMapping("/courses")
public class CourseController {

    public static final String COURSES_VIEW = "courses";

    @Autowired
    @Qualifier("courseServiceImpl")
    private CourseService courseService;

    @GetMapping("/listcourses")
    public ModelAndView listAllCourses() {
        ModelAndView mav = new ModelAndView(COURSES_VIEW);
        mav.addObject("courses", courseService.listAllCourses());
        return mav;
    }

    @PostMapping("/addcourse")
    public String addCourses(@ModelAttribute("course") Course course) {
        courseService.addCourse(course);
        return "redirect:/listCourses";
    }

}
