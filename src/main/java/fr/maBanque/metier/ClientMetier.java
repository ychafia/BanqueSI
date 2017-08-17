package fr.maBanque.metier;

import java.util.List;

import fr.maBanque.entities.Client;

public interface ClientMetier {
	public Client saveClient(Client clt);
	public List<Client> listClient();
}
