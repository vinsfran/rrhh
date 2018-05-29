/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.gov.asuncion.rrhh.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import py.gov.asuncion.rrhh.service.EjercicioService;

/**
 *
 * @author vinsfran
 */
@Service("ejercicioService")
public class EjercicioServiceImpl implements EjercicioService {

    private static final Log LOG = LogFactory.getLog(EjercicioServiceImpl.class);

    @Override
    public void getMensaje() {
        LOG.info("HELLO FROM EJERCICIO SERVICE");
    }
}
