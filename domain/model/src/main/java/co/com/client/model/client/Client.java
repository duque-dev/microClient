package co.com.client.model.client;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    private Long id;
    private String name;
    private String lastName;
    private String phoneNumber;

}
