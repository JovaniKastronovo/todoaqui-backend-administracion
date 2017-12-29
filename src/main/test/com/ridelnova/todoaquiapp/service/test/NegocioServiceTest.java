package com.ridelnova.todoaquiapp.service.test;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ridelnova.todoaquiapp.dao.NegocioDao;
import com.ridelnova.todoaquiapp.service.NegocioService;
import com.ridelnova.todoaquiapp.springboot.TodoAquiSpringBoot;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(TodoAquiSpringBoot.class)
public class NegocioServiceTest extends TestCase {

	@Autowired
	private NegocioService negocioService;
	private static Logger log = Logger.getLogger(NegocioServiceTest.class);

	@Test
	public void obtenerNegocios() {
		log.info(negocioService.obtenerNegociosByCategoria(7));
	}
}
