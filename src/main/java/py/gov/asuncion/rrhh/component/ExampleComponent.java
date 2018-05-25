/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.gov.asuncion.rrhh.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author vinsfran
 */
@Component("exampleComponent")
public class ExampleComponent {
    
    private static final Log LOG = LogFactory.getLog(ExampleComponent.class);
    
    public void sayHello(){
        LOG.info("HELLO FROM EXAMPLECOMPONENT");
    }
}
