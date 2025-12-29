package com.Avi.main;

import com.Avi.dao.EmployeeDaoImpl;

import java.sql.SQLException;

import com.Avi.dao.EmployeeDao;
import com.Avi.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException {

//		Persistent Object
		EmployeeDao edao = new EmployeeDaoImpl();
		Employee emp = new Employee(4, "Sunny", "Male", 67000);
		
		//edao.saveEmp(emp);
		//edao.updateEmp(emp);
		//edao.deleteEmpById(12);
		edao.printAllEmps();
		System.out.println("Query executed...............");

		
	}
}
