package com.gubee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gubee.domain.Technology;

public interface TechnologyRepository extends JpaRepository<Technology,Integer> {

	
}
