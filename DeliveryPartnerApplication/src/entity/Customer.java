package entity;

public class Customer {
	private String cid;
	private String cname;
	private long cphno;
	private String cemail;
	private Address address;
	private String cpan;
	private String cpassword;
	private double camt;
	
	public Customer(String cid ,String cname,  long cphno, String cemail, entity.Address address, String cpan,String cpassword) {
		this.cid=cid;
		this.cname = cname;
		this.cphno = cphno;
		this.cemail = cemail;
		this.address = address;
		this.cpan = cpan;
		this.cpassword=cpassword;
	}
	
	
	public Customer(long cphno, String cpassword) {
		this.cphno = cphno;
		this.cpassword = cpassword;
	}


	public Customer(String cemail, String cpassword) {
		super();
		this.cemail = cemail;
		this.cpassword = cpassword;
	}


	public String getCid() {
		return cid;
	}


	public void setCid(String cid) {
		this.cid = cid;
	}


	public String getCpassword() {
		return cpassword;
	}


	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}


	public double getCamt() {
		return camt;
	}

	public void setCamt(double camt) {
		this.camt = camt;
	}

	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getCphno() {
		return cphno;
	}
	public void setCphno(long cphno) {
		this.cphno = cphno;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getCpan() {
		return cpan;
	}
	public void setCpan(String cpan) {
		this.cpan = cpan;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cphno=" + cphno + ", cemail=" + cemail + ", address="
				+ address + ", cpan=" + cpan +  ", camt=" + camt + "]";
	}



}
