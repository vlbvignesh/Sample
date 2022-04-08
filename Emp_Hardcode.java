package com.java8;

import java.util.ArrayList;
import java.util.List;

import com.java.interview.program.Employee;

public class Emp_Hardcode {

	public static List<Employee> getListOfEmployee()
	{
		List<Employee> emplist=new ArrayList<>();
		Employee emp1=new Employee(100, "ram", "M", 26, 10000, "IT", 2019);
		Employee emp2=new Employee(101, "hari", "M", 29, 8000, "MECH", 2017);
		Employee emp3=new Employee(102, "magesh", "M", 36, 30000, "IT", 2004);
		Employee emp4=new Employee(103, "janaki", "F", 26, 15000, "CIVIL", 2015);
		Employee emp5=new Employee(104, "vishu", "M", 29, 9000, "IT", 2019);
		Employee emp6=new Employee(105, "kamala", "F", 27, 10000, "CIVIL", 2006);
		emplist.add(emp1);	
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		emplist.add(emp6);
		return emplist;
		
		
	}

}
