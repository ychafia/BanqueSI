package fr.maBanque.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maBanque.dao.CompteRepository;
import fr.maBanque.entities.Compte;

@Service
public class CompteMetierEmpl implements CompteMetier {
	@Autowired
	private CompteRepository compteRepo;
	
	@Override
	public Compte saveCompte(Compte c) {
		return compteRepo.save(c);
	}

	@Override
	public Compte getCompte(String num) {
		return compteRepo.findOne(num);
	}

}
