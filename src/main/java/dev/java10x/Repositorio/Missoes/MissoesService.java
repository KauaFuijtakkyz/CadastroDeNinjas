package dev.java10x.Repositorio.Missoes;

import dev.java10x.Repositorio.Ninjas.Controller.NInjaModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {
    public MissoesRepository repository;

    public MissoesService(MissoesRepository repository) {
        this.repository = repository;
    }

    public List<MIssoesModel> listademissoes(){
        return repository.findAll();
    }
    public MIssoesModel listarmissoesID(Long id){
        Optional<MIssoesModel> missaoporid = repository.findById(id);
        return missaoporid.orElse(null);
    }
    public MIssoesModel criarMissao(MIssoesModel missao){
        return repository.save(missao);
    }
    public void deletarmissaoporid(Long id){
        repository.deleteById(id);
    }
    public MIssoesModel atualizarmissao(Long id, MIssoesModel missoaAtualizado){
        if(repository.existsById(id)){
            missoaAtualizado.setId(id);
            return repository.save(missoaAtualizado);
        }
        return null;
    }

}
