package com.jamilekerber.agendadortarefas.business.mapper;

import com.jamilekerber.agendadortarefas.business.dto.TarefasDTO;
import com.jamilekerber.agendadortarefas.infrastucture.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);

}
