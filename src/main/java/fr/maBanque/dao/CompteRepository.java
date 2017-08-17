package fr.maBanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.maBanque.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long>{

}
