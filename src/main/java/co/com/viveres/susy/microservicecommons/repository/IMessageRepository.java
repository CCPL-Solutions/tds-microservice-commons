package co.com.viveres.susy.microservicecommons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.viveres.susy.microservicecommons.entity.MessageEntity;

@Repository
public interface IMessageRepository extends JpaRepository<MessageEntity, String> {

}
