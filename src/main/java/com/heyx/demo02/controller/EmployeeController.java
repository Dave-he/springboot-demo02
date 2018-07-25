package com.heyx.demo02.controller;

import com.heyx.demo02.dao.DepartmentDao;
import com.heyx.demo02.dao.EmployeeDao;
import com.heyx.demo02.entities.Department;
import com.heyx.demo02.entities.Employee;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;

	@Autowired
	DepartmentDao departmentDao;
	//查询所有员工返回页面列表
	@GetMapping("/emps")
	public String list(Model model){

		Collection<Employee> employees = employeeDao.getAll();
		//放在请求域中
		model.addAttribute("emps",employees);

		//thymeleaf默认会拼串
		//calsspath:/templates/xxxx.html
		return "emp/list";
	}

	@GetMapping("/emp")
	public String toAddPage(Model model){

		Collection<Department> departments = departmentDao.getDepartments();
		model.addAttribute("depts",departments);
		return "emp/add";
	}
}
