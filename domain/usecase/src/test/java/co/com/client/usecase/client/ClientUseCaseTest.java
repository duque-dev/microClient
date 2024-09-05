package co.com.client.usecase.client;

import co.com.client.model.client.Client;
import co.com.client.model.client.gateways.ClientRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class ClientUseCaseTest {
    ClientUseCase clientUseCase = new ClientUseCase();

    @Test
    public void test1(){
        //Arrange
        Client client = new Client(1L,"Ali","Duq","320");
        //Act
        final Client resultado = clientUseCase.saveClient(client);
        //Assert
        Assertions.assertEquals(client, resultado);
    }
}
