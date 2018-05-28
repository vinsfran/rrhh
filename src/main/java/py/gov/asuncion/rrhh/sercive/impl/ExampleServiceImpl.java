/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.gov.asuncion.rrhh.sercive.impl;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import py.gov.asuncion.rrhh.model.Person;
import py.gov.asuncion.rrhh.sercive.ExampleService;

/**
 *
 * @author vinsfran
 */
@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

    private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);

    @Override
    public List<Person> getListPeople() {
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
        LOG.info("HELLO FROM SERVICE");
        return people;
    }

}
