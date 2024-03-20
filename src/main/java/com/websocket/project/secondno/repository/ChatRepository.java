package com.websocket.project.secondno.repository;

import com.websocket.project.secondno.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



import java.util.List;
import java.util.Objects;

@Repository
public interface ChatRepository extends MongoRepository<Message, Object> {
    List<Message>findByUsername(String username);
}
