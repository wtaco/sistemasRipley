package ripley.lista.regalo.web.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ripley.lista.regalo.bean.ParametroCabBean;
import com.ripley.lista.regalo.bean.TipoEventoBean;
import com.ripley.lista.regalo.service.EventoListaRegaloService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@ComponentScan(basePackages={"com"})
public class ListaRegaloController {

	 @Autowired
	 EventoListaRegaloService eventoListaRegaloService;
	
	@RequestMapping(method = RequestMethod.GET, path = "/listTrxHeader")   
    public List<TipoEventoBean> listTrxHeader(){
	    List<TipoEventoBean> listTrxHeader = eventoListaRegaloService.listTrxHeader();
      return listTrxHeader;
    }

	/*@RequestMapping(method = RequestMethod.POST)
	public void insertUser(@RequestBody ParametroCabBean parametroCabBean) {
		System.out.println("Servicio Insert");
		eventoListaRegaloService.insertParametroCab(parametroCabBean);
	}*/
	
	@RequestMapping(value = "/addParametros", method = RequestMethod.POST, headers = "Accept=application/json")
	public void insertUser(@RequestBody ParametroCabBean parametroCabBean) {
		System.out.println("Servicio Insert");
		eventoListaRegaloService.insertParametroCab(parametroCabBean);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public ResponseEntity<ParametroCabBean> update(@RequestBody ParametroCabBean parametroCabBean) {
		System.out.println("Servicio Update");
		eventoListaRegaloService.insertParametroCab(parametroCabBean);
	    // TODO: call persistence layer to update
	    return new ResponseEntity<ParametroCabBean>(parametroCabBean, HttpStatus.OK);
	}
	    
}
