package net.weg.ordens.controller;

import lombok.AllArgsConstructor;
import net.weg.ordens.model.OrdemDeInstalacao;
import net.weg.ordens.service.OrdemDeInstalacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/ordeminstalacao")
@AllArgsConstructor
public class OrdemDeInstalacaoController {

    private OrdemDeInstalacaoService ordemDeInstalacaoService;

    @GetMapping("/{id}")
    public OrdemDeInstalacao buscarUm(@PathVariable(value = "id") Integer id) {
        return ordemDeInstalacaoService.buscar(id);
    }


    @GetMapping()
    public Collection<OrdemDeInstalacao> buscarTodos() {
        return ordemDeInstalacaoService.buscar();
    }

    @DeleteMapping
    public void deletar(@RequestParam(value = "id") Integer id) {
        ordemDeInstalacaoService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody OrdemDeInstalacao ordemDeInstalacao) {
        ordemDeInstalacaoService.salvar(ordemDeInstalacao);
    }

    @PutMapping
    public void atualizarCarro(@RequestBody OrdemDeInstalacao ordemDeInstalacao) {
        ordemDeInstalacaoService.salvar(ordemDeInstalacao);
    }

}