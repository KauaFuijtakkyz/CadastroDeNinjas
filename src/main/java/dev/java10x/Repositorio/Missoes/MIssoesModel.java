package dev.java10x.Repositorio.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.Repositorio.Ninjas.Controller.NInjaModel;
import dev.java10x.Repositorio.Ninjas.Controller.NinjaDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "TB_MISSOES")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MIssoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    private String nome;
    private String dificuldade;


    @OneToMany(mappedBy = "missoes")
    @JsonIgnore
    private List<NInjaModel> ninjas;





}
