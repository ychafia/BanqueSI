package fr.maBanque.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maBanque.dao.ClientRepository;
import fr.maBanque.entities.Client;

@Service
public class ClientMetierImpl implements ClientMetier {
	@Autowired
	private ClientRepository clientRepo;
	@Override
	public Client saveClient(Client clt) {
		return clientRepo.save(clt);
	}

	@Override
	public List<Client> listClient() {
		return clientRepo.findAll();
	}

}
