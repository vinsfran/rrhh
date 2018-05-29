/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.gov.asuncion.rrhh.service.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import py.gov.asuncion.rrhh.entity.Course;
import py.gov.asuncion.rrhh.repository.CourseJpaRepository;
import py.gov.asuncion.rrhh.service.CourseService;

/**
 *
 * @author vinsfran
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {

    private static final Log LOG = LogFactory.getLog(CourseServiceImpl.class);

    @Autowired
    @Qualifier("courseJpaRepository")
    private CourseJpaRepository courseJpaRepository;

    @Override
    public List<Course> listAllCourses() {
        return courseJpaRepository.findAll();
    }

    @Override
    public Course addCourse(Course course) {
        //Guarda el objeto recibido y luego retorna el objeto guardado
        return courseJpaRepository.save(course);
    }

    @Override
    public int removeCourse(int id) {
        courseJpaRepository.deleteById(id);
        return 0;
    }

    @Override
    public Course updateCourse(Course course) {
        return courseJpaRepository.save(course);
    }

}
