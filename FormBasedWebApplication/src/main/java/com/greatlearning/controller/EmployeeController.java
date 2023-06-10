package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.pojo.Employee;

@Controller
@RequestMapping("/employee") // we can write full url on the method also, instead of writing like this
public class EmployeeController {

	@RequestMapping("/registrationForm")
	public String showRegistrationPage(ModelMap model) {

		Employee employee = new Employee();
		model.addAttribute("employee_registration_details", employee);

		return "employee_registration_form";
	}

	@RequestMapping("/processForm")
	public String showProcessForm(@ModelAttribute("employee_registration_details") Employee employee) {
		return "registration-confirmation";
	}

}
