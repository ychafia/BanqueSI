package fr.maBanque.metier;

import fr.maBanque.entities.Compte;

public interface CompteMetier {
	public Compte saveCompte(Compte c);
	public Compte getCompte(String code);
}
