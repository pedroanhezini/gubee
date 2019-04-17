package com.gubbe.services;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.gubee.domain.Product;
import com.gubee.domain.TargetMarket;
import com.gubee.domain.Technology;
import com.gubee.repositories.ProductRepository;
import com.gubee.services.ProductServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

	@Mock
	ProductRepository repo;

	@InjectMocks
	ProductServiceImpl productService;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void FilterByStackTest() {
		Technology stack = new Technology();
		stack.setName("Stack Test");
		List<Technology> stackList = new ArrayList<Technology>();
		stackList.add(stack);
		Product product = new Product();
		product.setName("Product Test");
		product.setStack(stackList);
		product.setTargetMarket(new ArrayList<TargetMarket>());
		repo.save(product);
		List<Product> productMockList = new ArrayList<Product>();
		productMockList.add(product);
		when(repo.findAll()).thenReturn(productMockList);
		List<Product> productListTest = productService.serchProductList(stackList, new ArrayList<TargetMarket>());
		assert (productListTest.contains(product));
	}
	
	@Test
	public void FilterByMarketTest() {
		TargetMarket market = new TargetMarket();
		market.setName("Market Test");
		List<TargetMarket> marketList = new ArrayList<TargetMarket>();
		marketList.add(market);
		Product product = new Product();
		product.setName("Product Test");
		product.setStack(new ArrayList<Technology>());
		product.setTargetMarket(marketList);
		repo.save(product);
		List<Product> productMockList = new ArrayList<Product>();
		productMockList.add(product);
		when(repo.findAll()).thenReturn(productMockList);
		List<Product> productListTest = productService.serchProductList(new ArrayList<Technology>(), marketList);
		assert (productListTest.contains(product));
	}

}
