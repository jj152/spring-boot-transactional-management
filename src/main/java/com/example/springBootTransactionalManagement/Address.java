package com.example.springBootTransactionalManagement;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="ADD_INFO")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String address;
	
	// one to one mapping means, one employee stays at one address only
	@OneToOne
	private Employee employee;

}
