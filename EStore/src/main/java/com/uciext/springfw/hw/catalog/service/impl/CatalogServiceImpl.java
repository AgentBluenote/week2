package com.uciext.springfw.hw.catalog.service.impl;


import org.apache.log4j.Logger;
import java.util.Map;
import java.util.List;

import com.uciext.springfw.hw.catalog.model.Catalog;
import com.uciext.springfw.hw.catalog.model.Product;
import com.uciext.springfw.hw.catalog.service.CatalogService;

public class CatalogServiceImpl implements CatalogService {

    private static Logger logger = Logger.getLogger("com.uciext.springfw.hw.catalog.service.impl.CatalogServiceImpl");

    private Catalog mycatalog;
//    private List<Product> listOfProducts;
    private Map<String, Product> myProductMap;
    
    // Defualt Constructor
	public CatalogServiceImpl() {
	    //logger.info("In CatalogServiceImpl()");
		/*
		listOfProducts = mycatalog.getProductList();
		if(listOfProducts == null){
		 logger.info("list is null");	
		}
		else{
		 logger.info("list is NOT null");	
		}
		*/
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
	
	public Product getProduct( String SKU ){
	    logger.info("Inside getProduct ");
		return myProductMap.get(SKU);
	}

	public void setProducts( Map<String, Product> myProductMap ){
	    logger.info("Inside setProductSSSSSSS");
		this.myProductMap = myProductMap; 

	}
	
}
