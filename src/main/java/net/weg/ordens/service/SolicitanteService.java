package net.weg.ordens.service;

import net.weg.ordens.model.OrdemDeInstalacao;
import net.weg.ordens.model.Solicitante;
import net.weg.ordens.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitanteService {
    private UsuarioRepository<Solicitante> usuarioRepository;

    public void salvar(Solicitante solicitante) {
        usuarioRepository.save(solicitante);
    }

    public void deletar(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public List<Solicitante> buscar() {
        return usuarioRepository.findAll();
    }

    public Solicitante buscar(Integer id) {
        return usuarioRepository.findById(id).get();
    }
}

