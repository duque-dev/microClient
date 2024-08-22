package co.com.client.api;
import co.com.client.model.client.Client;
import co.com.client.usecase.client.ClientUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/restaurant/client", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final ClientUseCase clientUseCase;
//    private final MyUseCase useCase;


    @GetMapping(path = "/{id}")
    public ResponseEntity<Client> getOrderById(@PathVariable("id") Long  id) {
//      return useCase.doAction();
        return ResponseEntity.ok(clientUseCase.getClientById(id));
    }

    @PostMapping
    public ResponseEntity<Client> saveOrder(@RequestBody Client client){
        return ResponseEntity.ok(clientUseCase.saveClient(client));
    }
    @PutMapping
    public ResponseEntity<Client> updateOrder(@RequestBody Client client){
        return ResponseEntity.ok(clientUseCase.updateClient(client));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") Long  id) {
        clientUseCase.deleteClientById(id);
        return ResponseEntity.ok("Eliminado exitosamente");
    }
}
