package dev.java10x.Repositorio.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasvindas(){
        return "Boas vindas";
    }

    //adicionar ninja(create)
    @PostMapping("/criar")
    public String criarninja() {
        return "ninja criado";
    }

    //mostrar os ninjas(read)
    @GetMapping("/listar")
    public String mostrartodososninjas() {
        return "mostrar ninja";
    }

    //mostrar os ninjas por id(read)
    @GetMapping("/listarID")
    public String mostrartodososninjasporid() {
        return "mostrar ninja por id";
    }

    //alterar dados dos ninjas(update)
    @PutMapping("/alterarID")
    public String alterarninjaporid() {
        return "alterar ninja por ID";
    }

    //deletar ninja(delete)
    @DeleteMapping("/deleteID")
    public String deletarninjaporid(){
        return "deletar ninja por ID";
    }




}
