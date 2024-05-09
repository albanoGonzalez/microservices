package com.test_java.microservices;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// This class is where I am going to define the Entity JPA CUENTA
//I am going to create the constructors, getters and setters methods. 
@Entity
public class Cuenta {
    @Id //check it out
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String nombre;
	private Integer saldo;

	// Constructor with parameters
	public Cuenta(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	// Getters y setters
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
	

}
