package com.ar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.ar.model.Employee;

public class EmpDAO {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int save(Employee e) {
		String query="insert into employee(id,name,salary,image) values("+e.getId()+",'"+e.getName()+"',"+e.getSalary()+","+e.getImage()+")";
		return template.update(query);
	}
	public int update(Employee e) {
		String query="update employee set name='"+e.getName()+"',salary="+e.getSalary()+" where id="+e.getId()+"";
		return template.update(query);
	}
	
	public Employee findOne(Integer id) {
		String query = "select * from employee where id ='"+id+"";
	//	Employee employee = template.query(query);
	//	return template.e
		return null;
	}
	public int delete(int id) {
		String query="delete from employee where id="+id+"";
		return template.update(query);
	}
	public Employee getEmpbyId(int id) {
		
		String query="select * from employee where id=?";
		return template.queryForObject(query, new Object[] {id}, new BeanPropertyRowMapper<Employee>(Employee.class));
	}
	public List<Employee> getAllEmployees() {
		return template.query("select * from employee", new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int i) throws SQLException {
				// TODO Auto-generated method stub
				Employee e=new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getDouble(3));
				return e;
			}
			
		});
	}
}
