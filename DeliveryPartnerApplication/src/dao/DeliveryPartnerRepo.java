package dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import entity.*;
public interface DeliveryPartnerRepo {
	ArrayList<Admin> a1=new ArrayList<Admin>();
	ArrayList<Customer> cus1=new ArrayList<Customer>();
	ArrayList<DeliveryPartner> dp1=new ArrayList<DeliveryPartner>();
	LinkedHashMap<Customer, Product> pro1=new LinkedHashMap<Customer,Product>();
	LinkedHashMap<String, Customer> cusprod2=new LinkedHashMap<String,Customer>();
	LinkedHashMap<String, DeliveryPartner> delprod3=new LinkedHashMap<String,DeliveryPartner>();
	
}
