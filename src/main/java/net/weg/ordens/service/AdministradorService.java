package net.weg.ordens.service;

import net.weg.ordens.model.Administrador;
import net.weg.ordens.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorService {
    private UsuarioRepository<Administrador> usuarioRepository;

    public void salvar(Administrador administrador) {
        usuarioRepository.save(administrador);
    }

    public void deletar(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public List<Administrador> buscar() {
        return usuarioRepository.findAll();
    }

    public Administrador buscar(Integer id) {
        return usuarioRepository.findById(id).get();
    }


}
