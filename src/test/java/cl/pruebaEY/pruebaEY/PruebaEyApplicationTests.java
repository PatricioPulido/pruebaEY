package cl.pruebaEY.pruebaEY;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import cl.ey.pruebaEY.dto.PersonaDto;
import cl.ey.pruebaEY.repository.IPersonaReptry;
import cl.ey.pruebaEY.service.IPersonaService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.Test;
@SpringBootTest
public class PruebaEyApplicationTests {
	
	@Mock
	private IPersonaReptry personaReprty;
	
	@InjectMocks
	private IPersonaService personaService;

	@Test
	void crear() {
		PersonaDto esperado= new PersonaDto("prueba");
		Mockito.when(personaReprty.crear("prueba"))
			.thenReturn(esperado);
		final PersonaDto resultado =
				personaService.crear("prueba");
		Assertions.asserEquals(esperado.getIdPersona());
		Asesrtions.asserEquals(esperado.getName());
		Asesrtions.asserEquals(esperado, resultado);
		
	}

}
