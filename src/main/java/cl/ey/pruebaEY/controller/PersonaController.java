package cl.ey.pruebaEY.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cl.ey.pruebaEY.dto.MensajeDto;
import cl.ey.pruebaEY.dto.PersonaDto;
import cl.ey.pruebaEY.entity.Persona;
import cl.ey.pruebaEY.log.LogAplcn;
import cl.ey.pruebaEY.mapper.Mapper;
import cl.ey.pruebaEY.service.IPersonaService;
import cl.ey.pruebaEY.util.ConstanteUtil;
import cl.ey.pruebaEY.util.MensajeUtil;
import cl.ey.pruebaEY.util.RespuestaUtil;
import cl.ey.pruebaEY.util.ValidarUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
public class PersonaController {
	
	@Autowired
	private IPersonaService objPerServ;
	
	private static final Logger objLog = LoggerFactory.getLogger(PersonaController.class);

	
	@GetMapping("/saludar")
	public String saludar() {
		return "Buenas, Soy Patricio Pulido desarrollador";
	}
	
	/*@PostMapping("/crear")
	public Usuario crear() {
		return Usuario; 
	}*/
	
	@Autowired
	private ValidarUtil objValUtil;
	
	@ApiOperation(value = "Crea una persona")
	@PostMapping(value = "/crear", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ApiResponses({
			@ApiResponse(code = 204, message = "Funcionalidad ejecutada con error", response = HttpStatus.class),
			@ApiResponse(code = 200, message = "Funcionalidad ejecutada con exito", response = PersonaDto.class) })
	public ResponseEntity<MensajeDto<PersonaDto>> crear(@RequestBody PersonaDto persona) {
        LogAplcn objLogAplcn = new LogAplcn();
        MensajeDto<PersonaDto> objMensaje = new MensajeDto<>();
        objMensaje.setObjeto(null);
        objLogAplcn.agregarMensajeGenerico("Ejecucion metodo crear");
        try {
            objLogAplcn.agregarDatoNegocio(ConstanteUtil.MENSAJE_LOG_PERSONADTO, persona.toString());
            if (objValUtil.validarObj(persona)) {
                PersonaDto objPers = Mapper.map(objPerServ.crear(Mapper.map(persona, Persona.class)),PersonaDto.class);
                if(objPers!=null){
                    objMensaje = MensajeUtil.<PersonaDto>crearMensajeConExito(objPers);   
                    objLogAplcn.agregarDatoNegocio("apiPersonaV2.crear.mensaje",String.valueOf("")); //objpersona
                }else {
                    objMensaje = MensajeUtil.<PersonaDto>crearMensajeSinExito();
                }
            } else {
                objMensaje = MensajeUtil.<PersonaDto>crearMensajeSinExito();
            }
        } catch (Exception ex) {
            objLogAplcn.agregarException(ex);
            objMensaje = MensajeUtil.<PersonaDto>crearMensajeErrorApi(objLogAplcn);
        } finally {
            objLog.info(objLogAplcn.toString());
        }
        return RespuestaUtil.ok(objMensaje);
    }
	
	@PostMapping(value = "/save")
	public ResponseEntity <Persona> save(@RequestBody Persona persona) {return ResponseEntity.ok().body(this.objPerServ.crear(persona));}
	
}
