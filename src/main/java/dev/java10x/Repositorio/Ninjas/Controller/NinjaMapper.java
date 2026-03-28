package dev.java10x.Repositorio.Ninjas.Controller;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public NInjaModel map(NinjaDTO ninjaDTO){
        NInjaModel nInjaModel = new NInjaModel();
        nInjaModel.setId(ninjaDTO.getId());
        nInjaModel.setNome(ninjaDTO.getNome());
        nInjaModel.setEmail(ninjaDTO.getEmail());
        nInjaModel.setIdade(ninjaDTO.getIdade());
        nInjaModel.setRank(ninjaDTO.getRank());
        nInjaModel.setMissoes(ninjaDTO.getMissoes());

        return nInjaModel;
    }
    public NinjaDTO map(NInjaModel nInjaModel) {
        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setNome(nInjaModel.getNome());
        ninjaDTO.setEmail(nInjaModel.getEmail());
        ninjaDTO.setIdade(nInjaModel.getIdade());
        ninjaDTO.setRank(nInjaModel.getRank());
        ninjaDTO.setMissoes(nInjaModel.getMissoes());

        return ninjaDTO;
    }
}
