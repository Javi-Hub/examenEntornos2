package com.savalero.examenWebinar2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sanvalero.examenWebinar2.model.Usuario;
import com.sanvalero.examenWebinar2.model.Visitante;

public class ConcursoTest {

	private static Usuario nuevoUsuario;
	
	@Test
	public static void registrarUsuarioTest() {
		nuevoUsuario = new Usuario();
		Visitante Visitante1 = new Visitante("jx.com", "2");
		Visitante Visitante2 = new Visitante("jx.com", "");
		
		assertEquals(true, nuevoUsuario.registrarUsuario(Visitante1));
		assertEquals(false, nuevoUsuario.registrarUsuario(Visitante2));
		
	}
	
}
