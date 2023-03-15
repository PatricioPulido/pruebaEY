package cl.ey.pruebaEY.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class MensajeDto<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private transient T objeto;
	private BaseExceptionDto status;

	public T getObjeto() {
		return objeto;
	}

	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}	
	
	public BaseExceptionDto getStatus() {
		return status;
	}
	public void setMensaje(BaseExceptionDto status) {
		this.status = status;
	}

}
