package net.weg.ordens.service;

import net.weg.ordens.model.Atendente;
import net.weg.ordens.model.OrdemDeManutencao;
import net.weg.ordens.repository.OrdemRepository;
import net.weg.ordens.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdemDeManutencaoService {
    private UsuarioRepository<OrdemDeManutencao> usuarioRepository;

    public void salvar(OrdemDeManutencao ordemDeManutencao) {
        usuarioRepository.save(ordemDeManutencao);
    }

    public void deletar(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public List<OrdemDeManutencao> buscar() {
        return usuarioRepository.findAll();
    }

    public OrdemDeManutencao buscar(Integer id) {
        return usuarioRepository.findById(id).get();
    }
}
