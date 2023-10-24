package net.weg.ordens.controller;

import lombok.AllArgsConstructor;
import net.weg.ordens.model.OrdemDeManutencao;
import net.weg.ordens.service.OrdemDeManutencaoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/ordemmanutencao")
@AllArgsConstructor
public class OrdemDeManutencaoController {

    private OrdemDeManutencaoService ordemDeManutencaoService;

    @GetMapping("/{id}")
    public OrdemDeManutencao buscarUm(@PathVariable(value = "id") Integer id) {
        return ordemDeManutencaoService.buscar(id);
    }


    @GetMapping()
    public Collection<OrdemDeManutencao> buscarTodos() {
        return ordemDeManutencaoService.buscar();
    }

    @DeleteMapping
    public void deletar(@RequestParam(value = "id") Integer id) {
        ordemDeManutencaoService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody OrdemDeManutencao ordemDeManutencao) {
        ordemDeManutencaoService.salvar(ordemDeManutencao);
    }

    @PutMapping
    public void atualizarCarro(@RequestBody OrdemDeManutencao ordemDeManutencao) {
        ordemDeManutencaoService.salvar(ordemDeManutencao);
    }

}