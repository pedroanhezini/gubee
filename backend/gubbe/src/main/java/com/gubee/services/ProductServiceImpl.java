package com.gubee.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gubee.domain.Product;
import com.gubee.domain.TargetMarket;
import com.gubee.domain.Technology;
import com.gubee.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repo;

	public List<Product> serchProductList(List<Technology> stackList, List<TargetMarket> marketList) {
		List<Product> productList = repo.findAll();
		List<Product> productListFilter = new ArrayList<Product>();
		productListFilter.addAll(productList.stream().filter(p -> p.getTargetMarket().stream().anyMatch(m -> marketList.contains(m)))
			.collect(Collectors.toList()));
		productListFilter.addAll(productList.stream().filter(p -> p.getStack().stream().anyMatch(s -> stackList.contains(s)))
				.collect(Collectors.toList()));
		if(productListFilter.isEmpty()) {
			return productList;
		}
		return productListFilter;
	}

}
