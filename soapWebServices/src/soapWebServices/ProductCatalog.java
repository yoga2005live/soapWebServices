package soapWebServices;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ProductCatalog {

	@WebMethod
	public List<String> getProductsCategory() {
		List<String> categorys = new ArrayList<>();
		categorys.add("Books");
		categorys.add("Music");
		categorys.add("Movies");
		categorys.add("Videos");
		return categorys;

	}

}
