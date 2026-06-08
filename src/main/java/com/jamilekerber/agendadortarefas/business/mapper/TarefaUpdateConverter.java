package com.jamilekerber.agendadortarefas.business.mapper;

import com.jamilekerber.agendadortarefas.business.dto.TarefasDTO;
import com.jamilekerber.agendadortarefas.infrastucture.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefaUpdateConverter {

    void updateTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity);
}
