package cl.ey.pruebaEY.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import cl.ey.pruebaEY.entity.Persona;

@Component("validarUtil")
public class ValidarUtil {
	

	public boolean validarArg(String rutAsegurado) {
		
		if (rutAsegurado.equals("")) {
			return false;
		}
		
		return true;
	}
	
public boolean validarArgCORREO(Persona p) {
		
		if (p.getClass().equals("")) {
			return false;
		}
	
	 // Patrón para validar el email
    Pattern pattern = Pattern
            .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

    // El email a validar
    String email = p.getEmail();

    Matcher mather = pattern.matcher(email);

    if (mather.find() == true) {
        System.out.println("El email ingresado es válido.");
    } else {
        System.out.println("El email ingresado es inválido.");
    }
    
	return true;
	}
	
	public <T> boolean validarObj(T objeto) {
		
		if (objeto == null) {
			return false;
		}		
		return true;
	}	
	
	

}
