package ca.bc.gov.proto_service.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/protoservice")
public class ProtoServiceResource {
	
	/**
	 * My cool new prototype webservice to deploy to openshift
	 */

	@RequestMapping(method = RequestMethod.GET)
	public String helloWorld() {
		final String answer="Shiny!";
		return answer;
	}
	
}
