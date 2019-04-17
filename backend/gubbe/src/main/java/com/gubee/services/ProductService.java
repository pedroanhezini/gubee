package com.gubee.services;

import java.util.List;

import com.gubee.domain.Product;
import com.gubee.domain.TargetMarket;
import com.gubee.domain.Technology;

public interface ProductService {
	public List<Product> serchProductList(List<Technology> stackList, List<TargetMarket> marketList);
}
