package entity;

public class Product {
private  String producttype;
private double productweight;
private double ProductPriceworth;
public Product(String producttype, double productweight, double ProductPriceworth) {
	
	this.producttype = producttype;
	this.productweight = productweight;
	this.ProductPriceworth=ProductPriceworth;
}
public String getProducttype() {
	return producttype;
}
public void setProducttype(String producttype) {
	this.producttype = producttype;
}
public double getProductweight() {
	return productweight;
}
public void setProductweight(double productweight) {
	this.productweight = productweight;
}
public double getProductPriceworth() {
	return ProductPriceworth;
}
public void setProductPriceworth(double ProductPriceworth) {
	this.ProductPriceworth = ProductPriceworth;
}
@Override
public String toString() {
	return "Product [producttype=" + producttype + ", productweight=" + productweight + ", ProductPriceworth="
			+ ProductPriceworth + "]";
}


}
