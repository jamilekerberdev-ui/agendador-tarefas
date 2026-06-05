package com.jamilekerber.agendadortarefas.infrastucture.repository;

import com.jamilekerber.agendadortarefas.infrastucture.entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {
}
