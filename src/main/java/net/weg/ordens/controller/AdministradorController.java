package net.weg.ordens.controller;

import lombok.AllArgsConstructor;
import net.weg.ordens.model.Administrador;
import net.weg.ordens.service.AdministradorService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/administrador")
@AllArgsConstructor
public class AdministradorController {

    private AdministradorService administradorService;

    @GetMapping("/{id}")
    public Administrador buscarUm(@PathVariable(value = "id") Integer id) {
        return administradorService.buscar(id);
    }


    @GetMapping()
    public Collection<Administrador> buscarTodos() {
        return administradorService.buscar();
    }

    @DeleteMapping
    public void deletar(@RequestParam(value = "id") Integer id) {
        administradorService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Administrador administrador) {
        administradorService.salvar(administrador);
    }

    @PutMapping
    public void atualizarCarro(@RequestBody Administrador administrador) {
        administradorService.salvar(administrador);
    }

}