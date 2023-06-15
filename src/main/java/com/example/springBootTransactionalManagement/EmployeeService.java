package com.example.springBootTransactionalManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springBootTransactionalManagement.Address;
import com.example.springBootTransactionalManagement.Employee;
import com.example.springBootTransactionalManagement.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private AddressService addressService;

	@Transactional
	public Employee addEmployee(Employee employee) throws Exception {
		Employee employeeSavedToDB = this.employeeRepository.save(employee);

		Address address = new Address();

		// we will initialize the address object as null if want to check @Transactional annotation working or not
		// address = null;
		
		address.setId(124L);
		address.setAddress("Varanasi1");
		address.setEmployee(employee);

		// calling addAddress() method of AddressService class
		this.addressService.addAddress(address);
		return employeeSavedToDB;
	}
}
