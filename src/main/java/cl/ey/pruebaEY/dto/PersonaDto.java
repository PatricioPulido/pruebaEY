package cl.ey.pruebaEY.dto;

import java.time.LocalDate;
import java.util.List;

import com.googlecode.jmapper.annotations.JGlobalMap;

import cl.ey.pruebaEY.entity.Phone;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JGlobalMap

public class PersonaDto {

	private int idPersona;
	private String name;
	private String email;
	private String password;
	private List<Phone> phones;
	private LocalDate created;
	private LocalDate modified;
	private LocalDate last_login;
	private String token;
	private boolean isactive;
}
