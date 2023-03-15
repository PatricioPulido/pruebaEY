package cl.ey.pruebaEY.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ey.pruebaEY.entity.Persona;
import cl.ey.pruebaEY.repository.IPersonaReptry;
import cl.ey.pruebaEY.service.IPersonaService;

@Service
public class PersonaServImpl implements IPersonaService{

	@Autowired
    private IPersonaReptry personaReprty;
	
	@Override
	public Persona crear(Persona persona) {
		return personaReprty.save(persona);
	}

}
