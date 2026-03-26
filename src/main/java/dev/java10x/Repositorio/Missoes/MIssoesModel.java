package dev.java10x.Repositorio.Missoes;

import dev.java10x.Repositorio.Ninjas.Controller.NInjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MIssoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    private String nome;
    private String rank;

    @ManyToOne
    @JoinColumn(name = "ninjas_id")
    private NInjaModel ninja;

    @OneToMany(mappedBy = "missoes")
    private List<NInjaModel> ninjas;





}
