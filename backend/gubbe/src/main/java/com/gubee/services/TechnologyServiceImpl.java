package com.gubee.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gubee.domain.Technology;
import com.gubee.repositories.TechnologyRepository;

@Service
public class TechnologyServiceImpl implements TechnologyService {

	@Autowired
	private TechnologyRepository repo;

	public List<Technology> serchByName(String name) {
		List<Technology> stackList = repo.findAll();
		stackList = stackList.stream().filter(s -> s.getName().toUpperCase().contains(name.toUpperCase())).collect(Collectors.toList());;
		return stackList;
	}

}
