package cl.ey.pruebaEY.log;

public class LogAplcn {

	private StringBuilder objMsgJson;
	private StringBuilder objMsgJsonGenerico;
	private StringBuilder objMsgJsonException;

	public LogAplcn() {
		
		this.objMsgJson = new StringBuilder();
		this.objMsgJsonGenerico = new StringBuilder();
		this.objMsgJsonException = new StringBuilder();
	}

	public void agregarDatoNegocio(String clave, String valor) {
		
		if (this.objMsgJson.length() == 0)
			this.objMsgJson.append("{");
		else
			this.objMsgJson.append(",");
		
		this.objMsgJson.append("\"");
		this.objMsgJson.append(clave);
		this.objMsgJson.append("\":\"");
		this.objMsgJson.append(valor);
		this.objMsgJson.append("\"");
	}

	public void agregarMensajeGenerico(String mensaje) {
		
		if (this.objMsgJsonGenerico.length() == 0)
			this.objMsgJsonGenerico.append("\"log\":[");
		else
			this.objMsgJsonGenerico.append(",");
		
		this.objMsgJsonGenerico.append("\"");
		this.objMsgJsonGenerico.append(mensaje);
		this.objMsgJsonGenerico.append("\"");
	}

	public void agregarException(Exception exception) {
		
		this.objMsgJsonException.append("\"exception\":\"");
		this.objMsgJsonException.append(exception.toString());
		
		for (StackTraceElement stack : exception.getStackTrace()) {
			this.objMsgJsonException.append("\n");
			this.objMsgJsonException.append(stack.toString());
		}
		
		this.objMsgJsonException.append("\"");
	}

	@Override
	public String toString() {
		
		if (this.objMsgJsonGenerico.length() > 0) {
			if (this.objMsgJson.length() > 0)
				this.objMsgJson.append(",");
			else
				this.objMsgJson.append("{");
			
			this.objMsgJson.append(this.objMsgJsonGenerico);
			this.objMsgJson.append("]");
		}
		if (this.objMsgJsonException.length() > 0) {
			if (this.objMsgJson.length() > 0)
				this.objMsgJson.append(",");
			else
				this.objMsgJson.append("{");
			
			this.objMsgJson.append(this.objMsgJsonException);
		}
		if (this.objMsgJson.length() > 0)
			this.objMsgJson.append("}");

		return this.objMsgJson.toString();
	}
}

