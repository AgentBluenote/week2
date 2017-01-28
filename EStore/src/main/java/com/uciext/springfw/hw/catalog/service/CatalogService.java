package com.uciext.springfw.hw.catalog.service;

import com.uciext.springfw.hw.catalog.model.Catalog;
import com.uciext.springfw.hw.catalog.model.Product;

public interface CatalogService {
	public Catalog getCatalog();

//	public Product getProduct(String SKU);
	public Product getProduct();
}

