package br.com.zup.edu.cadastroautores;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AutorRequest {

    @NotBlank
    @Size(max = 120)
    private String nome;

    @NotBlank
    @Email
    @Size(max = 120)
    private String email;

    @NotBlank
    @Size(max = 2500)
    private String descricao;

    @NotBlank
    @CPF
    private String cpf;

    public AutorRequest(String nome, String email, String descricao, String cpf) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
        this.cpf = cpf;
    }

    public AutorRequest() {
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCpf() {
        return cpf;
    }

    public Autor toModel() {
        return new Autor(nome, email, descricao, cpf);
    }
}
