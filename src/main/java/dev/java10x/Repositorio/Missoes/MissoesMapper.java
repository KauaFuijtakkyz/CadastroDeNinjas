package dev.java10x.Repositorio.Missoes;

import dev.java10x.Repositorio.Ninjas.Controller.NInjaModel;
import dev.java10x.Repositorio.Ninjas.Controller.NinjaDTO;
import org.springframework.stereotype.Component;

@Component
public class MissoesMapper {

    public MIssoesModel map(MissoesDTO missoesDTO){
        MIssoesModel mIssoesModel = new MIssoesModel();
        mIssoesModel.setId(missoesDTO.getId());
        mIssoesModel.setNome(missoesDTO.getNome());
        mIssoesModel.setDificuldade(missoesDTO.getDificulade());


        return mIssoesModel;
    }
    public MissoesDTO map(MIssoesModel mIssoesModel){
        MissoesDTO missoesDTO = new MissoesDTO();
        missoesDTO.setId(mIssoesModel.getId());
        missoesDTO.setNome(mIssoesModel.getNome());
        missoesDTO.setDificulade(mIssoesModel.getDificuldade());


        return missoesDTO;
    }
}
