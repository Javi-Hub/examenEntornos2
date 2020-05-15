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
		Visitante Visitante1 = new Visitante("j@x.com", "j@x.com");
		Visitante Visitante2 = new Visitante("j@x.com", "");
		
		assertEquals(true, nuevoUsuario.registrarUsuario(Visitante1));
		assertEquals(false, nuevoUsuario.registrarUsuario(Visitante2));
		
	}
	
}
