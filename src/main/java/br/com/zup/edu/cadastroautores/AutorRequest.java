package br.com.zup.edu.cadastroautores;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AutorRequest {

    @NotBlank(message = "O campo nome é obrigatório")
    @Size(max = 120, message = "O campo tem que ter no máximo 120 caracteres")
    private String nome;

    @NotBlank(message = "O campo email é obrigatório")
    @Email(message = "O email tem que estar com o formato válido")
    @Size(max = 120, message = "O campo tem que ter no máximo 120 caracteres")
    private String email;

    @NotBlank(message = "O campo descrição é obrigatório")
    @Size(max = 2500, message = "O campo tem que ter no máximo 2500 caracteres")
    private String descricao;

    @NotBlank(message = "O campo cpf é obrigatório")
    @CPF(message = "O CPF tem que estar com o formato válido")
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
