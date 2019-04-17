package com.gubee.services;

import java.util.List;

import com.gubee.domain.Technology;

public interface TechnologyService {
	public List<Technology> serchByName(String name);
}
