package com.cnts.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ListOfAllEmployees {
	public static void main(String[] args) {
		EmployeeList employeelist = new EmployeeList();
		List<Employee> employeeList = employeelist.list();

		Map<String, List<Employee>> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		Set<Entry<String, List<Employee>>> entryset = collect.entrySet();

		for (Entry<String, List<Employee>> list : entryset) {

			System.out.println("DepartmentName:"+list.getKey());

			List<Employee> list1 = list.getValue();
			for (Employee list2 : list1) {
				System.out.println("Name:"+list2.getName());
			}

		}
	}
}
