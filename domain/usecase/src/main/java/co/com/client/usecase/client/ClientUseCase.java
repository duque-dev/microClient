package co.com.client.usecase.client;

import co.com.client.model.client.Client;
import co.com.client.model.client.gateways.ClientRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class ClientUseCase {
    //private final ClientRepository clientRepository;

    public Client saveClient(Client client) {

        //return clientRepository.saveClient(client);
        return (client);
    }

    public Client updateClient(Client client) {

        //return clientRepository.updateClient(client);
        return updateClient(client);
    }

    public Client getClientById(Long id) {

        //return clientRepository.getClientById(id);
        return getClientById(id);
    }

    public void deleteClientById(Long id) {
        //clientRepository.deleteClientById(id);
        System.out.println("deleted");
    }
}
