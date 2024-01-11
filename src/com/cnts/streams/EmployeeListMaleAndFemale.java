package com.cnts.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeListMaleAndFemale {
	public static void main(String[] args) {

		EmployeeList employeelist = new EmployeeList();
		List<Employee> employeeList = employeelist.list();
		Map<String, Long> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(collect);

	}

}
