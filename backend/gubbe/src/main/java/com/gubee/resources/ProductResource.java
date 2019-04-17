package com.gubee.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gubee.domain.Product;
import com.gubee.domain.TargetMarket;
import com.gubee.domain.Technology;
import com.gubee.services.ProductService;

@RestController
@RequestMapping(value="/produtos")
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method=RequestMethod.GET)
	public List<Product> getProductList(@RequestParam(value ="mercados",defaultValue = "") String marketsJSON,@RequestParam(value ="tecnologias",defaultValue = "") String stacksJSON) {
		ObjectMapper mapper = new ObjectMapper();
		List<TargetMarket> marketList = new ArrayList<TargetMarket>();
		List<Technology> stackList = new ArrayList<Technology>();
		try {
			if(!stacksJSON.isEmpty()) {
				stackList = mapper.readValue(stacksJSON,new TypeReference<List<Technology>>(){});
			}
			if(!marketsJSON.isEmpty()) {
				marketList = mapper.readValue(marketsJSON,new TypeReference<List<TargetMarket>>(){});
			}
			
		} catch (IOException e) {
			System.out.println("Falha ao carregar JSON: "+ e.getMessage());
		};
		return productService.serchProductList(stackList,marketList);
	}
	
	


}