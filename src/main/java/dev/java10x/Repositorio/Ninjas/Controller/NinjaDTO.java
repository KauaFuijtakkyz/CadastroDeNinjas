package dev.java10x.Repositorio.Ninjas.Controller;

import dev.java10x.Repositorio.Missoes.MIssoesModel;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
