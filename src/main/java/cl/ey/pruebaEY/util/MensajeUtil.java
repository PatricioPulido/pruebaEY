package cl.ey.pruebaEY.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.ey.pruebaEY.dto.BaseExceptionDto;
import cl.ey.pruebaEY.dto.MensajeDto;
import cl.ey.pruebaEY.log.LogAplcn;


public class MensajeUtil {
	
	private static final Logger objLog = LoggerFactory.getLogger(MensajeUtil.class); 

	public MensajeUtil() {}
	
	public static <T> MensajeDto<T> crearMensajeSinExito() {
		
		BaseExceptionDto objEx = new BaseExceptionDto();  
		
		MensajeDto<T> objMensaje = new MensajeDto<>();
		
		objEx.setCodigo(ConstanteUtil.CODIGO_REGLA_SIN_EXITO);
		
        objEx.setMensaje(ConstanteUtil.MENSAJE_REGLA_SIN_EXITO);             
        
        objMensaje.setMensaje(objEx);
        
		return objMensaje;
	}
	
	public static <T> MensajeDto<T> crearMensajeErrorApi(LogAplcn objLogAplcn) {
		
		BaseExceptionDto objEx = new BaseExceptionDto();  
		
		MensajeDto<T> objMensaje = new MensajeDto<>();
		
		objEx.setCodigo(ConstanteUtil.CODIGO_ERROR_API);
    	
    	objEx.setMensaje(ConstanteUtil.MENSAJE_ERROR_API);      	
    	                                
        objMensaje.setMensaje(objEx);
                
        objLog.error(objLogAplcn.toString());
        
		return objMensaje;
	}
	public static <T> MensajeDto<T> crearMensajeConExito(T objeto) {

        BaseExceptionDto objEx = new BaseExceptionDto();  

        MensajeDto<T> objMensaje = new MensajeDto<>();

        objEx.setCodigo(ConstanteUtil.CODIGO_REGLA_CON_EXITO);

        objEx.setMensaje(ConstanteUtil.MENSAJE_REGLA_CON_EXITO);             

        objMensaje.setObjeto(objeto);

        objMensaje.setMensaje(objEx);

        return objMensaje;
    }
}

