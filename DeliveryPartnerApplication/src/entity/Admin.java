package entity;

public class Admin {
private String adminid;
private long adminphno;
private String password;
private String adminname;
public Admin(String adminid, String password) {
	this.adminid = adminid;
	this.password = password;
}
public String getAdminid() {
	return adminid;
}
public void setAdminid(String adminid) {
	this.adminid = adminid;
}
public long getAdminphno() {
	return adminphno;
}
public void setAdminphno(long adminphno) {
	this.adminphno = adminphno;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAdminname() {
	return adminname;
}
public void setAdminname(String adminname) {
	this.adminname = adminname;
}
@Override
public String toString() {
	return "Admin [adminid=" + adminid + ", adminphno=" + adminphno + ", password=" + password + ", adminname="
			+ adminname + "]";
}


}
