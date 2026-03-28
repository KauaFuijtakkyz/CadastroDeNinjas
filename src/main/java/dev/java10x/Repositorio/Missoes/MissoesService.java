package dev.java10x.Repositorio.Missoes;

import dev.java10x.Repositorio.Ninjas.Controller.NInjaModel;
import dev.java10x.Repositorio.Ninjas.Controller.NinjaDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MissoesService {
    public MissoesRepository repository;
    private MissoesMapper missoesMapper;

    public MissoesService(MissoesRepository repository, MissoesMapper missoesMapper) {
        this.repository = repository;
        this.missoesMapper = missoesMapper;
    }

    public List<MissoesDTO> listamissoes(){
        List<MIssoesModel> missao = repository.findAll();
        return missao.stream()
                .map(missoesMapper::map)
                .collect(Collectors.toList());
    }
    public List<MissoesDTO> listademissoes(){
        List<MIssoesModel> missao = repository.findAll();
        return missao.stream()
                .map(missoesMapper::map)
                .collect(Collectors.toList());
    }
    public MissoesDTO listarmissoesid(Long id){
        Optional<MIssoesModel> missoesporid = repository.findById(id);
        return missoesporid.map(missoesMapper::map).orElse(null);
    }
    public MissoesDTO criarmissao  (MissoesDTO missoesDTO) {
        MIssoesModel mIssoesModel = missoesMapper.map(missoesDTO);
        mIssoesModel = repository.save(mIssoesModel);
        return missoesMapper.map(mIssoesModel);
    }
    public void deletarmissaoporid(Long id){
        repository.deleteById(id);
    }
    public MissoesDTO atualizarmissao(Long id, MissoesDTO missoesDTO){
        Optional<MIssoesModel> missaoexistente = repository.findById(id);
        if (missaoexistente.isPresent()){
            MIssoesModel missaoatualizada = missoesMapper.map(missoesDTO);
            missaoatualizada.setId(id);
            MIssoesModel missaosalva = repository.save(missaoatualizada);
            return missoesMapper.map(missaosalva);
        }
        return null;
    }

}
