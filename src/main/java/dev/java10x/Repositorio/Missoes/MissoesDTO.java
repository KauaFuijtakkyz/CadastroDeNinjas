package dev.java10x.Repositorio.Missoes;

import dev.java10x.Repositorio.Ninjas.Controller.NinjaDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissoesDTO {

    private Long id;
    private String nome;
    private String dificulade;
    private List<NinjaDTO> ninjas;
}
