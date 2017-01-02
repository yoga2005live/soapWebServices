package soapWebServices;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {

	public List<String> getProductsCategory() {
		List<String> categorys = new ArrayList<>();
		categorys.add("Books");
		categorys.add("Music");
		categorys.add("Movies");
		categorys.add("Videos");
		return categorys;

	}

}
