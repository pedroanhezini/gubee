package com.gubee.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gubee.domain.Technology;
import com.gubee.services.TechnologyService;

@RestController
@RequestMapping(value="/tecnologias")
public class TechnologyResource {
	
	@Autowired
	private TechnologyService stackService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method=RequestMethod.GET)
	public List<Technology> getByName(@RequestParam(value ="nome", defaultValue = "")String name){
		return stackService.serchByName(name);
	}
	
	


}
