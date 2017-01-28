package com.uciext.springfw.hw.catalog.service.impl;

import org.apache.log4j.Logger;

import com.uciext.springfw.hw.catalog.model.Catalog;
import com.uciext.springfw.hw.catalog.model.Product;
import com.uciext.springfw.hw.catalog.service.CatalogService;

public class CatalogServiceImpl implements CatalogService {

    private static Logger logger = Logger.getLogger("com.uciext.springfw.hw.catalog.service.impl.CatalogServiceImpl");

    private Catalog mycatalog;
    private Product product;
    
    // Defualt Constructor
	public CatalogServiceImpl() {
	    logger.info("In CatalogServiceImpl()");
	}
	
	// interface method
	public Catalog getCatalog() {
		return mycatalog;
	}

	// class method
	public void setCatalog(Catalog mycatalog) {
		this.mycatalog = mycatalog;
	}
	
	/*
	public Product getProduct(String SKU){
		this.product = product;
	}
	*/
}
