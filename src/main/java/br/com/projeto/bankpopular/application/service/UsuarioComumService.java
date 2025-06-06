package br.com.projeto.bankpopular.application.service;

import br.com.projeto.bankpopular.domain.model.UsuarioComum;
import br.com.projeto.bankpopular.domain.repository.UsuarioComumRepository;
import br.com.projeto.bankpopular.interfaces.dto.input.UsuarioComumInputDTO;
import br.com.projeto.bankpopular.interfaces.dto.output.UsuarioResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UsuarioComumService {

    private final ModelMapper modelMapper;

    private final UsuarioComumRepository usuarioComumRepository;


    public UsuarioComumService(ModelMapper modelMapper, UsuarioComumRepository usuarioComumRepository) {
        this.modelMapper = modelMapper;
        this.usuarioComumRepository = usuarioComumRepository;
    }

    public UsuarioResponseDTO salvar (UsuarioComumInputDTO dto) {
        UsuarioComum usuarioComum = modelMapper.map(dto, UsuarioComum.class);
        UsuarioComum usuarioSalvo = usuarioComumRepository.save(usuarioComum);

        return modelMapper.map(usuarioSalvo, UsuarioResponseDTO.class);

    }


}
