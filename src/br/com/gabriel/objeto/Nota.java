package br.com.gabriel.objeto;

public class Nota {

    private String disciplina;
    private TipoAvaliacao tipo;
    private float nota;

    public Nota(String disciplina, TipoAvaliacao tipo, float nota) {
        this.disciplina = disciplina;
        this.tipo = tipo;
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public TipoAvaliacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoAvaliacao tipo) {
        this.tipo = tipo;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "\nDisciplina=" + disciplina + ", Tipo=" + tipo + ", Nota=" + nota;
    }
    
}