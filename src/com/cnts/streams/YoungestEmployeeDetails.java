package com.cnts.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class YoungestEmployeeDetails {
public static void main(String[] args) {
	EmployeeList employeelist = new EmployeeList();
	List<Employee> employeeList = employeelist.list();
	Optional<Employee> optional=employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
	Employee employee = optional.get();
	System.out.println(employee.getAge());
	System.out.println(employee.getName());
	System.out.println(employee.getId());
	System.out.println(employee.getDepartment());
	System.out.println(employee.getSalary());
	System.out.println(employee.getYearOfJoining());
}
}
