package fr.maBanque.metier;

import java.util.List;

import fr.maBanque.entities.Employe;

public interface EmployeMetier {
	public Employe saveEmpl(Employe e);
	public List<Employe> listeEmpl();
}
