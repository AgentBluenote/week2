package com.uciext.springfw.hw.catalog.service.impl;


import org.apache.log4j.Logger;
import java.util.Map;

import com.uciext.springfw.hw.catalog.model.Catalog;
import com.uciext.springfw.hw.catalog.model.Product;
import com.uciext.springfw.hw.catalog.service.CatalogService;

public class CatalogServiceImpl implements CatalogService {

    private static Logger logger = Logger.getLogger("com.uciext.springfw.hw.catalog.service.impl.CatalogServiceImpl");

    private Catalog mycatalog;
    private Product product;
//    private Product product2;
    
    
    private Map<String,Product> pMap;
    
    // Defualt Constructor
	public CatalogServiceImpl() {
	    logger.info("In CatalogServiceImpl()");
	}
	
	
	
	
	//************************************** old stuff
	
	// interface method
	public Catalog getCatalog() {
		return mycatalog;
	}

	// class method
	public void setCatalog(Catalog mycatalog) {
		this.mycatalog = mycatalog;
	}
	
	public Product getProduct(){
		return product;
	}

	public void setProduct(Product product){
		this.product = product; 
	}
}
