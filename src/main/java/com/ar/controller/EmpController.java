package com.ar.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.ar.dao.EmpDAO;
import com.ar.model.Employee;

@Controller
public class EmpController {
	
	@Autowired
	EmpDAO dao;
    
	@RequestMapping(value="/empform")
	public ModelAndView showform() {
		return new ModelAndView("empform", "command", new Employee());
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Employee emp) {
		dao.save(emp);
		return new ModelAndView("redirect:/viewemp");
	}
	
	@RequestMapping(value="/viewemp")
	public ModelAndView view() {
		List<Employee> list=dao.getAllEmployees();
		return new ModelAndView("viewemp", "list",list);
	}
	
	@RequestMapping(value="/editempform/{id}")
	public ModelAndView edit(@PathVariable int id) {
		Employee emp=dao.getEmpbyId(id);
		return new ModelAndView("editempform", "command", emp);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id) {
		dao.delete(id);
		return new ModelAndView("redirect:/viewemp");
	}
	
	/*public ModelAndView saveImage(@RequestParam("id") Integer id,@RequestParam("file") MultipartFile file) {
		Employee emp = dao
		dao.update(e)
		return null;
	
		
	}*/
	@RequestMapping(value="/editsave",method=RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("emp") Employee emp) {
		dao.update(emp);
		return new ModelAndView("redirect:/viewemp");
	}
	

}
