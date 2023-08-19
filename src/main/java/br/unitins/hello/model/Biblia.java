package br.unitins.hello.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Biblia extends PanacheEntity {
    
    private String livro;
    private int capitulo;
    private int versiculo;
    public String getLivro() {
        return livro;
    }
    public void setLivro(String livro) {
        this.livro = livro;
    }
    public int getCapitulo() {
        return capitulo;
    }
    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }
    public int getVersiculo() {
        return versiculo;
    }
    public void setVersiculo(int versiculo) {
        this.versiculo = versiculo;
    }

    
}
