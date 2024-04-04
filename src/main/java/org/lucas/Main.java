package org.lucas;

import org.lucas.classes.Aluno;
import org.lucas.classes.Curso;
import org.lucas.classes.Disciplina;
import org.lucas.classes.Grade;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "Lucas");
        Aluno aluno2 = new Aluno(2, "Gabriel");
        Aluno aluno3 = new Aluno(3, "Pedro");
        Aluno aluno4 = new Aluno(4, "Silvio");
        Aluno aluno5 = new Aluno(5, "Nicholas");
        Aluno aluno6 = new Aluno(6, "Airton");

        Grade g1 = new Grade(253, "BD");
        Curso curso = new Curso(593, "EDS");

        Disciplina disciplina1 = new Disciplina(10, "Java");
        Disciplina disciplina2 = new Disciplina(11, "PB");

        curso.setGrade(g1);
        curso.addAluno(aluno1);
        curso.addAluno(aluno4);
        curso.addAluno(aluno5);

        aluno1.setNome("Luis");

        aluno1.setCurso(curso);
        aluno2.setCurso(curso);
        aluno3.setCurso(curso);
        aluno4.setCurso(curso);
        aluno6.setCurso(curso);
        aluno5.setCurso(curso);

        g1.setCurso(curso);
        g1.addDisciplina(disciplina1);
        g1.addDisciplina(disciplina2);

        disciplina1.addGrade(g1);
        disciplina2.addGrade(g1);

        curso.exibirAlunos();
        System.out.println();
        curso.exibirGrade();
    }
}