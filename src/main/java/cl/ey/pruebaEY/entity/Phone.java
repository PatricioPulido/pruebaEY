package cl.ey.pruebaEY.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Phone")
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String number;
	@Column(name = "city_code")
	private String city_code;
	@Column(name = "country_code")
	private String country_code;
	@ManyToOne
	@JoinColumn(name="IdPersona")
	private Persona persona;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity_code() {
		return city_code;
	}
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	@Override
	public String toString() {
		return "Phone [number=" + number + ", city_code=" + city_code + ", country_code=" + country_code + ", persona="
				+ persona + "]";
	}
	
	
}

