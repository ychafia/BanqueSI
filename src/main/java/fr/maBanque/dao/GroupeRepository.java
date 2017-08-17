package fr.maBanque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.maBanque.entities.Groupe;

public interface GroupeRepository extends JpaRepository<Groupe, Long>{

}
