package net.weg.ordens.service;

import net.weg.ordens.model.*;
import net.weg.ordens.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtendenteService {
    private UsuarioRepository<Atendente> usuarioRepository;

    public void salvar(Atendente atendente) {
        usuarioRepository.save(atendente);
    }

    public void deletar(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public List<Atendente> buscar() {
        return usuarioRepository.findAll();
    }

    public Atendente buscar(Integer id) {
        return usuarioRepository.findById(id).get();
    }

}
