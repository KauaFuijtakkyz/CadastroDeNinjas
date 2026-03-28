package dev.java10x.Repositorio.Ninjas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NInjaService {

    private NinjaRepository repository;
    private NinjaMapper ninjaMapper;

    public NInjaService(NinjaRepository repository, NinjaMapper ninjaMapper) {
        this.repository = repository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaDTO> listadeninjas(){
        List<NInjaModel> ninjas = repository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    public NinjaDTO listarninjasID(Long id){
        Optional<NInjaModel> nInjaporid = repository.findById(id);
        return nInjaporid.map(ninjaMapper::map).orElse(null);
    }
    public NinjaDTO criarNinja  (NinjaDTO ninjaDTO) {
        NInjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = repository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    public void deletarninjaporid(Long id){
     repository.deleteById(id);
    }
    public NinjaDTO atualizarninja(Long id, NinjaDTO ninjaDTO){
        Optional<NInjaModel> ninjaExistente = repository.findById(id);
        if (ninjaExistente.isPresent()){
            NInjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO);
            ninjaAtualizado.setId(id);
            NInjaModel ninjasalvo = repository.save(ninjaAtualizado);
            return ninjaMapper.map(ninjasalvo);
        }
        return null;
    }


}
