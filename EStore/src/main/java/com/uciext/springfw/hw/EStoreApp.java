package com.uciext.springfw.hw;


//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
//import org.springframework.core.io.ClassPathResource;
import org.apache.log4j.Logger;

import java.util.Map; 


import com.uciext.springfw.hw.catalog.model.Catalog;
import com.uciext.springfw.hw.catalog.model.Product;
import com.uciext.springfw.hw.catalog.service.CatalogService;

public class EStoreApp {

  private static Logger logger = Logger.getLogger(EStoreApp.class.getName());

  public static void main(String[] args) throws Exception {
///	logger.info("Start");
	
    // Get instance of service class
    ClassPathXmlApplicationContext context = 
    		new ClassPathXmlApplicationContext("/META-INF/spring/EStoreContext.xml");

    CatalogService catalogService = 
    		(CatalogService) context.getBean("catalogService");
    
    
    // MIKE
    ExpressionParser parser = new SpelExpressionParser();
    StandardEvaluationContext evalContext = new StandardEvaluationContext();

    evalContext.setVariable("myString", "This is it");

    Boolean result = (Boolean) parser.parseExpression( "#myString.endsWith('it')").getValue(evalContext);
    System.out.println("Result +" + result);
    // MIKE
   

    // Make a call
    Catalog catalog = catalogService.getCatalog();
    Integer pro = (catalogService.getProduct("1111").getAvailableQuantity() * 2);
    String pros = String.valueOf(pro);

    Integer pro1 = (   catalogService.getProduct("1111").getAvailableQuantity() * 2  );
    String pros1 = String.valueOf(pro);
//    String pros1 = String.valueOf(  (catalogService.getProduct("1111").getAvailableQuantity() * 2) );

//    String pro = String.valueof((Integer)(catalogService.getProduct("1111").getAvailableQuantity() * 2));
 //   String pros = String.valueOf(pro);

    System.out.println("MIKKKKKKKKKKKK pro = " + pro);


    Product p1 = catalogService.getProduct("1111");
    Product p2 = catalogService.getProduct("2222");
    Product p3 = catalogService.getProduct("3333");
    Product p4 = catalogService.getProduct("4444");

    logger.info("Product: " + p1.toString());
    logger.info("Product: " + p2.toString());
    logger.info("Product: " + p3.toString());
    logger.info("Product: " + p4.toString());

//      Map<String, Product> themap = catalog.getCatalogMap();
 //     System.out.print(themap.size());


//        for (Product element : catalog.getCatalogMap().val
 //j       	System.out.println(element);
   //     }
    
    

    logger.info("Catalog: " + catalog.toString());
  }
  
 
}
