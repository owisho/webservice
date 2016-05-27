package per.owisho.learn.webservice.inter;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {

	@WebMethod
	String sayhello();
	
	String localmethod();
}
