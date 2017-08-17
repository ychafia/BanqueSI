package fr.maBanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.maBanque.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {

}
