package com.usa.misiontic.herramientas.repository;

import com.usa.misiontic.herramientas.entities.Message;
import com.usa.misiontic.herramientas.repository.crudRepository.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }

    public Optional<Message> getMessage(int idMessage){
        return messageCrudRepository.findById(idMessage);
    }
    public Message save(Message c){
        return messageCrudRepository.save(c);
    }
    public void delete(Message c){
        messageCrudRepository.delete(c);
    }

}
