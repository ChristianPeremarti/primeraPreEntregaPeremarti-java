package com.example.primerapreentrega.repository;

import com.example.primerapreentrega.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Cliente, Long> {

}
