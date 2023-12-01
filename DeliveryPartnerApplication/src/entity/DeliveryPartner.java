package entity;

public class DeliveryPartner {
	private String dpname;
	private String dpid;
	private long dpphno;
	private String dpemail;
	private String dppassword;
	private String dpcpan;

	public DeliveryPartner(String dpname,String dpid, String dppassword, long dpphno, String dpemail, String dpcpan) {
		this.dpname=dpname;
		this.dpid = dpid;
		this.dppassword = dppassword;
		this.dpphno = dpphno;
		this.dpemail = dpemail;
		this.dpcpan = dpcpan;
	}
	public String getDpid() {
		return dpid;
	}
	public void setDpid(String dpid) {
		this.dpid = dpid;
	}
	public long getDpphno() {
		return dpphno;
	}
	public void setDpphno(long dpphno) {
		this.dpphno = dpphno;
	}
	public String getDpemail() {
		return dpemail;
	}
	public void setDpemail(String dpemail) {
		this.dpemail = dpemail;
	}
	public String getDppassword() {
		return dppassword;
	}
	public void setDppassword(String dppassword) {
		this.dppassword = dppassword;
	}
	public String getDpcpan() {
		return dpcpan;
	}
	public void setDpcpan(String dpcpan) {
		this.dpcpan = dpcpan;
	}
	public String getDpname() {
		return dpname;
	}
	public void setDpname(String dpname) {
		this.dpname = dpname;
	}
	@Override
	public String toString() {
		return "DeliveryPartner [dpname=" + dpname + ", dpid=" + dpid + ", dpphno=" + dpphno + ", dpemail=" + dpemail
				+ ", dpcpan=" + dpcpan + "]";
	}


}
