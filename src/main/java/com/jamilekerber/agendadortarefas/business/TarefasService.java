package com.jamilekerber.agendadortarefas.business;

import com.jamilekerber.agendadortarefas.business.dto.TarefasDTO;
import com.jamilekerber.agendadortarefas.business.mapper.TarefasConverter;
import com.jamilekerber.agendadortarefas.infrastucture.entity.TarefasEntity;
import com.jamilekerber.agendadortarefas.infrastucture.enuns.StatusNotificacaoEnum;
import com.jamilekerber.agendadortarefas.infrastucture.repository.TarefasRepository;
import com.jamilekerber.agendadortarefas.infrastucture.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefasService {

    private final TarefasRepository tarefasRepository;
    private final TarefasConverter tarefaConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefa(String token, TarefasDTO dto){
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        dto.setEmailUsuario(email);
        TarefasEntity entity = tarefaConverter.paraTarefaEntity(dto);
        return tarefaConverter.paraTarefaDTO(tarefasRepository.save(entity));
    }
}
