package cl.ey.pruebaEY.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.ey.pruebaEY.entity.Persona;

public interface IPersonaReptry extends JpaRepository<Persona, Long>{

}
