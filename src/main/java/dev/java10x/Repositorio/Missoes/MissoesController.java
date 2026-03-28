package dev.java10x.Repositorio.Missoes;

import dev.java10x.Repositorio.Ninjas.Controller.NInjaModel;
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
    public List<MIssoesModel> listademissoes() {
        return missoesService.listademissoes();
    }

    @GetMapping("/listar/{id}")
    public MIssoesModel listarmissoesporid(@PathVariable Long id) {
        return missoesService.listarmissoesID(id);
    }

    @PostMapping("/criar")
    public MIssoesModel criarmissao(@RequestBody MIssoesModel missao) {
        return missoesService.criarMissao(missao);
    }

    @PutMapping("/alterar")
    public String alterarmissao(){
        return "missao altera com sucusso";
    }

    @DeleteMapping("/delete/{id}")
    public void deletarmissaoporid(@PathVariable Long id){
        missoesService.deletarmissaoporid(id);
    }
    @PutMapping("/alterar/{id}")
    public MIssoesModel alterarmissaoporid(@PathVariable Long id,@RequestBody MIssoesModel missaoAtualizada) {
        return missoesService.atualizarmissao(id, missaoAtualizada);
    }

}
