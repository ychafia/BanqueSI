package fr.maBanque.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.maBanque.entities.Client;
import fr.maBanque.metier.ClientMetier;

@RestController
public class ClientRestService {
	@Autowired
	private ClientMetier clientMetier;

	@RequestMapping(value="/BanqueSI/clients", method=RequestMethod.POST)
	public Client saveClient(@RequestBody Client clt) {
		return clientMetier.saveClient(clt);
	}
	@RequestMapping(value="/BanqueSI/clients", method=RequestMethod.GET)
	public List<Client> listClient() {
		return clientMetier.listClient();
	}
}
