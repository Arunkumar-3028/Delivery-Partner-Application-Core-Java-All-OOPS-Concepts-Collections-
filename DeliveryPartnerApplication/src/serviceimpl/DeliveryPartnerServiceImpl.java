package serviceimpl;


import java.util.Scanner;

import dao.DeliveryPartnerRepo;
import entity.Address;
import entity.Admin;
import entity.Customer;
import entity.DeliveryPartner;
import entity.Product;
import exception.UsernotFound;
import service.DeliveryPartnerService;

public class DeliveryPartnerServiceImpl implements DeliveryPartnerService,DeliveryPartnerRepo{
	Scanner scn1=new Scanner(System.in);
	{
		a1.add(new Admin("arun", "3028"));
		a1.add(new Admin("dharshan", "1234"));
		dp1.add(new DeliveryPartner("ak", "ak3028", "1234", 98765, "arunk98", "2424fr"));
		cus1.add(new Customer("12", "surya", 907776465, "mn@gmail.com", new Address(21, "btm", "blore", "kar", "ind", 56009), "PAN656r", "sur"));

	}

	@Override
	public void customersignup() {
		System.out.println("====Enter Customer Details====");
		System.out.println("Enter customer name");
		String cname=scn1.next();
		System.out.println("Enter customer cphno");
		long cphno=scn1.nextLong();
		System.out.println("Enter customer cemail");
		String cemail=scn1.next();
		System.out.println("Enter customer cpan");
		String cpan=scn1.next();
		System.out.println("Enter New Cid");
		String cid=scn1.next();
		System.out.println("Enter New Password");
		String cpassword=scn1.next();
		System.out.println("Enter doornum");
		int doornum=scn1.nextInt();
		System.out.println("Enter street");
		scn1.nextLine();
		String street=scn1.nextLine();
		System.out.println("Enter distrct");
		String district=scn1.next();
		System.out.println("Enter state");
		String state=scn1.next();
		System.out.println("Enter country");
		String country=scn1.next();
		System.out.println("Enter pincode");
		long cpincode=scn1.nextLong();
		Address a1=new Address(doornum, street, district, state, country, cpincode);
		Customer c1=new Customer(cid, cname, cphno, cemail, a1, cpan, cpassword);
		cus1.add(c1);
		//	l1.put(c1.getCid(), c1); this for reference you need to change




	}
	@Override
	public void getcustomerdetails() {
		System.out.println("Enter Cutsomer  Whom You Want To Check");
		String id=scn1.next();
		for(Customer ele:cus1) {
			if(id.equals(ele.getCid())) {
				System.out.println(ele);
			}
		}


	}
	@Override
	public void adminportal() {
		int c=0;
		while(c!=4) {

			System.out.println("===welcome To Admin Portal===");
			System.out.println("Enter Admin Id");
			String adid=scn1.next();
			System.out.println("Enter Password");
			String adpass=scn1.next();
			for(Admin ele:a1) {
				if(adid.equals(ele.getAdminid())&&adpass.equals(ele.getPassword())) {

					System.out.println("===welcome To Admin Portal===");

					while(true) {
						System.out.println("1.Display Customer Details by Id\n2.Display All Customer Details\n3.Create Delivery Partner\n4.Disply All Delivery Partners Present\n5.Exit");
						int s1 =scn1.nextInt();
						switch(s1) {
						case 1:getcustomerdetails();break;
						case 2:System.out.println(cus1);break;
						case 3:addnewdeliverypartner();break;
						case 4:System.out.println(dp1);break;
						case 5:System.out.println("Thank You"); System.exit(0);;break;
						default:System.out.println("Enter valid Details");
						}
					}
				}
				else {
					System.out.println("Incorrect Userid And Password");
					c++;
					break;

				}
			}
		}
		if(c==4) {
			System.out.println("You Entered 3 times Wrong Password");
			System.exit(0);
		}
	}
	@Override
	public void customerportal() {

		int c=0;
		while(c!=4) {

			System.out.println("===welcome To Customer Portal===");
			System.out.println("Enter Custumer Id");
			String cid=scn1.next();
			System.out.println("Enter  customer Password");
			String cpass=scn1.next();
			for(Customer ele:cus1) {
				if(cid.equals(ele.getCid())&&cpass.equals(ele.getCpassword())) {

					while(true) {
						System.out.println("Welcome To Cutomer Portal");
						System.out.println("Enter The Option\n1.Details And Price \n2.To Book Courier\n3.Track Order\n4.exit");
						int ip=scn1.nextInt();
						switch(ip) {
						case 1:
						{
							detailsandprice();
						}
						case 2:{
							System.out.println("Enter \n1. To Same City\n2.To Same State \3.Domestic \4.International");
							int np=scn1.nextInt();
							switch(np) {
							case 1:{
								System.out.println("Enter Product Type");
								String type=scn1.next();
								System.out.println("Enter Product Wight");
								double weight=scn1.nextDouble();
								double productpriceworth=Math.round(weight*40);
								System.out.println("Price To pay To Delivery Partner :"+productpriceworth);
								
                                   Product p=new Product(type, weight, productpriceworth);
                                   pro1.put(ele, p);
							}
							case 2:{
								System.out.println("Enter Product Type");
								String type=scn1.next();
								System.out.println("Enter Product Wight");
								double weight=scn1.nextDouble();
								double productpriceworth=Math.round(weight*70);
								System.out.println("Price To pay To Delivery Partner :"+productpriceworth);
								
                                   Product p=new Product(type, weight, productpriceworth);
                                   pro1.put(ele, p);
							}
							case 3:{
								System.out.println("Enter Product Type");
								String type=scn1.next();
								System.out.println("Enter Product Wight");
								double weight=scn1.nextDouble();
								double productpriceworth=Math.round(weight*120);
								System.out.println("Price To pay To Delivery Partner :"+productpriceworth);
								
                                   Product p=new Product(type, weight, productpriceworth);
                                   pro1.put(ele, p);
							}
							case 4:{
								System.out.println("Enter Product Type");
								String type=scn1.next();
								System.out.println("Enter Product Wight");
								double weight=scn1.nextDouble();
								double productpriceworth=Math.round(weight*1000);
								System.out.println("Price To pay To Delivery Partner :"+productpriceworth);
								
                                   Product p=new Product(type, weight, productpriceworth);
                                   pro1.put(ele, p);
							}
							}
						}
						case 3:{
							//track Order
							
						  System.out.println("Enter Customer Id :");
						}
						case 4:{
							System.out.println("Thank You Visit Again");
							System.exit(0);
						}
						default :System.out.println("Invalid Option");
						}
					}
				}
				else {
					System.out.println("Incorrect Userid And Password");
					c++;
					break;


				}
			}
			if(c==4) {
				System.out.println("You Entered 3 times Wrong Password");
				try {
					throw new UsernotFound("User not Found");
				}
				catch (UsernotFound e) {
					System.err.println("User Not Found");
					System.exit(0);
				}
			}
		}



	}

