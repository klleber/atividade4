package atividade4;


public abstract class Funcionario extends Pessoa{
    private String matricula;
    private String dataPagemento;
    
    abstract public float getSalario();

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataPagemento() {
        return dataPagemento;
    }

    public void setDataPagemento(String dataPagemento) {
        this.dataPagemento = dataPagemento;
    }
    
    
}
