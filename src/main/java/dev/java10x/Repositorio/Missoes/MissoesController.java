package dev.java10x.Repositorio.Missoes;

import dev.java10x.Repositorio.Ninjas.Controller.NInjaModel;
import dev.java10x.Repositorio.Ninjas.Controller.NinjaDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    public MissoesService missoesService;
    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }



    @GetMapping("/listar")
    public List<MissoesDTO> listademissoes() {
        return missoesService.listamissoes();
    }

    @GetMapping("/listar/{id}")
    public MissoesDTO listarmissoesporid(@PathVariable Long id) {
        return missoesService.listarmissoesid(id);
    }

    @PostMapping("/criar")
    public MissoesDTO criarmissao(@RequestBody MissoesDTO missao) {
        return missoesService.criarmissao(missao);
    }

    @DeleteMapping("/delete/{id}")
    public void deletarmissaoporid(@PathVariable Long id){
        missoesService.deletarmissaoporid(id);
    }
    @PutMapping("/alterar/{id}")
    public MissoesDTO alterarmissaoporid(@PathVariable Long id,@RequestBody MissoesDTO missaoAtualizada) {
        return missoesService.atualizarmissao(id, missaoAtualizada);
    }

}
