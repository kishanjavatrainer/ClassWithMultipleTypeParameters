package com.infotech.client;

import com.infotech.generic.MyGenericClass;
import com.infotech.model.Department;
import com.infotech.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
		
		Department department = new Department();
		department.setId(1);
		department.setName("IT");
		
		Employee employee = new Employee();
		employee.setId(288333);
		employee.setName("Joya");
		employee.setSalary(70000.00);
		
		MyGenericClass<Department, Employee> myGenericClass = new MyGenericClass<Department, Employee>(department, employee);
		
		Department dept = myGenericClass.getT();
		
		System.out.println(dept);
		Employee emp = myGenericClass.getU();
		System.out.println(emp);
		
		System.out.println("------------------------------");
		
		MyGenericClass<Integer, String> myGenericClass2 = new MyGenericClass<Integer, String>(109292, "KK");
		
		System.out.println(myGenericClass2.getT()+"\t"+myGenericClass2.getU());
		
	}
}
