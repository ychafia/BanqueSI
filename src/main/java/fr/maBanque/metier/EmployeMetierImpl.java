package fr.maBanque.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maBanque.dao.EmployeRepository;
import fr.maBanque.entities.Employe;

@Service
public class EmployeMetierImpl implements EmployeMetier {
	@Autowired
	private EmployeRepository employeRepo;
	
	@Override
	public Employe saveEmpl(Employe e) {
		return employeRepo.save(e);
	}

	@Override
	public List<Employe> listeEmpl() {
		return employeRepo.findAll();
	}

}
