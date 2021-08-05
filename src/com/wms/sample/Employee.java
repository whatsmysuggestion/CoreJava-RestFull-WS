package com.wms.sample;

public class Employee {

	int eno;
	String ename;
	float esal;
	 
	public Employee(int eno,String ename,float esal) {
	 
		this.ename=ename;
		this.eno=eno;
		this.esal=esal;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}
	
	
  @Override
public String toString() {
	 
	return "Eno: "+eno+"  Ename: "+ename+"  Esal:"+esal;
}
	
	
}
