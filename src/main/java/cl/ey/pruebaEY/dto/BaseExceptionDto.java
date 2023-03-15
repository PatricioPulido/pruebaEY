package cl.ey.pruebaEY.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class BaseExceptionDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String mensaje;

	private String codigo;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "BaseExceptionDto [mensaje=" + mensaje + ", codigo=" + codigo + "]";
	}
}
