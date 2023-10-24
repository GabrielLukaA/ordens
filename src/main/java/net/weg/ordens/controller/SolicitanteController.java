package net.weg.ordens.controller;

import lombok.AllArgsConstructor;
import net.weg.ordens.model.Solicitante;
import net.weg.ordens.service.SolicitanteService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/solicitante")
@AllArgsConstructor
public class SolicitanteController {

    private SolicitanteService solicitanteService;

    @GetMapping("/{id}")
    public Solicitante buscarUm(@PathVariable(value = "id") Integer id) {
        return solicitanteService.buscar(id);
    }


    @GetMapping()
    public Collection<Solicitante> buscarTodos() {
        return solicitanteService.buscar();
    }

    @DeleteMapping
    public void deletar(@RequestParam(value = "id") Integer id) {
        solicitanteService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Solicitante solicitante) {
        solicitanteService.salvar(solicitante);
    }

    @PutMapping
    public void atualizarCarro(@RequestBody Solicitante solicitante) {
        solicitanteService.salvar(solicitante);
    }

}