package com.uciext.springfw.hw.catalog.model;

import java.lang.StringBuilder;

import org.apache.log4j.Logger;

import com.uciext.springfw.hw.EStoreApp;

public class Product{

	// Properties
//    private String catalogName;
//    private String lastUpdateDate;
	  private static Logger logger = Logger.getLogger(Product.class.getName());

    private String SKU = null;
    private String productName;
    private String unitOfMeasure;
    private Double price;
    private Integer availableQuantity;


    public Product(){
    	logger.info("DEBUG: Product()\n\n");
    }

    public Product( String SKU, String productName, 
    				String  unitOfMeasure,  
    				Double price,
					Integer availableQuantity){

//        System.out.println("\n\nDEBUG: Inside Product(String,String,String,Double,Integer)\n\n");
    	logger.info("DEBUG: Inside Product(String,String,String,Double,Integer)\n\n");
        this.SKU = SKU;
        this.productName = productName;
        this.unitOfMeasure = unitOfMeasure;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public String getSKU() {
        return SKU;
    }
    public void setSKU(String value) {
        this.SKU = value;
    }
    
    

    public String getProductName() {
        return productName;
    }
    public void setproductName(String value) {
        this.productName = value;
    }
    
    

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }
    

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double value) {
        this.price = value;
    }
    

    public Integer getAvailableQuantity() {
        return availableQuantity;
        		
    }
    public void setAvailableQuantity(Integer value) {
        this.availableQuantity = value;
    }
    
/*
    public String getCatalogName() {
        return catalogName;
    }
    public void setCatalogName(String value) {
        this.catalogName = value;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }
    public void setLastUpdateDate(String value) {
        this.lastUpdateDate = value;
    }
    */


    //MIKE is this mehtod overriden from object class
    public String toString() {
       StringBuilder buff = new StringBuilder("[Product: ")
       .append("SKU=").append(SKU)
       .append(", productName=").append(productName)
       .append(", unitOfMeasure=").append(unitOfMeasure)
       .append(", price=").append(price)
       .append(", availableQuantity=").append(availableQuantity)
       .append("]")
       ;

       return buff.toString();
    }
}
