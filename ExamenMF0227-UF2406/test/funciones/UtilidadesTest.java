package funciones;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


class UtilidadesTest {

		
	
	
	
	@Test
	void devuelveNotaTest() {
		
		Utilidades u = new Utilidades();
		
		assertEquals("Suspenso", u.devuelveNota(4),"4");
		assertEquals("Bien",u.devuelveNota(6),"6");
		assertEquals("Notable",u.devuelveNota(8),"8");
		assertEquals("Sobresaliente",u.devuelveNota(9),"9");
		assertEquals("Matrícula",u.devuelveNota(10),"10");
		
		
		;
	}

}
