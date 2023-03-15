package cl.ey.pruebaEY.util;

public class ConstanteUtil {

	public ConstanteUtil() {

	}

	// Codigo globales de respuesta asignados por normativa, no se pueden utilizar para otros fines
	public static final String CODIGO_REGLA_CON_EXITO = "001";
	public static final String CODIGO_REGLA_SIN_EXITO = "002";
	public static final String CODIGO_ERROR_API = "003";

	// Mensaje globales de respuesta 	
	public static final String MENSAJE_REGLA_CON_EXITO = "Todas las reglas fueron ejecutadas correctamente";
	public static final String MENSAJE_REGLA_SIN_EXITO = "Una o varias reglas no se pudieron cumplir en forma correcta";
	public static final String MENSAJE_ERROR_API = "Error en el servicio";
	
	public static final String SIGNO_LIKE = "%";
	public static final String MENSAJE_SIN_INFORMACION = "Sin informacion";
	public static final String MENSAJE_VALIDACION_ERROR = "Existen uno o mas atributos que no pasaron la validacion";
	
	//Mensajes globales para registros en el log
	public static final String MENSAJE_LOG_PERSONADTO = "apiPersonaV2.PersonaDto";
}
