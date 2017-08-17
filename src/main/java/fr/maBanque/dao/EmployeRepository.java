package fr.maBanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.maBanque.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long>{

}
