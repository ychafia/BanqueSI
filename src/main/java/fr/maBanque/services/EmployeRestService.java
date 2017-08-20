package fr.maBanque.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.maBanque.entities.Employe;
import fr.maBanque.metier.EmployeMetier;

@RestController
public class EmployeRestService {
	@Autowired
	private EmployeMetier employeMetier;

	@RequestMapping(value="/BanqueSI/employes", method=RequestMethod.POST)
	public Employe saveEmpl(@RequestBody Employe e) {
		return employeMetier.saveEmpl(e);
	}
	
	@RequestMapping(value="/BanqueSI/employes", method=RequestMethod.GET)
	public List<Employe> listeEmpl() {
		return employeMetier.listeEmpl();
	}
}
