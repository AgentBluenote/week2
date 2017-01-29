package com.uciext.springfw.hw.catalog.model;

import java.lang.StringBuilder;
import java.util.List;

public class Catalog {

	// Properties
    private String catalogName;
    private String lastUpdateDate;
//    private List<Product> productList;

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
    public Product getProductList() {
        return productList;
    }
    public void setLastUpdateDate(Product value) {
        this.productList = value;
    }
    */

    public String toString() {
       StringBuilder buff = new StringBuilder("[DEBUGCatalog: ")
       .append("catalogName=").append(catalogName)
       .append(", lastUpdateDate=").append(lastUpdateDate)
       .append("]")
       ;

       return buff.toString();
    }
}
