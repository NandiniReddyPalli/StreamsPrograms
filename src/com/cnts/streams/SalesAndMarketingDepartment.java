package com.cnts.streams;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SalesAndMarketingDepartment {
	public static void main(String[] args) {
		EmployeeList employeelist = new EmployeeList();
		List<Employee> employeeList = employeelist.list();
		Map<String, Long> collect1 = employeeList.stream()
				.filter(f -> f.getDepartment() == "Sales"||f.getDepartment()=="Marketing")
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		collect1.entrySet().forEach(e->{
			System.out.println(e.getKey()+" "+e.getValue());
		});
	}
}
