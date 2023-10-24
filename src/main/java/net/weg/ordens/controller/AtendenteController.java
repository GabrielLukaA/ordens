package net.weg.ordens.controller;


import lombok.AllArgsConstructor;
import net.weg.ordens.model.Atendente;
import net.weg.ordens.service.AtendenteService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/atendente")
@AllArgsConstructor
public class AtendenteController {

    private AtendenteService atendenteService;

    @GetMapping("/{id}")
    public Atendente buscarUm(@PathVariable(value = "id") Integer id) {
        return atendenteService.buscar(id);
    }


    @GetMapping()
    public Collection<Atendente> buscarTodos() {
        return atendenteService.buscar();
    }

    @DeleteMapping
    public void deletar(@RequestParam(value = "id") Integer id) {
        atendenteService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Atendente atendente) {
        atendenteService.salvar(atendente);
    }

    @PutMapping
    public void atualizarCarro(@RequestBody Atendente atendente) {
        atendenteService.salvar(atendente);
    }

}