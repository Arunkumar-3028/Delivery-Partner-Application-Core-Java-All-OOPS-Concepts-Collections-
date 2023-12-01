package controller;

import java.util.Scanner;

import serviceimpl.DeliveryPartnerServiceImpl;

public class DeliveryPartnerApp {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	DeliveryPartnerServiceImpl d1=new DeliveryPartnerServiceImpl();
	System.out.println("===Welcome To Delivery Partner Application===");
	while(true) {
	System.out.println("1.Customer Login (Existing Customer)\n2.Customer Sign up(New Customer)\n3.Delivery Partner Login\n4.Admin Login\n5.Exit");
	int op=ip.nextInt();
	switch(op) {
	case 1:d1.customerportal();break;
	case 2:d1.customersignup();break;
	case 3:break;
	case 4:d1.adminportal();break;
	case 5: System.out.println("*****Thank You Visit Again*****");
	System.exit(0);
	default:System.out.println("====Enter Valid Option===");
	}
}
}
}