	@Override
	public void deliverypartnerportal() {

		int c=0;
		while(c!=4) {

			System.out.println("===welcome To Delivery Partner Portal===");
			System.out.println("1.Sign in Using Delivery Partner Id\n2.Sign in Using Mobile Number\n3.Cheack The Courier To Take\n4.Update Status Of Delivery");
			int ip=scn1.nextInt();
			switch(ip) {
			case 1:
			{
				System.out.println("Enter Delivery Partner Id");
				String dpid=scn1.next();
				System.out.println("Enter Password");
				String dppass=scn1.next();
				for(DeliveryPartner ele:dp1) {
					if(dpid.equals(ele.getDpid())&&dppass.equals(ele.getDppassword())) {
						while(true) {
							System.out.println("===welcome To Delivery Partner Portal===");

						}

					}
					else {
						System.out.println("Incorrect Partner id And Password");
						c++;
						break;

					}
				}
			}
			case 2:{
				System.out.println("Enter Delivery Partner Phone Number");
				long dphonenum=scn1.nextLong();
				System.out.println("Enter Password");
				String dppass=scn1.next();
				for(DeliveryPartner ele:dp1) {
					if(dphonenum==ele.getDpphno()&&dppass.equals(ele.getDppassword())) {
						Boolean flag=true;
						while(flag) {
							System.out.println("===welcome To Delivery Partner Portal===");
							System.out.println("1.Check Order To Be Delivered\n2Update The Delivered Order");
							int op=scn1.nextInt();
							switch(op) {
							case 1:{
								//take order


							}
							case 2:{
								//update order status
							}
							}
						}

					}
					else {
						System.out.println("Incorrect Phone Number  And Password");
						c++;
						break;

					}
				}
			}


			}
		}
	}
	@Override
	public void addnewdeliverypartner() {
		System.out.println("Enter Partner Name :");
		String dname=scn1.next();
		System.out.println("Enter Partner id :");
		String did=scn1.next();
		System.out.println("Enter Partner phno :");
		long dphno=scn1.nextLong();
		System.out.println("Enter Partner email :");
		String demail=scn1.next();
		System.out.println("Enter Partner pass :");
		String dpass=scn1.next();
		System.out.println("Enter Partner pancard :");
		String dpan=scn1.next();
		DeliveryPartner d1=new DeliveryPartner(dname, did, dpass, dphno, demail, dpan);
		dp1.add(d1);
		System.out.println("Delivery Partner Added Successfully");
	}
	@Override
	public void detailsandprice() {

		System.out.println("=====Details For Courier=====");
		System.out.println("====same City=====");
		System.out.println("Per Kg 40Rs");
		System.out.println();
		System.out.println("===================");
		System.out.println("====same State=====");
		System.out.println("Per Kg 70Rs");
		System.out.println("===================");
		System.out.println();
		System.out.println("====Domestic=====");
		System.out.println("Per Kg 120Rs");
		System.out.println("===================");
		System.out.println();
		System.out.println("====International=====");
		System.out.println("Per Kg 1000Rs");
		System.out.println("===================");
		System.out.println();




	}


}
