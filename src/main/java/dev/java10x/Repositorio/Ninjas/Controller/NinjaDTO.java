package dev.java10x.Repositorio.Ninjas.Controller;

import dev.java10x.Repositorio.Missoes.MIssoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    private Long id;
    private String nome;
    private String email;
    private int idade;
    private MIssoesModel missoes;
    private String rank;
}
