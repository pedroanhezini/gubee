package com.gubee.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gubee.domain.TargetMarket;
import com.gubee.services.TargetMarketService;

@RestController
@RequestMapping(value="/mercados")
public class TargetMarketResource {
	
	@Autowired
	private TargetMarketService marketService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method=RequestMethod.GET)
	public List<TargetMarket> getByName(@RequestParam(value ="nome", defaultValue = "")String name){
		return marketService.serchByName(name);
	}
	
	


}
