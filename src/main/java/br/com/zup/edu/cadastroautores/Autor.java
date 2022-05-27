package br.com.zup.edu.cadastroautores;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Autor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false, length = 120)
    private String email;

    @Column(nullable = false, length = 2500)
    private String descricao;

    @Column(nullable = false)
    private String cpf;

    public Autor(String nome, String email, String descricao, String cpf) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
        this.cpf = cpf;
    }

    @Deprecated
    public Autor() {
    }

    public Long getId() {
        return id;
    }
}
