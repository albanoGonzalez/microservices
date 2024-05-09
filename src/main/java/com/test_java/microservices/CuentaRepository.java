package com.test_java.microservices;

import org.springframework.data.jpa.repository.JpaRepository;

//with this class I can do the CRUD operations in a relational BBDD

public interface CuentaRepository extends JpaRepository<Cuenta, String> {
    long count(); //total rows in the table
}

