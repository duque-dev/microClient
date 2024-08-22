package co.com.client.model.client.gateways;

import co.com.client.model.client.Client;

public interface ClientRepository {
    Client saveClient (Client client);
    Client updateClient (Client client);
    Client getClientById (Long id);
    void deleteClientById (Long id);
}
