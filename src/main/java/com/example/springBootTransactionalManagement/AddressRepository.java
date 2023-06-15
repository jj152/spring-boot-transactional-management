package com.example.springBootTransactionalManagement;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springBootTransactionalManagement.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}

