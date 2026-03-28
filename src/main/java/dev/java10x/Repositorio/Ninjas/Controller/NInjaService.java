package dev.java10x.Repositorio.Ninjas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NInjaService {

    private NinjaRepository repository;

    public NInjaService(NinjaRepository repository) {
        this.repository = repository;
    }

    public List<NInjaModel> listadeninjas(){
        return repository.findAll();
    }

    public NInjaModel listarninjasID(Long id){
        Optional<NInjaModel> nInjaporid = repository.findById(id);
        return nInjaporid.orElse(null);
    }
    public NInjaModel criarNinja(NInjaModel ninja){
        return repository.save(ninja);
    }
    public void deletarninjaporid(Long id){
     repository.deleteById(id);
    }
    public NInjaModel atualizarninja(Long id, NInjaModel ninjaAtualizado){
        if(repository.existsById(id)){
            ninjaAtualizado.setId(id);
            return repository.save(ninjaAtualizado);
        }
        return null;
    }


}
