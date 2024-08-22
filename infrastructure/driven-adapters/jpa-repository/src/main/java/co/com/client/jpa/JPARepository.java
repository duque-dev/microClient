package co.com.client.jpa;

import co.com.client.model.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends JpaRepository<ClientEntity, Long> {
}
