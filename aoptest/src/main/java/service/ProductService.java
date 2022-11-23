package service;

import org.springframework.stereotype.Service;

import Vo.ProductVo;

@Service
public class ProductService {
	public ProductVo find(String name) { 
		return new ProductVo(name);
	}
}
