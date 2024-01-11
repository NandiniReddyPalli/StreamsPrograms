package com.cnts.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeAfterJoin2015 {
public static void main(String[] args) {
	EmployeeList employeelist = new EmployeeList();
	List<Employee> employeeList = employeelist.list();
    employeeList.stream().filter(f->f.getYearOfJoining()>2015).forEach(e->{System.out.println(e.getName());});
}
}
