package demo.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.xl.demo.Application;
import com.xl.demo.model.Employee;
import com.xl.demo.repository.EmployeeRepository;
import com.xl.demo.service.EmployeeService;
import com.xl.demo.web.EmployeeController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class Testconnection {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeController employeeController;
	public void findAllByOrderByNameAsc(){
		List<Employee> employees = employeeRepository.findAllByOrderByNameAsc();
		for(Employee em: employees){
			System.out.println(em);
		}
	}
	
	
}
