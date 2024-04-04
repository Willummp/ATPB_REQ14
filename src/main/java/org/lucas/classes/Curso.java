package org.lucas.classes;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int codigo;
    private String nome;
    private List<Aluno> alunos;
    private Grade grade;

    public Curso(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Curso(int codigo, String nome, Grade grade) {
        this.codigo = codigo;
        this.nome = nome;
        this.grade = grade;
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

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void exibirAlunos() {
        System.out.println(" > Curso  : " + this.nome);
        System.out.println(" > Alunos  :");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }
    public void addAluno(Aluno aluno) {
        if(alunos == null) {
            alunos = new ArrayList<>();
            alunos.add(aluno);
        } else {
            alunos.add(aluno);
        }
    }
    public void exibirGrade() {
        System.out.println(this.nome);
        List<Disciplina> disciplinasGrade = grade.getDisciplinas();

        System.out.println(" > Matérias da Grade:  ");
        for (Disciplina disciplina : disciplinasGrade) {
            System.out.println(disciplina.getNome());
        }
    }


}
