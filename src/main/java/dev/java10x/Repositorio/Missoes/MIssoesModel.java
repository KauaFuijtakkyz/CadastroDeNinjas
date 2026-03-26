package dev.java10x.Repositorio.Missoes;

import dev.java10x.Repositorio.Ninjas.Controller.Service.NInjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "td_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MIssoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    private String nome;
    private String rank;

    @OneToMany(mappedBy = "missoes")
    private List<NInjaModel> ninjalist;





}
