package com.uciext.springfw.hw.catalog.model;

import java.lang.StringBuilder;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.uciext.springfw.hw.EStoreApp;

public class Catalog {
    private static Logger logger = Logger.getLogger(Catalog.class.getName());

	// Properties
    private String catalogName;
    private String lastUpdateDate;

    private List<Product> productList;
//    private Map<String, Product> productMap;


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
   
    /*
	public void setCatalogMap(Map<String, Product> value) {
		productMap = value;
	}

	public Map<String, Product> getCatalogMap() {
		return productMap;
	}	
	*/

    public List<Product> getProductList() {
        return productList;
    }
    public void setProductList(List<Product> value) {
        this.productList = value;
    }

    public String toString() {
       StringBuilder buff = new StringBuilder("[Catalog: ")
       .append("catalogName=").append(catalogName)
       .append(", lastUpdateDate=").append(lastUpdateDate)
       .append("]")
       ;

       return buff.toString();
    }
}
