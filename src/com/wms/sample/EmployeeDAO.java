package com.wms.sample;
import java.util.*;

public class EmployeeDAO {

	private Map<String,Employee> empList=new HashMap<String,Employee>();
	
	public EmployeeDAO()
	{
		
		Employee e1=new Employee(1,"a",12.3f);
		Employee e2=new Employee(2,"b",13.3f);
		Employee e3=new Employee(3,"c",14.3f);
		
		empList.put("1",e1);
		empList.put("2",e2);
		empList.put("3",e3);
		
		
	}
	
	
	public  Map<String,Employee>  getEmployees()
	{
		return empList;
	}
	
	
	
}
