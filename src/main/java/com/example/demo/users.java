package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class users {
	
	@Id
	private String uname;
	private String pno;
	private String psw;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	@Override
	public String toString() {
		return "users [uname=" + uname + ", pno=" + pno + ", psw=" + psw + "]";
	}
	
}
