package fr.maBanque.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.maBanque.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
