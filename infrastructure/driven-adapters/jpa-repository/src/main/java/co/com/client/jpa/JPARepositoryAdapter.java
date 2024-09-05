package co.com.client.jpa;

import co.com.client.jpa.helper.AdapterOperations;
import co.com.client.model.client.Client;
import co.com.client.model.client.gateways.ClientRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<Client, ClientEntity, Long, JPARepository>
    implements ClientRepository
// implements ModelRepository from domain
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d,Client.class));
    }

    @Override
    public Client saveClient(Client client) {
        return (Client) this.toEntity((ClientEntity)
                ((JPARepository)this.repository).save((ClientEntity) this.toData(client)));
    }

    @Override
    public Client updateClient(Client client) {
        return (Client) this.toEntity((ClientEntity)
                ((JPARepository)this.repository).save((ClientEntity) this.toData(client)));
    }

    @Override
    public Client getClientById(Long id) {
        return this.toEntity(this.repository.findById((id)).orElse(new ClientEntity()));
    }

    @Override
    public void deleteClientById(Long id) {
        ((JPARepository)this.repository).deleteById((id));
    }
}
