package com.gubee.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gubee.domain.TargetMarket;
import com.gubee.repositories.TargetMarketRepository;

@Service
public class TargetMarketServiceImpl implements TargetMarketService {

	@Autowired
	private TargetMarketRepository repo;

	public List<TargetMarket> serchByName(String nome) {
		List<TargetMarket> marketList = repo.findAll();
		marketList = marketList.stream().filter(m -> m.getName().toUpperCase().contains(nome.toUpperCase())).collect(Collectors.toList());;
		return marketList;
	}

}
