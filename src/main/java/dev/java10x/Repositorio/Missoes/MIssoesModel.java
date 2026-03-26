package dev.java10x.Repositorio.Missoes;

import dev.java10x.Repositorio.Ninjas.Controller.Service.NInjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "td_missoes")
public class MIssoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    private String nome;
    private String rank;

    @OneToMany(mappedBy = "missoes")
    private List<NInjaModel> ninjalist;




    public MIssoesModel() {
    }

    public MIssoesModel(Long id, String nome, String rank) {
        this.id = id;
        this.nome = nome;
        this.rank = rank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
