package dev.java10x.Repositorio.Ninjas.Controller.Service;

import dev.java10x.Repositorio.Missoes.MIssoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NInjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;
    private String nome;
    private String email;
    private int idade;


    private List<MIssoesModel> mIssoesList;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MIssoesModel missoes;




}
