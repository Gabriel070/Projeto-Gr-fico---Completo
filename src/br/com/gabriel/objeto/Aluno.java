package br.com.gabriel.objeto;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private int matricula;
    private List<Nota> notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        notas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Aluno{" + "Nome=" + nome + ", Matricula=" + matricula + "\nNotas:" + notas + '}';
    }

    public double calcularMedia() {
        float somaTotal = 0;
        for (Nota nota : notas) {
            somaTotal += nota.getNota();
        }
        return somaTotal / notas.size();
    }
}