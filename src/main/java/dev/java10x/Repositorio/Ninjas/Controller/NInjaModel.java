package dev.java10x.Repositorio.Ninjas.Controller;

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

    @Column (name = "id")
    private Long id;
    @Column (name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;
    @Column(name = "idade")
    private int idade;

    @OneToMany(mappedBy = "ninja")
    private List<MIssoesModel> MissoesList;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MIssoesModel missoes;




}
