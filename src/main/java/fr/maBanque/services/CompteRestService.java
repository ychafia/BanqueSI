package fr.maBanque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.maBanque.entities.Compte;
import fr.maBanque.metier.CompteMetier;

@RestController
public class CompteRestService {
	@Autowired
	private CompteMetier compteMetier;

	@RequestMapping(value="/BanqueSI/comptes", method=RequestMethod.POST)
	public Compte saveCompte(@RequestBody Compte c) {
		return compteMetier.saveCompte(c);
	}
	@RequestMapping(value="/BanqueSI/comptes/{num}", method=RequestMethod.GET)
	public Compte getCompte(@PathVariable String num) {
		return compteMetier.getCompte(num);
	}
	
}
