package cl.ey.pruebaEY.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IdPersona;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@OneToMany(cascade= CascadeType.ALL)
	@IndexColumn(name="idx")
	@JoinColumn(name="IdPersona")
	private List<Phone> phones;
	@Column(name = "created")
	private String created;
	@Column(name = "modified")
	private String modified;
	@Column(name = "last_login")
	private String last_login;
	@Column(name = "token")
	private String token;
	@Column(name = "isactive")
	private boolean isactive;
	public int getIdPersona() {
		return IdPersona;
	}
	public void setIdPersona(int idPersona) {
		IdPersona = idPersona;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public String getLast_login() {
		return last_login;
	}
	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	@Override
	public String toString() {
		return "Persona [IdPersona=" + IdPersona + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", created=" + created + ", modified=" + modified + ", last_login=" + last_login + ", token=" + token
				+ ", isactive=" + isactive + "]";
	}

	
}
