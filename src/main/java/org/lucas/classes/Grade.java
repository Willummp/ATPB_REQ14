package org.lucas.classes;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    private int codigo;
    private String nome;
    private Curso curso;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Grade(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void addDisciplina(Disciplina disciplinas) {
        this.disciplinas.add(disciplinas);
    }
}
