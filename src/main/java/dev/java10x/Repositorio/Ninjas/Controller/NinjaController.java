package dev.java10x.Repositorio.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    private NInjaService nInjaService;

    public NinjaController(NInjaService nInjaService) {
        this.nInjaService = nInjaService;
    }

    @GetMapping("/boasvindas")
    public String boasvindas(){
        return "Boas vindas";
    }

    //adicionar ninja(create)
    @PostMapping("/criar")
    public NinjaDTO criarninja(@RequestBody NinjaDTO nInja) {
        return nInjaService.criarNinja(nInja);
    }

    //mostrar os ninjas(read)
    @GetMapping("/listar")
    public List<NInjaModel> listadeninjas() {
        return nInjaService.listadeninjas();
    }

    //mostrar os ninjas por id(read)
    @GetMapping("/listar/{id}")
    public NInjaModel listarninjasporid(@PathVariable Long id) {
    return nInjaService.listarninjasID(id);
    }

    //alterar dados dos ninjas(update)
    @PutMapping("/alterar/{id}")
    public NInjaModel alterarninjaporid(@PathVariable Long id,@RequestBody NInjaModel ninjaAtualizado) {
        return nInjaService.atualizarninja(id, ninjaAtualizado);
    }

    //deletar ninja(delete)
    @DeleteMapping("/delete/{id}")
    public void deletarninjaporid(@PathVariable Long id){
        nInjaService.deletarninjaporid(id);
    }




}
