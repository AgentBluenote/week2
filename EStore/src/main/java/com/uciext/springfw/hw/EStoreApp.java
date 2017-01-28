package com.uciext.springfw.hw;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.apache.log4j.Logger;

import com.uciext.springfw.hw.catalog.model.Catalog;
import com.uciext.springfw.hw.catalog.model.Product;
import com.uciext.springfw.hw.catalog.service.CatalogService;

public class EStoreApp {

  private static Logger logger = Logger.getLogger(EStoreApp.class.getName());

  public static void main(String[] args) throws Exception {
	logger.info("Start");
	
    // Get instance of service class
    BeanFactory factory = new XmlBeanFactory(new ClassPathResource("/META-INF/spring/EStoreContext.xml"));

    CatalogService catalogService = 
    		(CatalogService) factory.getBean("catalogService");

    CatalogService productService = 
    		(CatalogService) factory.getBean("productService");

//    Product        productService = (Product) factory.getBean("productService");

    // Make a call
    Catalog catalog = catalogService.getCatalog();
    Product product = productService.getProduct();

    logger.info("Catalog: \n" + product.toString());

    logger.info("Catalog: \n" + catalog.toString());
  }
}
