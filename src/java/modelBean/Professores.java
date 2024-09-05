/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBean;

import java.sql.Date;

/**
 *
 * @author Senai
 */
public class Professores {
    private int id_professor;
    private String nome;
    private String matricula;
    private Date admissao;
    private String cpf;
    private int area;

    public Professores() {
    }

    public Professores(int id_professor, String nome, String matricula, Date admissao, String cpf, int area) {
        this.id_professor = id_professor;
        this.nome = nome;
        this.matricula = matricula;
        this.admissao = admissao;
        this.cpf = cpf;
        this.area = area;
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    
    
}
