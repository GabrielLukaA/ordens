package net.weg.ordens.service;

import net.weg.ordens.model.Atendente;
import net.weg.ordens.model.OrdemDeInstalacao;
import net.weg.ordens.repository.OrdemRepository;
import net.weg.ordens.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdemDeInstalacaoService {
    private UsuarioRepository<OrdemDeInstalacao> usuarioRepository;

    public void salvar(OrdemDeInstalacao ordemDeInstalacao) {
        usuarioRepository.save(ordemDeInstalacao);
    }

    public void deletar(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public List<OrdemDeInstalacao> buscar() {
        return usuarioRepository.findAll();
    }

    public OrdemDeInstalacao buscar(Integer id) {
        return usuarioRepository.findById(id).get();
    }
}
