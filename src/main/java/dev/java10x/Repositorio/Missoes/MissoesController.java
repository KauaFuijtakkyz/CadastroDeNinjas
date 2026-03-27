package dev.java10x.Repositorio.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("/listar")
    public String listarmissoes(){
        return "missao listada com sucusso";
    }

    @PostMapping("/criar")
    public String criarmissoes(){
        return "missao criada com sucusso";
    }
    @PutMapping("/alterar")
    public String alterarmissao(){
        return "missao altera com sucusso";
    }
    @DeleteMapping("/deletar")
    public String deletarmissoes(){
        return "missao deletada com sucusso";
    }

}
